
import java.util.Scanner;
public class BasicCalculatorGNO {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
     
    System.out.println("Enter Math Note");
    int MathNote = input.nextInt();

    System.out.println("Enter Physics Note");
    int PhysicsNote = input.nextInt();

    System.out.println("Enter Chemic Note");
    int ChemicNote = input.nextInt();

    System.out.println("Enter Turkish Note");
    int TurkishNote = input.nextInt();

    System.out.println("Enter History Note");
    int HistoryNote = input.nextInt();

    System.out.println("Enter Music Note");
    int MusichNote = input.nextInt();
    
    float Avarage = ( MusichNote + HistoryNote + TurkishNote + ChemicNote + PhysicsNote + MathNote ) / 6;
    System.out.println("Avarage: "+ Avarage);
    
    if (Avarage > 60){
        System.out.println("Pass the class");
    }else{
        System.out.println("Not pass the class");
    }
    }
}
