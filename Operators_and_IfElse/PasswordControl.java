
import java.util.Scanner;
public class PasswordControl {
    public static void main(String[] args) {
        String Password = "Parlar",Username ="Deniz";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter password: ");
        String userPass = input.nextLine();

        if( !Password.equals(userPass)) {
            System.out.println("Do you wanna reset your password ? Enter Yes or No");
            String answer = input.nextLine();
            if(answer.equals("Yes")){
                System.out.println("Enter new Password: ");
                String newPassword = input.nextLine();

                if (newPassword.equals(Password)){
                    System.out.println("New password is same with old password !");
                }else{
                    Password =newPassword;
                    System.out.println("New Password: " + Password );
                }
            }else{
                System.out.println("Password will stay same !");
            }
        }else{
            System.out.println("Wrong Password!");
        }
    }
}
