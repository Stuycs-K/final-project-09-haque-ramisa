import java.math.BigInteger;

public class keyPairGenerator{

	public static void main(String[] args) {
		// args[0] is either public key or private key
		// should only be one arg

		BigInteger[] key;

		BigInteger p = probablePrime(2048, new Random());
		BigInteger q = probablePrime(2048, new Random());
		BigInteger n = p.multiply(q);
		// z is phi(n)
		BigInteger one = 1;
		BigInteger z = (p.subtract(one)).multiply(q.subtract(one));
		// choose an e that is coprime with z
		BigInteger e = 1;
		while(e <=1 && e.gcd(z) != 1){
			e = probablePrime(2048, new Random());
		}

		if(args[0].equals("publickey")){
			key = publicKey(n, e);
		}else if(args[0].equals("privatekey")){
			key = privateKey(n, e, z);
		}
		returnKey(key);

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

	public static BigInteger[] publicKey(BigInteger n, BigInteger e, BigInteger z){
		// z not used here
		BigInteger[] pubKey = new BigInteger[2];
		pubKey[0] = n;
		pubKey[1] = e;
		return pubKey;
	}
	public static BigInteger[] privateKey(BigInteger n, BigInteger e, BigInteger z){
		BigInteger[] privKey = new BigInteger[2];
		privKey[0] = n;
		privKey[1] = e.modPow(-1, z);
		return privKey;
	}

}