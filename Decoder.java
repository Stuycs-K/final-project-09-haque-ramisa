import java.math.BigInteger;
import java.nio.file.*;

public class Decoder{
	// 1st arg is "file" or "string", 
	// 2nd arg is filename or the ciphertext
	// 3rd arg is priv key

	private BigInteger[] privateKey;

	public Decoder(BigInteger[] privateKey){
		this.privateKey = privateKey;
	}

	public String decode(String inputType, String text){
		if(inputType.equalsIgnoreCase("string")){
			byte[] textBytes = text.getBytes();
			BigInteger plainInt = new BigInteger(textBytes);
			BigInteger n = privateKey[0];
			BigInteger d = privateKey[1];

			BigInteger value = plainInt.modPow(d, n); // plain should now be encrypted

			byte[] decryptedBytes = value.toByteArray();
			String s = new String(decryptedBytes);
			return s;
		} else if(inputType.equalsIgnoreCase("file")){
			try{
				byte[] input_bytes = (Files.readAllBytes(Paths.get(text)));
				BigInteger plainInt = new BigInteger(input_bytes);
				BigInteger n = privateKey[0];
				BigInteger d = privateKey[1];
				BigInteger value = plainInt.modPow(d, n); // plain should now be encrypted
				byte[] decryptedBytes = value.toByteArray();
				String s = new String(decryptedBytes);
				return s;
			}catch(Exception e){
			}	
		} return null;
	}

	public static void main(String[] args) {

	}
}