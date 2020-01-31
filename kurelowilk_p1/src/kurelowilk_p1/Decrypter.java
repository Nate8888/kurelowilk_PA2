package kurelowilk_p1;
public class Decrypter {

	/*
	 * 1. Swap the first digit with the third, and swap the second digit with the fourth.
	 * 
	 * 2. Replace each digit with the result of adding 7 to the digit 
	 *  and getting the remainder after dividing the new value by 10
	 *  (Reverse the encryption)
	 */ 
	public static int decrypt(int encryptedMessage) {
		int[] digitsOfMessage = new int[4];
		

		for(int i = 3;i>=0;i--) {
			
			int rightMostNumber = encryptedMessage%10;
			
			//Since there isn't a way to "reverse" the mod operation. We figure out if our number is >= to 7 and then we - 7.
			if(rightMostNumber>=7) 
				digitsOfMessage[i] = rightMostNumber-7;
			else
				digitsOfMessage[i] = rightMostNumber + 3; // (Add 10), Subtract 7. = +3
			
			encryptedMessage /= 10;
		}
		
		// Swaps 1st with 3rd & 2nd with 4th digits.
		for(int i = 0;i<2;i++) {
			int temp = digitsOfMessage[i];
			digitsOfMessage[i] = digitsOfMessage[i+2];
			digitsOfMessage[i+2] = temp;
		}
		
		int decryptedNumericalMessage = 0;
		
		for(Integer eachDigit:digitsOfMessage) {
			decryptedNumericalMessage = decryptedNumericalMessage * 10 + eachDigit;
		}
		
		return decryptedNumericalMessage;
		
	}

}
