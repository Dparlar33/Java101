public class PrimeNumber
{
	public static void main(String[] args) {
		
		for(int i=500;i<600;i++){
		    if(IsPrime(i)){
		        System.out.println(i + " Not Prime");
		    };
		}
	}
	public static boolean IsPrime(int number){
	    for(int j=2;j<number;j++){
	       if(number%j== 0){
	           return false;
	       }
	    }
	    return true;
	}
}