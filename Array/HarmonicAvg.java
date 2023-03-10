package Array;

import java.util.Scanner;
public class HarmonicAvg {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter arrays limitation: ");
        int limit = input.nextInt();
        
        int[] arr = new int[limit];
        System.out.println("Enter arrays member: ");
        for(int i=0; i<limit;i++){
            arr[i] = input.nextInt();
        }
        Calculator(arr);
    }

    public static void Calculator(int[] arr){
        float HarmonicSeries =0;
        for(int i=0; i < arr.length; i++){
            HarmonicSeries +=  ( 1.0 / (float) arr[i]);
        }

        float HarmonicAvg = (float)(arr.length) / HarmonicSeries;
        System.out.print("Harmonic Avarage of array: " + HarmonicAvg);
    }
}
