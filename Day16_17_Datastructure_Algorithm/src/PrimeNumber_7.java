import java.util.Scanner;
	
public class PrimeNumber_7 {
	public static void main(String[] args) {
		int start = 0;
		int end = 1000;
			System.out.println("Prime numbers between "+start+" and "+end+" are : ");
		int count;		
			for(int i = start ; i <= end ; i++) {
				count = 0;							
				//logic for checking number is prime or not
					for(int j = 1 ; j <= i ; j++) {
						if(i % j == 0)
							count = count+1;
						}
					if(count == 2)
						System.out.println(i);
				}			
		}
}