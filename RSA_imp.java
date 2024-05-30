import java.math.BigInteger;

public class RSA_imp{
	public static void main(String[] args) {
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
		d = e.modPow(-1, z);
		// now msut find d such that (e * d)mod(z)=1
		// public key: (n, e)
		// private key: (n, d)
		// cipher text is C = P^e mod n
		// plain text is P = C^d mod n
	}

	// public static BigInteger inverse(BigInteger e, BigInteger lambda_n){
	// 	return inv;
	// 	// BigInteger has a modPow(bigInt exponent, bigInt m) method that returns (this^exponent) mod m
	// }


}