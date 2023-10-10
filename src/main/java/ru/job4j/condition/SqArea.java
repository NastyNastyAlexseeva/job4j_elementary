package ru.job4j.condition;

public class SqArea {
    static public double square(int p, double k) {
        return Math.pow(p / (2 * (k + 1)), 2) * k;
    }

    static public void main(String[] args) {
        System.out.println(square(6, 2));
        System.out.println(square(4, 1));
        System.out.println(square(2, 3));
    }
}
