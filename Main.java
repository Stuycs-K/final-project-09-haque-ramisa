import java.math.BigInteger;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;


public class Main{

	public static void main(String[] args) {
		BigInteger[] privateKey = keyPairGenerator.privateKey();
		BigInteger[] publicKey = keyPairGenerator.publicKey();

		// args[0] will be string or file
		// args[2] will be text or filename

		Encoder encoder = new Encoder(publicKey);
		String encodedText = "";
		if(args[0].equalsIgnoreCase("string")){
			encodedText = encoder.encode("string", args[1]);
		} else if(args[0].equalsIgnoreCase("file")){
			encodedText = encoder.encode("file", args[1]);
		} 
		System.out.println("ENCODED TEXT: " + encodedText);
		System.out.println();
		System.out.println("PUBLIC KEY: " + Arrays.toString(publicKey));
		System.out.println();
		Decoder decoder = new Decoder(privateKey);
		String decodedText = decoder.decode("string", encodedText);
		System.out.println("DECODED TEXT: " + decodedText);
		System.out.println();
		System.out.println("PRIVATE KEY: " + Arrays.toString(privateKey));
		System.out.println();

		// System.out.println("Public key-- "+ publicKey[0]+" "+publicKey[1]);
		// System.out.println("Private key-- "+ privateKey[0]+" "+privateKey[1]);
		// System.out.println();
		// Encoder encoder = new Encoder(publicKey);
		// String text = "W";
		// String encodedText = encoder.encode("string", text);
		// Decoder decoder = new Decoder(privateKey);
		// String decodedText = decoder.decode("string", encodedText);
		// System.out.println("plain text: " + text);
		// System.out.println("encoded text: " + encodedText);
		// System.out.println("decoded text: " + decodedText);
		// System.out.println();

		// Encoder encoder1 = new Encoder(publicKey);
		// String text1 = "e";
		// String encodedText1 = encoder.encode("string", text1);
		// Decoder decoder1 = new Decoder(privateKey);
		// String decodedText1 = decoder.decode("string", encodedText1);
		// System.out.println("plain text1: " + text1);
		// System.out.println("encoded text1: " + encodedText1);
		// System.out.println("decoded text1: " + decodedText1);
		// System.out.println();

		// Encoder encoder2 = new Encoder(publicKey);
		// String text2 = "hello world!";
		// String encodedText2 = encoder.encode("string", text2);
		// Decoder decoder2 = new Decoder(privateKey);
		// String decodedText2 = decoder.decode("string", encodedText2);
		// System.out.println("plain text2: " + text2);
		// System.out.println("encoded text2: " + encodedText2);
		// System.out.println("decoded text2: " + decodedText2);
		// System.out.println();

		// Encoder encoder3 = new Encoder(publicKey);
		// String text3 = "!@#$%^&*() <> ?//|*\\ thisIsA_LONG+test===";
		// String encodedText3 = encoder.encode("string", text3);
		// Decoder decoder3 = new Decoder(privateKey);
		// String decodedText3 = decoder.decode("string", encodedText3);
		// System.out.println("plain text3: " + text3);
		// System.out.println("encoded text3: " + encodedText3);
		// System.out.println("decoded text3: " + decodedText3);
		// System.out.println();

		// Encoder encoder4 = new Encoder(publicKey);
		// try{
		// 	Arrays.toString(Files.readAllBytes(Paths.get("test1.txt")));
		// }catch(Exception e){
		// }
		
		// String encodedText4 = encoder.encode("file", "test1.txt");
		// Decoder decoder4 = new Decoder(privateKey);
		// String decodedText4 = decoder.decode("string", encodedText4);
		// System.out.println("encoded text4: " + encodedText4);
		// System.out.println("decoded text4: " + decodedText4);
		// System.out.println();
	}
}