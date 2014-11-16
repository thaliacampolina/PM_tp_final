JFLAGS = -g
JC = javac
JCR = java
JVM= $(JAVA_HOME)/bin/java
.SUFFIXES: .java .class
.java.class: ; $(JC) $(JFLAGS) $*.java

all:
	javac */*.java
	javac *.java

clean:
	rm -rf */*.class
	rm -rf *.class

CLASSES = \
    */*.java\
    *.java

default: classes

classes: $(CLASSES:.java=.class)

run: classes
	$(JCR) Tp_final
