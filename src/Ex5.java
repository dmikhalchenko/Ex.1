import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex5 {

        public static void main(String[] args) {

            String name = "Дарья Михальченко";
            char[] stringToCharArray = name.toCharArray();
            String tempo = "***** ***********";
            String str = "";
            List<String> used = new ArrayList<>();
            List<Integer> idexies_of_matches = new ArrayList<Integer>();
            Boolean bool = false;

            System.out.println("Вам нужно угадать мое имя и фамилию: " + tempo);

            Scanner in = new Scanner(System.in);

            while(tempo.contains("*")){
                System.out.println("Введите букву:");
                char litera = in.nextLine().charAt(0);

                if (Character.toString(litera).equals(" ")) {
                    System.out.println("Неверно!");
                }
            /* if(Character.toString(litera).trim().length() == 0){
                System.out.println("Вы не ввели ни одного символа!");
            }*/

                if(used.contains(Character.toString(litera))){
                    System.out.println("Вы уже вводили эту букву");
                } else {
                    used.add(Character.toString(litera));
                    char[] myNameChars = tempo.toCharArray();
                    for(int i=0; i<stringToCharArray.length; i++){
                        if(stringToCharArray[i]==litera){
                            idexies_of_matches.add(i);
                            myNameChars[i] = litera;
                            tempo = String.valueOf(myNameChars);
                            bool = true;

                        }
                    }

                    if(bool!=true){
                        System.out.println("К сожалениею такой буквы нет. Попробуйте еще раз :)");
                    }

                    if(tempo.contains("*")) {
                        System.out.println(tempo);
                    } else {
                        System.out.println("Поздравляю! Вы угадали мое имя и фамилию!"+ tempo);
                    }
                }

            }






        }
    }

