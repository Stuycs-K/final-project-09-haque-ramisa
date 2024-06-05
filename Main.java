import java.math.BigInteger;

public class Main{

	public static void main(String[] args) {
		BigInteger[] privateKey = keyPairGenerator.privateKey();
		BigInteger[] publicKey = keyPairGenerator.publicKey();


		System.out.println("Public key-- "+ publicKey[0]+" "+publicKey[1]);
		System.out.println("Private key-- "+ privateKey[0]+" "+privateKey[1]);
		Encoder encoder = new Encoder(publicKey);
		String text = "W";
		String encodedText = encoder.encode("string", text);

		Decoder decoder = new Decoder(privateKey);
		String decodedText = decoder.decode("string", encodedText);
		System.out.println("plain text: " + text);
		System.out.println("encoded text: " + encodedText);
		System.out.println("decoded text: " + decodedText);

	}
}