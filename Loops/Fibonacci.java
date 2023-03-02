package Loops;
import java.text.NumberFormat.Style;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter a number for fibonacci: ");
        int number = input.nextInt();
        int first = 0, second=1,sum =0;
        System.out.print(first + " " + second + " ");        
        for(int i=2; i<=number; i++){
            sum = first + second;
            first = second;
            second = sum;
            
            System.out.print(sum + " ");
            
        }
    }
}
