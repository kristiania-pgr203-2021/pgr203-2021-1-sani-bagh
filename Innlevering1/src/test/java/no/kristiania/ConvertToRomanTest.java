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

    @Test
    void shouldConvert40ToXL() {
        String res = ConvertToRoman.toRoman(40);
        assertEquals("XL", res);
    }

    @Test
    void shouldConvert90ToL() {
        String res = ConvertToRoman.toRoman(90);
        assertEquals("XC", res);
    }

    @Test
    void shouldConvert555ToDLV() {
        String res = ConvertToRoman.toRoman(555);
        assertEquals("DLV", res);
    }

    @Test
    void shouldConvert4000() {
        String res = ConvertToRoman.toRoman(4000);
        assertEquals("Invalid Roman number", res);
    }
}
