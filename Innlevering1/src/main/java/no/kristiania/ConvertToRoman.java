package no.kristiania;

public class ConvertToRoman {

    public static String toRoman(int number) {
        String result = "";
        while (number >= 10) {
            result += "X";
            number -= 10;
        }
        while (number >= 9) {
            result += "IX";
            number -= 9;
        }
        while (number >= 5) {
            result += "V";
            number -= 5;
        }
        while (number >= 4) {
            result += "IV";
            number -= 4;
        }
        while (number >= 1) {
            result += "I";
            number -= 1;
        }

        return result;
    }
}
