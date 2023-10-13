package ru.job4j.condition;

public class AlertDivByZero {
    public static String byZeroMessage = "Could not div by 0.";

    public static void possibleDiv(int number) {

        if (number == 0) {
            System.out.println(byZeroMessage);
        } else if (number < 0) {
            System.out.println("This is negative number");
        }
    }

    public static void main(String[] args) {
        AlertDivByZero.possibleDiv(4);
        AlertDivByZero.possibleDiv(0);
        AlertDivByZero.possibleDiv(-3);
    }
}