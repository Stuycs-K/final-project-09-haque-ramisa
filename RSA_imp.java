import java.math.BigInteger;

public class RSA_imp{
	public static void main(String[] args) {
		BigInteger p = probablePrime(2048, new Random());
		BigInteger q = probablePrime(2048, new Random());
		BigInteger n = p * q;
		// z is phi(n)
		BigInteger z = (p-1)*(q-1);
		// choose an e that is coprime with z
		BigInteger e = 1;
		while(e <=1 && gcd(e, z) != 1){
			e = probablePrime(2048, new Random());
		}
		// now msut find d such that (e * d)mod(z)=1
	}


}