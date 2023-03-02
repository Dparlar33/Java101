package Loops;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int result=1;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();


        for(int i=number; i>0 ; i--) {
            result = i * result;
        }
        System.out.println(number + " Factoriel : " + result);
    }
  
}
