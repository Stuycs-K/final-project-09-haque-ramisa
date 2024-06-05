# This document is required.
- RSA is named after Rivest-Shamir-Adleman
- It is an asymmetric encryption algorithm
- It relies on the difficulty of factoring large prime numbers.
- It is secure because of the practical difficulty of factoring the product of two large prime numbers, aka the "factoring problem"

- RSA keys should be chosen with a sufficiently large modulus to resist attacks
- Common key lengths for RSA are 2048, 3072, or even 4096 bits to ensure security against current and future attacks

- required a public-private key pair: the public key is used for encryption, while the private key is used for decryption
- Encryption involves: first raising the plaintext to the power of the public exponent and then taking the remainder when divided by the public modulus

- Convert the plaintext message into an integer m, where 0 < m < n
- Compute the ciphertext c as c ≡ m^e (mod n). This is done using modular exponentiation

- Decryption involves: raising the ciphertext to the power of the private exponent and then taking the remainder when divided by the private modulus

- Retrieve the ciphertext c
- Compute the plaintext message m as m ≡ c^d (mod n). This is done using modular exponentiation

- keys typically consist of a public key (containing the public exponent and modulus) and a private key (containing the private exponent and modulus)

- - - generating keys
- Select two large prime numbers, p and q
- Calculate their product, n = p * q. This is the modulus
- Calculate Euler's totient function, φ(n) = (p - 1) * (q - 1).
- Choose an integer e such that 1 < e < φ(n) and gcd(e, φ(n)) = 1. This is the public exponent
- Calculate d, the modular multiplicative inverse of e modulo φ(n), i.e., d * e ≡ 1 (mod φ(n)). This is the private exponent
- The public key is (e, n) and the private key is (d, n).

- typically used for securing data transmission, digital signatures, and secure communications over the internet to ensure message integrity and authenticity
- secure communications protocols like HTTPS, SSH, and SSL/TLS
