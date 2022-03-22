
public class PrimeNumber_8 {		  
    public static void main(String args[]) {  				//create FindAllPalPrimeNumber class to get all the ORE number in the given range 
        int startRange=0, endRange=1000;
        	System.out.println("The PalPrime Numbers between " + startRange + " and " + endRange + " are:");  
        for(int i = startRange; i <= endRange; i++){  
            if(checkPalPrimeNumber(i))  
                System.out.println(i);  
        	}  
    	}  
    static boolean checkPalPrimeNumber( int number){          
        int temp, rem, i; 									//declare and initialize variables  
        int count = 0;  
        int sum = 0;             
    		temp = number;  								//store number in a temporary variable temp 
        for(i = 1; i <= temp; i++) {  						//use for loop check whether number is prime or not
            if(temp%i == 0) { 
                count++;    								//increment counter when the reminder is 0  
            	}  
		}   
    while(number > 0) {									//use while loop to check whether the number is palindrome or not   
        rem = number%10; 								// get last digit of the number 
        sum = sum*10+rem; 								// store the digit last digit             
        	number = number/10;  							// extract all digit except the last 
    	}    
    if(temp == sum && count == 2)  						//check whether the number is palindrome and Prime or not 
        return true;  
    else  
        return false;  
    }  
}  