# TP6 — Manipulation d'images en niveaux de gris

**Réalisé par :** Aboubacrin Simpara  
**Établissement :** Université de Lille

---

## Présentation

Ce TP porte sur la manipulation d'images en niveaux de gris. Une image est représentée comme une grille de pixels, chaque pixel ayant une couleur (`GrayColor`) dont la valeur varie de 0 (noir) à 255 (blanc).

Nous avons d'abord conçu la classe `GrayColor` pour représenter une teinte de gris, puis `Pixel` qui encapsule cette couleur, et enfin `Image` qui assemble tous les pixels en une grille 2D. La classe `Image` implémente une interface `ImageInterface` pour garantir un contrat commun entre les différentes implémentations possibles.

Parmi les opérations que l'on peut effectuer sur une image :
- **Changer la couleur** d'un pixel précis
- **Remplir un rectangle** d'une certaine couleur
- **Obtenir le négatif** de l'image (chaque niveau de gris `l` devient `255 - l`)
- **Extraire les contours** selon un seuil : on compare chaque pixel à ses voisins de droite et du bas, et si la différence dépasse le seuil, le pixel est mis en noir

Lorsqu'on accède à un pixel aux coordonnées invalides, une exception personnalisée `UnknownPixelException` est lancée.

### Objectives Achieved

This practical work requires implementing different objects in order to be able to manipulate images.

using interfaces to avoid duplicating code, manipulating pixels on a given set of images...

The pixel class is a separate object that instantiates a grey color, with accessors, a setter, and an equals method that compares two pixels...


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