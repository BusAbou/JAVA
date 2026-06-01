# TP8 — Jeu de l'Oie

**Réalisé par :** Aboubacrin Simpara  
**Établissement :** Université de Lille

---

## Présentation

Ce TP consiste à programmer le **jeu de l'oie** en Java. Plusieurs joueurs se déplacent sur un plateau de cases en lançant deux dés à chaque tour, et le premier à atteindre la dernière case gagne.

Le cœur du projet repose sur l'utilisation des **classes abstraites** et de l'**héritage** :

- `Cell` est une classe abstraite qui définit le comportement commun de toutes les cases. Cinq types de cases en héritent, chacune avec un comportement différent :
  - **`NormalCell`** : case ordinaire, le joueur avance normalement.
  - **`GooseCell`** (case de l'oie) : le joueur rejoue d'autant de cases qu'il vient d'en parcourir.
  - **`TrapCell`** (prison) : le joueur est bloqué et ne peut pas bouger au prochain tour.
  - **`WaitCell`** : le joueur doit attendre un tour.
  - **`TeleportationCell`** : le joueur est téléporté directement vers une autre case cible.

- `Board` est aussi abstraite pour permettre de créer différents types de plateaux. `ClassicalBoard` est le plateau classique du jeu de l'oie.

Si deux joueurs se retrouvent sur la même case, ils échangent leurs positions. La partie continue jusqu'à ce qu'un joueur atteigne exactement la dernière case.

### Arborescence du projet
.
└── jeu_de_l_oie
    └── tp8
        ├── goosegame.jar
        ├── junit-console.jar
        ├── manifest-tp8
        ├── README.md
        ├── src
        │   └── goosegame
        │       ├── board
        │       │   └── ClassicalBoard.java
        │       ├── Board.java
        │       ├── cell
        │       │   ├── GooseCell.java
        │       │   ├── NormalCell.java
        │       │   ├── TeleportationCell.java
        │       │   ├── TrapCell.java
        │       │   └── WaitCell.java
        │       ├── Cell.java
        │       ├── Game.java
        │       ├── GooseMain.java
        │       └── Player.java
        └── test
            └── goosegame
                ├── board
                │   └── ClassicalBoardTest.java
                ├── BoardTest.java
                ├── cell
                │   ├── GooseCellTest.java
                │   ├── NormalCellTest.java
                │   ├── TeleportationCellTest.java
                │   ├── TrapCellTest.java
                │   └── WaitCellTest.java
                └── CellTest.java

11 directories, 23 files

## Comment générer la documentation
- Pour toutes les commandes qui sui suivent il faut se mettre dans le dossier jeu_de_l_oie/tp8/

```bash
javadoc -sourcepath src -subpackages goosegame -d docs
```

## comment compiler les classes du projet

```bash
javac -sourcepath src src/goosegame/*.java -d classes
```

## comment compiler les tests

```bash
javac -classpath junit-console.jar:classes test/goosegame/*.java test/goosegame/board/*.java test/goosegame/cell/*.java
```

## comment lancer les tests

```bash
java -jar junit-console.jar -classpath test:classes -scan-classpath
```

## comment créer un executabel .jar

```bash
jar cvfm goosegame.jar manifest-tp8 -C classes .
```

## comment executer le programme principal

```bash
java -classpath classes goosegame.GooseMain
```

## executer le jar 

```bash
java -jar goosegame.jar timo leon
```
