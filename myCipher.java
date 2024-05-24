// File publicKeyFile = new File("public.key");
//     byte[] publicKeyBytes = Files.readAllBytes(publicKeyFile.toPath());

//     KeyFactory keyFactory = KeyFactory.getInstance("RSA");
//     // encoding public key
//     EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(publicKeyBytes);
//     keyFactory.generatePublic(publicKeySpec);

//     String message = "test";
//     Cipher encryptCipher = Cipher.getInstance("RSA");
//     encryptCipher.init(Cipher.ENCRYPT_MODE, publicKey);

// needs to work for both files and  string input--
	// makefile input file name or string 

import java.lang.Object;

public class myCipher{
	public static void main(String[] args) {
		String filename = args[0];

	}



	// all data encryption
	int finalOps(byte[] input){

	}

	//byte[] encryptedBytes =;

}