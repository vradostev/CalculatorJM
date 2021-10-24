import java.util.Scanner;


public class Input {
        static Scanner scan = new Scanner(System.in);
        public static void main (String[]args){
            String[] a = getInput();
            String firstNum = a[0];
            String secondNum = a[2];
            char operator = a[1].charAt(0);
            Logic.logic(firstNum,secondNum,operator);

        }

        public static String[] getInput(){
            String expr;
            String[] words;

            System.out.print("Введите выражение: ");
            expr = scan.nextLine();
            words = expr.split("\\s");
            return words;
        }



}
