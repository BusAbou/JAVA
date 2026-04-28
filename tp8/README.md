# TP8 Jeu de la l'oie

## Etudiants

- BELYAEV Igor
- SAVI kamal-Deen Oloumide
- SOW Mamadou Baïllo

## Objectifs

### Ojectifs atteints

- Utilisation de l'heritage
- Conception et developpement du jeu
- La classe abstraite Cell a été créé afin de pouvoir créer des classes Cell filles ayant la meme structure mais pas forcément tous les méme methodes
- La classe abstraite Board a aussi été créee pour la meme raison. Comme dit dans le sujet on voulait pouvoir créer d'autres types de plateau si possible ayant des comportement différents du premier, le choix d'une classe abstraite Board reproduitant déja la structure s'est ainsi fait.

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
