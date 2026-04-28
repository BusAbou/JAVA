### student name: SOW Mamadou Baïllo

# TP java - Rectangles

This project is an object-oriented programming exercise in Java.
It demonstrates the creation and use of a 'Rectangle' class.

## Project structure

tp3/
└── rectangle/
├── src/
│ ├── Rectangle.java # Class representing a rectangle
│ └── RectangleMain.java # Main program
└── README.md # Project documentation

## Compilation and execution

### 1. Compilation
From the `tp3/rectangle/` folder:
```bash 
javac -sourcepath src src/*.java -d classes

2. Execution
. Case 1: one value(square)

java -classpath classes RectangleMain 8 

execution trace:
For this rectangle, his length is 8.0 and his width is 8.0
For this rectangle, his length is 9.0 and his width is 4.0
Area = 64.0 and Perimeter = 32.0
this myRect1 is a square ? true 
this myRect2 is a square ? false
this two rectangle are equal ? false

. Case 2: two values (width and length)
For this rectangle, his length is 25.0 and his width is 12.0
For this rectangle, his length is 10.0 and his width is 5.0
Area = 300.0 and Perimeter = 74.0
this myRect1 is a square ? false
this myRect2 is a square ? false
this two rectangle are equal ? false

. Case 3: no arguments
Error: You must provide 1 or 2 integers as a parameter !
Usage: java RectangleMain <dimension> or java RectangleMain <width> <length>

### Features


Create rectangles with width and length.

Compute:

Area (area)

Perimeter (perimeter)

Check if a rectangle is a square (isSquare).

Compare two rectangles (equals).
