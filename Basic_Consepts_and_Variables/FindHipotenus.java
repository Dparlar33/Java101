import java.util.Scanner;
public class FindHipotenus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first edge: ");
        int Firstedge = input.nextInt();

        System.out.println("Enter Second edge: ");
        int Secondedge = input.nextInt();

        System.out.println("Enter Third edge: ");
        int Thirdedge = input.nextInt();

        int U = (Firstedge + Secondedge + Thirdedge) / 2;
        
        System.out.println("Perimeter of triangle: " + 2 * U);
        System.out.println("Area * Area: " + (U* (U-Firstedge) * (U-Secondedge) * (U-Thirdedge)));
    }
}
