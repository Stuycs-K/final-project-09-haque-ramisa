import java.security.*;
import java.lang.Object;


public class RSAbuiltin{
  public static void main(String[] args) {
    // creating the pair of keys
    KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
    generator.initialize(2048);
    KeyPair pair = generator.generateKeyPair();
    PrivateKey privateKey = pair.getPrivate();
    PublicKey publicKey = pair.getPublic();

    // writing pub key into file
    try (FileOutputStream output = new FileOutputStream("public.key")) {
      output.write(publicKey.getEncoded());
    }
    //writing pub key bytes into file and then into byte array
    File publicKeyFile = new File("public.key");
    byte[] publicKeyBytes = Files.readAllBytes(publicKeyFile.toPath());

    KeyFactory keyFactory = KeyFactory.getInstance("RSA");
    // encoding public key
    EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(publicKeyBytes);
    keyFactory.generatePublic(publicKeySpec);

    String message = "test";
    Cipher encryptCipher = Cipher.getInstance("RSA");
    encryptCipher.init(Cipher.ENCRYPT_MODE, publicKey);

    byte[] messageBytes = message.getBytes(StandardCharsets.UTF_8);)
    byte[] encryptedBytes = encryptCipher.doFinal(messageBytes);

    String encodedMessage = Base64.getEncoder().encodeToString(encryptedBytes);
    Cipher decryptCipher = Cipher.getInstance("RSA");
    decryptCipher.init(Cipher.DECRYPT_MODE, privateKey);
    byte[] decryptedBytes = decryptCipher.doFinal(encryptedBytes);
    String decryptedMessage = new String(decryptedBytes, StandardCharsets.UTF_8);

    // testing equality
    assertEquals(message, decryptedMessage);
  }

  // writing out process:
  /*
  

  */
}
