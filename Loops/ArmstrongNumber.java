package Loops;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        int IntLen=0,copyNumber=0 , copyNumber2 =0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a digit!");
        int number = input.nextInt();
        copyNumber = number;
        copyNumber2 = number;
        int result =0, num2 = 0;

        while ( number>0 ){
            number = number / 10;
            IntLen++;
        }
        while ( copyNumber>0 ){
            num2 = copyNumber %10;
            result += Math.pow(num2, IntLen);
            copyNumber = copyNumber / 10;
        }  
        if (result ==copyNumber2){
            System.out.println("Armstrong Number!");
        }else{
            System.out.println("Not Armstrong Number!");
        }
}   
}