package no.kristiania;

public class ConvertToRoman {

    public static String toRoman(int number) {
        String result = "";

        while (number >= 1) {
            result += "I";
            number -= 1;
        }

        return result;
    }
}
