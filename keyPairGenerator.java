import java.math.BigInteger;
import java.util.*;

public class keyPairGenerator{
	private static int BIT_LENGTH = 7;
	//private static BigInteger p = BigInteger.probablePrime(BIT_LENGTH, new Random());
	//private static BigInteger q = BigInteger.probablePrime(BIT_LENGTH, new Random());
	private static BigInteger p = new BigInteger("11") ;
	private static BigInteger q = new BigInteger("13") ;
	private static BigInteger n, z;
	//private static BigInteger e = BigInteger.probablePrime(BIT_LENGTH, new Random());
	private static BigInteger e = new BigInteger("17") ;

	static {
		BigInteger[] key;
		n = p.multiply(q);
		// z is phi(n)
		BigInteger one = BigInteger.ONE;
		z = (p.subtract(one)).multiply(q.subtract(one));
		// choose an e that is coprime with z
		//BigInteger gcd = e.gcd(z);
		//System.out.println(" gcd =="+gcd.intValue());
		while( e.gcd(z).intValue() != 1) {
			//System.out.println("hi--" + e.intValue());
			e = BigInteger.probablePrime(BIT_LENGTH, new Random());
			//gcd = e.gcd(z);
		}

		System.out.println("p="+p+"; q="+q+"; e="+e);
	}

	public static void main(String[] args) {
		// args[0] is either public key or private key
		// should only be one arg

		// if(args[0].equals("publickey")){
		// 	key = publicKey(n, e,);
		// }else if(args[0].equals("privatekey")){
		// 	key = privateKey(n, e, z);
		// }
		//returnKey(key);

	}

	//d = e.modPow(-1, z);
	// now msut find d such that (e * d)mod(z)=1
	// public key: (n, e)
	// private key: (n, d)
	// cipher text is C = P^e mod n
	// plain text is P = C^d mod n
	// public static BigInteger inverse(BigInteger e, BigInteger lambda_n){
	// 	return inv;
	// 	// BigInteger has a modPow(bigInt exponent, bigInt m) method that returns (this^exponent) mod m
	// }

	public static BigInteger[] returnKey(BigInteger[] key){
		return key;
	}

	public static BigInteger[] publicKey(){
		// z not used here
		BigInteger[] pubKey = new BigInteger[2];
		pubKey[0] = n;
		pubKey[1] = e;
		return pubKey;
	}
	public static BigInteger[] privateKey(){
		BigInteger[] privKey = new BigInteger[2];
		privKey[0] = n;
		privKey[1] = e.modPow((BigInteger.ZERO).subtract(BigInteger.ONE), z);
		return privKey;
	}

}