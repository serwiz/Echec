CLASSPIECE=./lib/class/pieces/
CLASSECHEC=./lib/class/echec/
SCRPTPIECE=./lib/src/piece/
SCRPTECHEC=./lib/src/echec/
SS=-sourcepath

.PHONY: all compile clean mrproper

all: mrproper compile

compile:
	javac $(SS) $(SCRPTECHEC)*.java
	javac $(SS)  $(SCRPTPIECE)*.java
	mv $(SCRPTPIECE)*.class $(CLASSPIECE)
	mv $(SCRPTECHEC)*.class $(CLASSECHEC)
	javac Chess.java
	jar Chess.jar Chess.class $(CLASSPIECE)*.class $(CLASSECHEC)*.class

clean:
	rm -f $(CLASSPIECE)*.class $(CLASSECHEC)*.class *.class

mrproper: clean
	rm -f Chess.jar
