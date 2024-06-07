encode: Main.class
	@javac keyPairGenerator.java
	@javac Encoder.java
	@javac Decoder.java
	@java Main $(ARGS)
decode: Main.class
	@javac keyPairGenerator.java
	@javac Encoder.java
	@javac Decoder.java
	@java Main $(ARGS)
Main.class: Main.java
	@javac Main.java
clean:
	rm -f *.class
