package no.kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertToRomanTest {

    @Test
    void shouldConvert1ToI() {
        String res = ConvertToRoman.toRoman(1);
        assertEquals("I", res);
    }

    @Test
    void shouldConvert6ToVI() {
        String res = ConvertToRoman.toRoman(6);
        assertEquals("VI", res);
    }

    @Test
    void shouldConvert14ToXIV() {
        String res = ConvertToRoman.toRoman(14);
        assertEquals("XIV", res);
    }
}
