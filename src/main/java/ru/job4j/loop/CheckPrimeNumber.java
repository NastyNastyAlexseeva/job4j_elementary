package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            } else {
                prime = true;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        check(5);
    }

}
