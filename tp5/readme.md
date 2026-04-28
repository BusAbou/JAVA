# TP5 - Bataille Navale

## Author 

- SOW Mamadou Baïllo

## Goals 

### objectives achieved

This assignment is due to a lack of computer equipment.

The objective was to program a naval battle game, with various details outlined in the specifications.

There were different classes to program, with tests, documentation for each method...
The main objective was to provide a functional program with zero warnings or any errors.

The game works in such a way that, when the board is instantiated, it is provided with a length and a width for the construction of the game board. On this board you can place a boat with a variable orientation and square position.

Once a ship is placed on the board, you can shoot until all the ships sink, ending the game.

## How to generate documentation ?

Command to use for generating the documentation. You will need to go to the tp5/ folder

```bash
javadoc -sourcepath src -subpackages battleship -d docs
```

## How to compile the project classes?

```bash
javac -sourcepath src src/battleship/*.java -d classes
```

## How to compile the tests?

```bash
javac -classpath junit-console.jar:classes tests/battleship/*.java
```

## How to run the tests?

```bash
java -jar junit-console.jar -classpath tests:classes -scan-classpath
```

## How to create the executable jar?

```bash
jar cvfm BattleShipMain.jar battleship-manifest -C classes .
```

## How to test program execution?

```bash
java -classpath classes battleship.BattleShipMain
```

## run the jar

```bash
java -jar BattleShipMain.jar
```