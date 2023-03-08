package Methods;

import java.util.ArrayList;
import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        if(IsPolindrom(number)){
            System.out.println("Number is Polindrom number!");
        }else{
            System.out.println("Number is not Polindrom number!");
        }
    }

    public static boolean IsPolindrom(int number){
        ArrayList<Integer> numberArr = new ArrayList<>();
        int count =0;
        while (number > 0){
            numberArr.add(number % 10);
            number =  number /10;
            count++;
        }

        for(int i=count-1 , j =0; i>=(count/2); i--,j++){
            if(numberArr.get(i) != numberArr.get(j)){
                return false;
            }
        }
        return true;
    }
}
