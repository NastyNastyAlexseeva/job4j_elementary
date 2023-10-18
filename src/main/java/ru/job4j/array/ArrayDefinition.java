package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new  float[40];

        System.out.println(ages.length + "\n" + surnames.length + '\n' + prices.length);

        String[] names = new String[4];
        names[0] = "Igor";
        names[1] = "Olya";
        names[2] = "Petr";
        names[3] = "Fedya";
        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }
    }
}
