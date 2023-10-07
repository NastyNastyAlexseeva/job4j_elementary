package ru.job4j.condition;

public class TrgArea {
    static public double area(int a, int b, int c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * ((p - a) * (p - b) * (p - c)));
    }

    static public void main(String[] args) {
        double result = area(2, 2, 2);
        System.out.print(result);
    }
}
