# TP6 Image Manipulation

## Author


## Goal

### Objectives Achieved

This practical work requires implementing different objects in order to be able to manipulate images.

using interfaces to avoid duplicating code, manipulating pixels on a given set of images...

The pixel class is a separate object that instantiates a grey color, with accessors, a setter, and an equals method that compares two pixels...

An image object with several methods, including changing the color of an image, obtaining the negative image, and extracting the original image through edge extraction.

## How to generate documentation ?
Command to use for generating the documentation. You will need to go to the tp6/ folder

```bash
javadoc -sourcepath src -subpackages image -d docs
```
## How to compile the project classes?

```bash
javac -sourcepath src src/image/*.java -d classes
```

## How to compile the tests?

```bash
javac -classpath junit-console.jar:classes tests/image/*.java
```

## How to run the tests?

```bash
java -jar junit-console.jar -classpath tests:classes -scan-classpath
```

## How to create the executable jar?

```bash
jar cvfm ImageMain.jar manifest -C classes .
```

## How to test program execution?

```bash
java -classpath classes image.ImageMain /images/chat.pgm 3
```

## run the jar

```bash
java -jar ImageMain.jar /images/frog.pgm 5
```