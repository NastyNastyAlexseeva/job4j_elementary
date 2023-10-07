package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(140F);
        float dollar = rubleToDollar(140F);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 dollars are " + dollar + " dollar.");

        float test = 22E37F;
        System.out.println(test);

    }
}
