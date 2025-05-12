/*
Extract the Digits from a Calculator Input String*/


import java.util.Scanner;

public class W12_P4 {

    // This method takes an input string and returns only the digits from it
    public static String extractDigits(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                result = result + ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
System.out.println(extractDigits(input));
sc.close();
    }
}
