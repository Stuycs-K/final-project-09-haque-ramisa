import java.security.*;
import java.lang.Object;
import java.math.BigInteger;

public class Decode{
	// 1st arg is "file" or "string", 
	// 2nd arg is filename or the ciphertext
	// 3rd arg is priv key
	public static void main(String[] args) {
		if(args[0].equals("string")){
			String ciphtext = args[1];
			byte[] ciphtxt = plaintext.getBytes();
			String [] args = new String[]{"privatekey"};

			BigInteger encrypted = new BigInteger(ciphtxt);
			BigInteger[] key = keyPairGenerator.main(args);

			encrypted.modPow(key[1], key[0]); // plain should now be encrypted

			byte[] decryptedBytes = encrypted.toByteArray();
			String s = new String(decryptedBytes);

		} else if(args[0].equals("file")){
			// reading files
			String [] args = new String[]{"privatekey"};
			BigInteger[] key = keyPairGenerator.main(args);
			byte[] input_bytes = (Files.readAllBytes(Paths.get(args[1])));
			BigInteger encrypted = new BigInteger(input_bytes);
			BigInteger[] key = keyPairGenerator.main(args);

			encrypted.modPow(key[1], key[0]);

			byte[] decryptedBytes = encrypted.toByteArray();
			String s = new String(decryptedBytes);
		}

	}
}