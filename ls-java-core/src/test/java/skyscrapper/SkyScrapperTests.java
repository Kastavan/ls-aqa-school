package skyscrapper;

import org.junit.jupiter.api.RepeatedTest;
import ru.ls.qa.school.skyscrapper.SkyScrapper;

import static org.assertj.core.api.Assertions.assertThat;


public class SkyScrapperTests {
    public static int testCalculateGain(SkyScrapper s) {
        int x = s.getFirstFloorFlatSale();
        int m = s.getFreqIncrease();
        int n = s.getFloorsCount();

        int k = n / m;
        int sum = x * n + 1000 * (m * (k - 1) * k / 2 + (n % m) * k);
        return sum;
    }
    @RepeatedTest(100)
    public void totalGainTest(){
        int randMin = 1;
        int randMax = 10000;
        SkyScrapper skyScraper = SkyScrapper.builder()
                .firstFloorFlatSale((int) (Math.random()* (randMax - randMin + 1)) + randMin)
                .floorsCount((int) (Math.random()* (randMax - randMin + 1)) + randMin)
                .freqIncrease((int) (Math.random()* (randMax - randMin + 1)) + randMin)
                .build();
        System.out.println("Стратовая цена: " + skyScraper.getFirstFloorFlatSale() +
                ", количетсво этажей: " + skyScraper.getFloorsCount() +
                ", шаг цены: " + skyScraper.getFreqIncrease());
        int actualResult = skyScraper.totalGain();
        assertThat(actualResult).isEqualTo(testCalculateGain(skyScraper));


    }
}
