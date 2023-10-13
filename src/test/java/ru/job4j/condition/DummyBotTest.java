package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class DummyBotTest {
    @Test
    void whenGreetBot() {
        String result = DummyBot.answer("Hi, Bot.");
        assertThat(result).isEqualTo("Hi, SmartAss.");
    }

    @Test
    void whenByeBot() {
        String result = DummyBot.answer("Bye.");
        assertThat(result).isEqualTo( "See you later.");
    }

    @Test
    void whenUnknownBot() {
        String result = DummyBot.answer("Can you add two plus two?");
        assertThat(result).isEqualTo( "I don't know, Please, ask another question.");
    }
}