package ru.ls.qa.school.core;

public class PointTask {


    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);

        System.out.println("Расстояние между точками " + point1 + " и " + point2 +
                " равно:" + point2.distance(point1));
    }
}
