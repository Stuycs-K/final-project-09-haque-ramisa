key: keyPairGenerator.class
	@java keyPairGenerator $(ARGS)
Encode.class: Encode.java
	@javac Encode.java
decode: Decode.class
	@java Decode $(ARGS)
Decode.class: Decode.java
	@javac Decode.java
crack: Crack.class
	@java Crack $(ARGS)
Crack.class: Crack.java
	@javac Crack.java
getkey: GetKey.class
	@java GetKey $(ARGS)
GetKey.class: GetKey.java
	@javac GetKey.java
clean:
	rm -f *.class