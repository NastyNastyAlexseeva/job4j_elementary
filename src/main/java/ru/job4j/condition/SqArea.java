package ru.job4j.condition;

public class SqArea {
    static public double square(int p, double k) {
        return Math.pow(p / (2 * (k + 1)), 2) * k;
    }

    static public void main(String[] args) {
        double result = square(6, 2);
        double result2 = square(4, 1);
        System.out.println(result);
        System.out.println(result2);
    }
}
