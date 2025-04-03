package ru.ls.qa.school.core;


public class Point {
    public double x;
    public double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point point){
        double distanceMath = Math.sqrt((Math.pow((this.x - point.x), 2)) + (Math.pow((this.y - point.y), 2)));
        return distanceMath;
    }

    @Override
    public String toString(){
        return "(" + this.x + ";" + this.y +")";
    }
}
