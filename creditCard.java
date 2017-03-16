
import java.util.Scanner;

public class creditCard {

    public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
		
		System.out.println ("\nPlease enter your credit card number now: ");
		
		long cNumber = input.nextLong();
		
		boolean result = isValid(cNumber);
		
		int x = sumOfEvenPlace(cNumber);
		
		int y = sumofOddPlace(cNumber);
		int sum = x + y;
		
		if ((sum % 10) == 0) {
			System.out.println (" The credit card number you entered is valid!");
		}
		else 
			System.out.println (" The credit card number you entered is invalid!");
	}

	public static boolean isValid(long number) {
		
		boolean result;
		String strNumber = Long.toString(number);
		int length = strNumber.length();
		
		if ( length < 13 || length > 16) {
		
		System.out.println ("The credit card number you entered is invalid. \n Please try again....");	
			result = false; }
		else 
			result = true;
		return result;
		
	} 
	

	
	public static int sumOfEvenPlace(long number){
		
		String strNumber = Long.toString(number);
		 
		int length = strNumber.length();
		
		int sum = 0;
		
		for (int i = 0; i < length; i = i + 2) {
		
		
		int x = Character.getNumericValue(strNumber.charAt(i));
		
		if ((2 * x) - 10 >= 0)  {
		
		int firstDigit =  ( 2 * x) / 10; 
		int secondDigit = (2 * x) % 10;
		
		int singleDigit = firstDigit + secondDigit;
		
		sum = sum + singleDigit; }
		
		else 
			
		sum = sum + (2 * x);
		
		
			
	}
		                                                            // Get result from step 2
		return sum;
	}
	
	
//	public static int getDigit(int number){
	

		
		/* return this number if it is a single digit, otherwise,
		return the sum of the two digits */
//	}
	
	public static int sumofOddPlace(long number){
	
	
	String strNumber = Long.toString(number);
		 
		int length = strNumber.length();
		
		int sum = 0;
		
		for (int i = 1; i <= length; i = i + 2) {
		
		
		int x = Character.getNumericValue(strNumber.charAt(i));
		
		
		sum = sum + x; 
		
		}
		return sum;
		// return sum of odd place digits in number	} 
	
}






}