import java.util.Scanner;
public class KDVCalculator {
    public static void main(String[] args) {
        float NewPriceWithKDV,KDV;

        Scanner input = new Scanner(System.in);    
        System.out.println("Enter a price");
        int Price = input.nextInt();

        if(Price>0 && Price<1000){
            KDV=18;
            NewPriceWithKDV = ((Price * KDV ) /100)+ Price;
        }else{
            KDV = 8;
            NewPriceWithKDV = (Price * KDV ) /100 + Price; 
        }

        System.out.println("New Price: " + NewPriceWithKDV);
        System.out.println("KDV: " + (NewPriceWithKDV - Price));

    }
}
