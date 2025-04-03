package ru.ls.qa.school.core;

public class OddTask {

    public static boolean isOdd(int n){
        if (n%2 == 0) {
            System.out.println(n  + " четное, поэтому:");
            return false;
        }
        else {
            System.out.println(n  + " нечетное, поэтому:");
            return true;
        }
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.println(isOdd(a));
        System.out.println(isOdd(b));
    }

}
