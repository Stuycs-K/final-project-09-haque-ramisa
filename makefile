go: Main.class
	@javac keyPairGenerator.java
	@javac Encoder.java
	@javac Decoder.java
	@javac Main.java
	@java Main $(ARGS)
Main.class: Main.java
	@javac Main.java
clean:
	rm -f *.class
