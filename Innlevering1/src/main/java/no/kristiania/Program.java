package no.kristiania;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println(getInputFromUser());
    }

    public static String getInputFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number you want to convert to Roman number");
        int number = Integer.parseInt(scanner.nextLine());
        String result = ConvertToRoman.toRoman(number);
        return "The roman value of " + number + " is " + result;
    }
}
