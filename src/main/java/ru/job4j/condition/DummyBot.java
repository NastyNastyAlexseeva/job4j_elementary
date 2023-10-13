package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        if ("Hi, Bot.".equals(question)) {
            return "Hi, SmartAss.";
        } else if ("Bye.".equals(question)) {
            return "See you later.";
        } else {
            return "I don't know, Please, ask another question.";
        }

    }

    public static void main(String[] args) {
        System.out.print(answer("Hi, Bot."));
        System.out.print(answer("Bye."));
        System.out.print(answer("Bueeee."));
    }
}
