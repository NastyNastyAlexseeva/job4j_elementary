//package ru.job4j.condition;
//
//import org.junit.jupiter.api.Test;
//import static org.assertj.core.api.Assertions.*;
//import org.junit.After;
//import org.junit.Before;
//
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
//
//class AlertDivByZeroTest {
//    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
//    @Before
//    public void setUpStreams() {
//        System.setOut(new PrintStream(output));
//    }
//
//    @Test
//    void when0toZero() {
//        PrintStream consoleStream = System.out;
//        System.setOut(consoleStream);
//
//        AlertDivByZero.possibleDiv(0);
//        assertThat(AlertDivByZero.byZeroMessage).isEqualTo(output.toString());
//    }
//    @After
//    public void cleanUpStreams() {
//        System.setOut(null);
//    }
//
//}