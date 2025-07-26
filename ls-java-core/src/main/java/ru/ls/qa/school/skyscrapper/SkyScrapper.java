package ru.ls.qa.school.skyscrapper;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class SkyScrapper {
    Integer firstFloorFlatSale;

    Integer floorsCount;

    Integer freqIncrease;

    public int totalGain(){
        int total = 0;
        int currentSale = firstFloorFlatSale;
        for(int i=1; i <= floorsCount; i++){
            total += currentSale;
            if ((i % freqIncrease) == 0){
                currentSale += 1000;
            }
        }
        return total;
    }


}