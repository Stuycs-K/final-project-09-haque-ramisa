import java.math.BigInteger;
import java.nio.file.*;

public class Encoder{
	// 1st arg is "file" or "string", 
	// 2nd arg is filename or the plaintext
	// 3rd arg is public key
	private BigInteger[] publicKey;

	public Encoder(BigInteger[] publicKey){
		this.publicKey = publicKey;
	}

	// encode(file, filename) or encode(string, plaintext)
	public String encode(String inputType, String text){
		if(inputType.equalsIgnoreCase("string")){
			byte[] plaintxt = text.getBytes();
			BigInteger plainInt = new BigInteger(plaintxt);
			BigInteger n = publicKey[0];
			BigInteger e = publicKey[1];
			BigInteger value = plainInt.modPow(e,n); // plain should now be encrypted
			byte[] encryptedBytes = value.toByteArray();
			String s = new String(encryptedBytes);
			return s;

		} else if(inputType.equalsIgnoreCase("file")){
			try{
				byte[] input_bytes = (Files.readAllBytes(Paths.get(text)));
				BigInteger plainInt = new BigInteger(input_bytes);
				BigInteger n = publicKey[0];
				BigInteger e = publicKey[1];
				BigInteger value = plainInt.modPow(e, n);
				byte[] encryptedBytes = value.toByteArray();
				String s = new String(encryptedBytes);
				return s;
			} catch (Exception e){
			}
		}
		return null;

	}

	public static void main(String[] args) {
		
	}
}