package kurelowilk_p1;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 4 digit integer.");
		int userInput = sc.nextInt();
		
		int encryptedResult = Encrypter.encrypt(userInput);
		String formattedResult = String.format("%04d", encryptedResult);
		
		System.out.println(formattedResult);
		
		int decryptedResult = Decrypter.decrypt(encryptedResult);
		String formattedDecryption = String.format("%04d", decryptedResult);
		
		System.out.println(formattedDecryption);
		
		sc.close();
	}

}
