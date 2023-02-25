import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        double PI = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius: ");
        int R = input.nextInt();

        double Area =PI * R * R ;
        double Circumference = 2 * PI * R;

        System.out.println("Area: " + Area + " Circumference: " + Circumference);
    }
}
