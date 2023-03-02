package Loops;
import java.util.Scanner;
public class EBOB_EKOK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number for EBOB: ");
        int number1 = input.nextInt();
        System.out.println("Enter second number for EBOB: ");
        int number2 = input.nextInt();

        for(int i = number1 ; i>0 ;i--){
            if (number1 % i == 0){
                if(number2 %i ==0 ){
                    System.out.println("Ebob: " + i);
                    break;
                }
            }
        }

        System.out.println("Enter first number for EKOK: ");
        number1 = input.nextInt();
        System.out.println("Enter second number for EKOK: ");
        number2 = input.nextInt();

        for(int i = number1+1 ; ;i++){
            if(i % number1 == 0 ){
                if(i%number2 ==0){
                    System.out.println("Ekok: " + i);
                    break;
                }
            }
        }
    }
}
