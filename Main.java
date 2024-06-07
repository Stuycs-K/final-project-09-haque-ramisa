import java.math.BigInteger;

public class Main{

	public static void main(String[] args) {
		BigInteger[] privateKey = keyPairGenerator.privateKey();
		BigInteger[] publicKey = keyPairGenerator.publicKey();


		System.out.println("Public key-- "+ publicKey[0]+" "+publicKey[1]);
		System.out.println("Private key-- "+ privateKey[0]+" "+privateKey[1]);
		System.out.println();
		Encoder encoder = new Encoder(publicKey);
		String text = "W";
		String encodedText = encoder.encode("string", text);
		Decoder decoder = new Decoder(privateKey);
		String decodedText = decoder.decode("string", encodedText);
		System.out.println("plain text: " + text);
		System.out.println("encoded text: " + encodedText);
		System.out.println("decoded text: " + decodedText);
		System.out.println();

		Encoder encoder1 = new Encoder(publicKey);
		String text1 = "e";
		String encodedText1 = encoder.encode("string", text1);
		Decoder decoder1 = new Decoder(privateKey);
		String decodedText1 = decoder.decode("string", encodedText1);
		System.out.println("plain text1: " + text1);
		System.out.println("encoded text1: " + encodedText1);
		System.out.println("decoded text1: " + decodedText1);
		System.out.println();

		Encoder encoder2 = new Encoder(publicKey);
		String text2 = "1";
		String encodedText2 = encoder.encode("string", text2);
		Decoder decoder2 = new Decoder(privateKey);
		String decodedText2 = decoder.decode("string", encodedText2);
		System.out.println("plain text2: " + text2);
		System.out.println("encoded text2: " + encodedText2);
		System.out.println("decoded text2: " + decodedText2);
		System.out.println();
	}
}