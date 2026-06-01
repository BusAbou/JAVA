# Travaux Pratiques Java — Programmation Orientée Objet

**Réalisé par :** Aboubacrin Simpara  
**Établissement :** Université de Lille

---

## Présentation générale

Ce dépôt regroupe l'ensemble des travaux pratiques réalisés dans le cadre du cours de **Programmation Orientée Objet en Java**. Chaque TP aborde des notions progressives, en partant des bases de la POO jusqu'aux concepts avancés comme l'héritage, les interfaces, les classes abstraites, les collections et les tests unitaires.

---

## Structure du dépôt

```
JAVA/
├── tp1/   # Introduction à la POO — TV et Bibliothèque
├── tp2/   # Associations entre objets — Système d'éclairage
├── tp3/   # Arguments en ligne de commande — Rectangle et TV
├── tp4/   # Packages, Enums, Exceptions — Système V'Lille
├── tp5/   # Projet complet — Bataille Navale
├── tp6/   # Interfaces et traitement d'images en niveaux de gris
├── tp7/   # Héritage et collections — Agence de location
└── tp8/   # Classes abstraites — Jeu de l'Oie
```

---

## Détail des TPs

### TP1 — Introduction à la POO
Premier contact avec les classes, les attributs, les constructeurs et les méthodes. On modélise une **télévision** (allumer/éteindre, changer de chaîne, régler le volume) et une **bibliothèque** contenant des livres écrits par des auteurs.

**Notions abordées :** classes, encapsulation, `toString()`, tableaux d'objets, boucles.

---

### TP2 — Associations entre objets
On modélise un **système d'éclairage** avec des ampoules (`LightBulb`), un interrupteur (`LightSwitch`) qui contrôle une ampoule, et une guirlande (`LightString`) composée de plusieurs ampoules. On calcule la puissance totale consommée selon l'état de la guirlande.

**Notions abordées :** association entre objets, boucle `for-each`, délégation de méthodes.

---

### TP3 — Arguments en ligne de commande
On modélise un **rectangle** avec des calculs géométriques (aire, périmètre, diagonale, comparaison). Le programme lit les dimensions depuis les arguments en ligne de commande. La classe TV évolue aussi en trois versions pour illustrer la gestion progressive des arguments.

**Notions abordées :** `args[]`, `Integer.parseInt`, `NumberFormatException`, `Math.sqrt`, `equals()`, `Random`.

---

### TP4 — Packages, Énumérations et Exceptions
Simulation du système de vélos en libre-service **V'Lille**. On gère des vélos (`Bike`) avec leurs modèles (CLASSIC, ELECTRIC, TANDEM) et des stations (`BikeStation`) où on peut déposer et retirer des vélos. Une exception personnalisée est levée si le slot est invalide ou vide.

**Notions abordées :** packages, `enum`, exception personnalisée (`checked`), tests unitaires JUnit 5.

---

### TP5 — Bataille Navale
Jeu de **bataille navale** complet. Un plateau 2D contient des cases, on y place des bateaux avec une orientation, et le joueur tire des coups au clavier jusqu'à couler tous les bateaux. Le résultat de chaque tir est indiqué (raté, touché, coulé).

**Notions abordées :** tableaux 2D, `ArrayList`, `Scanner`, `enum`, exception personnalisée, `switch`, Javadoc, JAR.

---

### TP6 — Manipulation d'images
Traitement d'**images en niveaux de gris** (format PGM). Une image est une grille de pixels, chaque pixel ayant une couleur entre 0 (noir) et 255 (blanc). On peut changer la couleur d'un pixel, remplir un rectangle, obtenir le négatif de l'image, ou extraire ses contours selon un seuil.

**Notions abordées :** interface (`ImageInterface`), implémentation d'interface, exception personnalisée, tableaux 2D, traitement d'images.

---

### TP7 — Agence de Location de Véhicules
Modélisation d'une **agence de location**. On gère des véhicules (voitures, motos), des clients et des locations. L'agence supporte des filtres combinables pour sélectionner des véhicules. Deux variantes héritent de l'agence de base : l'une applique une majoration pour les jeunes conducteurs, l'autre un système de fidélité avec points et réductions.

**Notions abordées :** héritage, `interface`, collections (`List`, `Map`, `ArrayList`, `HashMap`), surcharge de méthodes, design pattern filtre.

---

### TP8 — Jeu de l'Oie
Implémentation du **jeu de l'oie** avec plusieurs joueurs, un plateau de cases et un lancer de deux dés par tour. Chaque type de case a un comportement différent : case normale, case de l'oie (rejouer), prison (bloqué), attente, ou téléportation. Si deux joueurs tombent sur la même case, ils échangent leurs positions.

**Notions abordées :** classes abstraites, héritage multiple, polymorphisme, `ArrayList`, boucle de jeu, JAR.

---

## Technologies utilisées

- **Java** (JDK 11+)
- **JUnit 5** — tests unitaires
- **Javadoc** — génération de documentation
- **JAR** — création d'exécutables

---

## Lancer un TP

Chaque dossier TP contient son propre `README.md` avec les commandes détaillées pour compiler, tester et exécuter le projet. Se placer dans le dossier correspondant avant d'exécuter les commandes.

```bash
cd tp4
javac -sourcepath src src/vlille/*.java -d classes
java -classpath classes vlille.BikeStationMain 0
```
