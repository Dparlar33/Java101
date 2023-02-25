
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.println("Enter operation: ");
        String operation = input.next();
        
        System.out.println("Enter second integer: ");
        int number2 = input.nextInt();

       

        switch(operation){
            case "+":
                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println(number1 - number2);
                break;
            case "*":
                System.out.println(number1 * number2);
                break;
            case "/":
                System.out.println(number1 / number2);
                break;
            default:
                System.out.println("Wrong Operation Entered !");
        }
    }
}