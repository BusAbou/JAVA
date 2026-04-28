# TP7 Rental agency

## Author

- SOW Mamadou Baïllo 

## Goal

### Objectives Achieved
This preparatory work allows us to highlight inheritance with different classes, with an interface that avoids duplicating code.

We're dealing with a rental agency with various objects: vehicles, clients, the agency itself, etc. We can add vehicles to our agency, create a client, and have them rent a vehicle. It's possible to display all the agency's content and check if a vehicle is rented or if a client has rented a vehicle.

On this rental agency it is possible to apply filters by: brand, model, production year, daily price rental and then display this selection list.

Two classes, SuspiciousRentalAgency and FriendlyRentalAgency, which inherit from RentalAgency, perform a somewhat special function, notably overloading the rentVehicle method according to rental conditions.

## How to generate documentation ?
Command to use for generating the documentation. You will need to go to the tp6/ folder

```bash
javadoc -sourcepath src -subpackages rental -d docs
```
## How to compile the project classes?

```bash
javac -sourcepath src src/rental/*.java -d classes
```

## How to compile the tests?

```bash
javac -classpath junit-console.jar:classes test/rental/*.java
```

## How to run the tests?

```bash
java -jar junit-console.jar -classpath tests:classes -scan-classpath
```

## How to create the executable jar?

```bash
jar cvfm agency.jar manifest-tp7 -C classes .
```

## How to test program execution?

```bash
java -classpath classes rental.RentalAgencyMain
```

## run the jar

```bash
java -jar agency.jar 
```