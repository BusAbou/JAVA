# TP4 - VLille

## Author 

- SOW Mamadou Baïllo

## Goals 

### objectives achieved

This practical work involves managing a bicycle rental station (Vlille). A Bike object allowing
retrieval of a bike's characteristics via methods and a constructor. A BikeStation class that
represents the bike station, with a constructor that takes the station name and its capacity as parameters.

For each method, Javadocs had to be written, and some unit tests were added to the existing ones.
A main program BikeMain was created to display the description of a bike, A second main
BikeStationMain was also created, which instantiates two Bike objects and a BikeStation station. The main BikeStation program takes a command line argument.

## How to generate documentation ?

Command to use for generating the documentation. You will need to go to the tp4/ folder

```bash
javadoc -sourcepath src -subpackages vlille -d docs
```

## How to compile the project classes?

```bash
javac -sourcepath src src/vlille/*.java -d classes
```

## How to compile the tests?

```bash
javac -classpath junit-console.jar:classes test/vlille/*.java
```

## How to run the tests?

```bash
java -jar junit-console.jar -classpath test:classes -scan-classpath
```

## How to create the executable jar?

```bash
jar cfe BikeStationMain.jar vlille.BikeStationMain -C classes/ .
```
## How to test program execution?

```bash
java -classpath classes vlille.BikeMain
java -classpath classes vlille.BikeStationMain 12
```

## And for a jar if requested

```bash
java -jar BikeStationMain.jar 12
```
