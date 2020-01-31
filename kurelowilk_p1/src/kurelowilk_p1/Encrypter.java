package kurelowilk_p1;

public class Encrypter {
	
	/* Receives a 4 digit numericalMessage (integer) and returns a encryptedNumericalMessage (integer).
	 *  1. Replace each digit with the result of adding 7 to the digit 
	 *  and getting the remainder after dividing the new value by 10
	 *  
	 *  2.Then swap the first digit with  the third, and swap the second digit with the fourth.
	 *  
	 *  ex -> 1234 (add 7 and mod 10) 8901 -> 0189
	 */
	public static int encrypt(int numericalMessage) {
		
		int[] digitsOfMessage = new int[4];
		
		//Extracts numbers from parameter and encrypts by +7 and mod 10 every digit.
		for(int i = 3;i>=0;i--) {
			digitsOfMessage[i] = (((numericalMessage % 10)+7)%10);
			numericalMessage /= 10;
		}
		// Swaps 1st with 3rd & 2nd with 4th digits.
		for(int i = 0;i<2;i++) { 
			int temp = digitsOfMessage[i];
			digitsOfMessage[i] = digitsOfMessage[i+2];
			digitsOfMessage[i+2] = temp;
		}
		
		int encryptedNumericalMessage = 0;
		
		for(Integer eachDigit:digitsOfMessage) {
			encryptedNumericalMessage = encryptedNumericalMessage * 10 + eachDigit;
		}
		
		return encryptedNumericalMessage;
	}

}
