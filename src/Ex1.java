import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = in.nextLine();
        input  = input.trim();

        String reverse = new StringBuffer(input).reverse().toString();
        System.out.println("1. Reverse string: " + reverse);

        String[] words = input.split(" ");
        System.out.println("2. These are words: ");
        for(String word : words) {

            System.out.println(word);
        }

        String replaced = input.replaceAll(" ", "*");
        System.out.println("3. These is string with replacement: " + replaced);

        String upper = input.toUpperCase();
        System.out.println("4. There is string in upper case: " + upper);

        try {

            String sub = input.substring(4,9);
            System.out.println("5. These is substring from 5 to 10 characters: " + sub);

        } catch (Exception exc) {
            System.out.println("5. The string is too short!");
        }





    }
}
