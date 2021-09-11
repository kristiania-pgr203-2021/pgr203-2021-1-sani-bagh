package no.kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertToRomanTest {

    @Test
    void shouldConvert1ToI() {
        String res = ConvertToRoman.toRoman(1);
        assertEquals("I", res);
    }
}
