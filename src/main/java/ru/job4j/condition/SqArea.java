package ru.job4j.condition;

public class SqArea {
    static public double square(int p, double k) {
        double h = p / (2 * (k + 1));
        double w = k * h;
        double s = w * h;
        return s;
    }

    static public void main(String[] args) {
        System.out.println(square(6, 2));
        System.out.println(square(4, 1));
        System.out.println(square(2, 3));
    }
}
