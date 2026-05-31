# TP3 — Arguments en ligne de commande et méthodes avancées

**Réalisé par :** Aboubacrin Simpara  
**Établissement :** Université de Lille

---

## Présentation

Dans ce TP, nous avons travaillé sur deux sujets principaux : la modélisation géométrique d'un rectangle, et l'évolution de la classe Télévision pour mieux gérer les arguments passés en ligne de commande.

---

## Partie 1 — Le Rectangle

Nous avons créé une classe `Rectangle` qui représente un rectangle à partir de sa longueur et de sa largeur. À partir de ces deux dimensions, on peut calculer l'aire, le périmètre et la longueur de la diagonale (en utilisant `Math.sqrt`). La classe permet aussi de savoir si le rectangle est en réalité un carré, ou de comparer deux rectangles entre eux selon leur aire.

Nous avons également redéfini la méthode `equals()` pour pouvoir comparer deux rectangles : deux rectangles sont considérés égaux s'ils ont exactement la même longueur et la même largeur.

### Le programme principal `RectangleMain`

Ce programme lit les dimensions depuis les arguments en ligne de commande et gère quatre cas possibles :

- **Aucun argument** → message d'erreur
- **1 argument** → on crée un carré avec ce côté
- **2 arguments** → on crée un rectangle avec la largeur et la longueur fournies
- **Plus de 2 arguments** → message d'erreur

Un deuxième rectangle aux dimensions aléatoires est aussi créé pour faire des comparaisons.

```bash
java RectangleMain 5        # crée un carré 5x5
java RectangleMain 3 7      # crée un rectangle 3x7
```

---

## Partie 2 — La Télévision

Nous avons repris la classe `Tv` du TP précédent et écrit trois programmes principaux pour illustrer la progression dans la gestion des arguments :

- **`TvMain`** : la marque de la TV est écrite directement dans le code.
- **`TvMain2`** : la marque est lue depuis le premier argument (`args[0]`), mais sans vérification — le programme plante si on ne fournit rien.
- **`TvMain3`** : version améliorée qui vérifie d'abord qu'un argument a bien été fourni, et affiche un message d'aide sinon avant de quitter proprement avec `System.exit(0)`.

```bash
java TvMain3           # affiche l'aide : Usage : java TvMain3 <uneMarque>
java TvMain3 Samsung   # crée une TV Samsung
```

---

## Ce que ce TP nous a appris

- Comment récupérer et utiliser les arguments de la ligne de commande
- Comment convertir une chaîne en entier avec `Integer.parseInt` et gérer les erreurs avec `NumberFormatException`
- Comment générer des valeurs aléatoires avec `java.util.Random`
- Comment redéfinir `equals()` correctement en Java
- L'importance de valider les entrées utilisateur avant de les utiliser
