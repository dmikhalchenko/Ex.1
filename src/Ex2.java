import java.util.Scanner;

public class Ex2 {


    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter a number of a day: ");
            int input = in.nextInt();

            try {

                if (input > 7) System.out.println("Enter value from 1 to 7!");

            } catch (Exception err) {

                System.out.println(err.getMessage());

            }

            switch (input) {

                case 1: System.out.println("This is Monday");
                    break;

                case 2: System.out.println("This is Tuesday");
                    break;

                case 3: System.out.println("This is Wednesday");
                    break;

                case 4: System.out.println("This is Thursday");
                    break;

                case 5: System.out.println("This is Friday");
                    break;

                case 6: System.out.println("This is Saturday");
                    break;

                case 7: System.out.println("This is Sunday");
                    break;
            }

        }
    }

