import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Height: ");
        float Height = input.nextFloat();
        
        System.out.print("Enter Weight: ");
        float Weight = input.nextFloat();

        System.out.println("Body Mass Index: " + (Weight / ( Height * Height )));
    }
}