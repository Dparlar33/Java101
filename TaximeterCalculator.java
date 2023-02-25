import java.util.Scanner;
public class TaximeterCalculator {
    public static void main(String[] args) {
        int StartPrice = 10; 
        double PerKMPrice = 2.20;
        
        Scanner input = new Scanner(System.in);
        System.out.println("How many Kilometer you will go");
        float KM = input.nextFloat();

        if (KM < 20) {
            System.out.println("Result: 20 TL");
        }else{
            System.out.println("Result: "+ ((KM*PerKMPrice) + StartPrice) );
        }
    }
}