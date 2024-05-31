import java.security.*;
import java.lang.Object;

public class Encode{
	// 1st arg is "file" or "string", 
	// 2nd arg is filename or the plaintext
	// 3rd arg is public key
	public static void main(String[] args) {
		if(args[0].equals("string")){
			String plaintext = args[1];
			String[] key = 
			BigInteger[] key = keyPairGenerator.keyPairGenerator();// key from keyPairGenerator class
		} else if(args[0].equals("file")){
			// reading files
			File file = File(args[1]);
			String file = 
		}

	}