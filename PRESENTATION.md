# Rivest-Shamir-Adleman (RSA) Encryption

## **ASYMMETRIC** Algorithm
RSA encryption relies on an asymmetric algorithm, meaning that the processes for encryption and decryption rely on the creation of two separate keys– a public key used to encrypt data and a private key which is used to decrypt data.
### Key Generation
Each of the keys consists of the **modulus** and its own **exponent**, and is created using the following process:
1. selecting two large prime numbers, p and q
2. calculating their product, n, such that n = p * q *(this is the modulus)*
3. calculating Euler's totient function, φ(n) = (p - 1) * (q - 1)
4. choosing an integer, e, such that 1 < e < φ(n) and gcd(e, φ(n)) = 1 *(this is the public exponent)*
5. calculating the value, d, which is the multiplicative inverse of e module φ(n) *(this is the private exponent)*

  **the public key is (n, e) and the private key is (n, d)** which follow <modulus, exponent>

### Encryption and Decryption Processes
**Encryption** involves first raising the plaintext to the power of the public exponent and then taking the remainder when divided by the public modulus. The plaintext is converted into bytes and then converted into an integer value.
**Decryption** involves first raising the cipher-text to the power of the private exponent and then taking the remainder when divided by the private modulus. This integer value is then converted to bytes, and then back into plaintext.


## What are the advantages of this algorithm?
- RSA keys are often chosen with large modulus, thus making them more **secure**. This is done by choosing values of p and q that are of at least 512 bits (results in around 1024 bit value of n). However, common key lengths are 2048, 3072, or even 4096 bits to ensure security against current and future attacks since the larger the primes, the more difficult it is to factor their product.
- Because RSA is an asymmetric technique, it is a secure way to exchange data **without exchanging a secret key**.

## What are the disadvantages of this algorithm?
- Because of the large keys required for security, RSA encryption and decryption is not very efficient as it requires great amounts of time, computational power, and storage.
- The key-generating process is largely random, and if the two prime numbers are too close, the algorithm is easier to solve.


## Common Usages
The RSA algorithm is typically used for **securing data transmission**, **digital signatures**, and **secure communication protocols** like HTTPS, SSH, and SSL/TLS over the internet to ensure message integrity and authenticity.
