# TP5 — Bataille Navale

**Réalisé par :** Aboubacrin Simpara  
**Établissement :** Université de Lille

---

## Présentation

Ce TP consiste à programmer un jeu de bataille navale complet en Java. L'idée est simple : on dispose d'un plateau avec une grille de cases, on y place des bateaux, et le joueur tire des coups en entrant des coordonnées jusqu'à ce que tous les bateaux soient coulés.

Pour y arriver, nous avons conçu plusieurs classes qui travaillent ensemble : le plateau (`Board`), les cases (`Cell`), les bateaux (`Ship`), et la boucle de jeu (`Game`). Deux énumérations viennent compléter le tout — une pour l'orientation des bateaux (`HORIZONTAL` ou `VERTICAL`), et une autre pour le résultat de chaque tir (`HIT`, `MISSED`, `SUNK`).

Quand le joueur tire sur une case invalide (hors du plateau), une exception personnalisée `InvalidPositionException` est lancée.

La partie se termine automatiquement quand tous les bateaux ont été coulés, et le nombre total de tirs est affiché.

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