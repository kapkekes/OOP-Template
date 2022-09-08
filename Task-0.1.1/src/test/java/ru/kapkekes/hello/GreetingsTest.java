package ru.kapkekes.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.kapkekes.hello.Greetings.sayHello;

import org.junit.jupiter.api.Test;

public class GreetingsTest {
    @Test
    void become_alive() {
        assertEquals("Hello, World!", sayHello());
    }
}
