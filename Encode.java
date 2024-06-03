import java.security.*;
import java.lang.Object;
import java.math.BigInteger;

public class Encode{
	// 1st arg is "file" or "string", 
	// 2nd arg is filename or the plaintext
	// 3rd arg is public key
	public static void main(String[] args) {
		if(args[0].equals("string")){
			String plaintext = args[1];
			byte[] plaintxt = plaintext.getBytes();
			String [] args = new String[]{"publickey"};

			BigInteger plain = new BigInteger(plaintxt);
			BigInteger[] key = keyPairGenerator.main(args);

			plain.modPow(key[1], key[0]); // plain should now be encrypted

			byte[] encryptedBytes = plain.toByteArray();
			String s = new String(encryptedBytes);

		} else if(args[0].equals("file")){
			// reading files
			String [] args = new String[]{"publickey"};
			BigInteger[] key = keyPairGenerator.main(args);
			byte[] input_bytes = (Files.readAllBytes(Paths.get(args[1])));
			BigInteger plain = new BigInteger(input_bytes);
			BigInteger[] key = keyPairGenerator.main(args);

			plain.modPow(key[1], key[0]);

			byte[] encryptedBytes = plain.toByteArray();
			String s = new String(encryptedBytes);
		}

	}