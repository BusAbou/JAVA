# TP1 — Introduction à la Programmation Orientée Objet en Java

**Réalisé par :** Aboubacrin Simpara
**Établissement :** Université de Lille

Ce TP introduit les bases de la POO en Java à travers deux exercices indépendants : la modélisation d'une télévision et d'une bibliothèque.

---

## Structure du projet

```
tp1/
├── tv/
│   └── src/
│       ├── Tv.java          # Classe représentant une télévision
│       └── TvMain.java      # Programme principal pour tester Tv
└── library/
    └── src/
        ├── Author.java      # Classe représentant un auteur
        ├── Book.java        # Classe représentant un livre
        ├── Library.java     # Classe représentant une bibliothèque
        └── LibraryMain.java # Programme principal pour tester la bibliothèque
```

---

## Exercice 1 — Télévision (`tv/`)

### Description

Modélisation d'une télévision avec ses fonctionnalités de base.

### Classe `Tv`

| Attribut       | Type      | Description                              |
|----------------|-----------|------------------------------------------|
| `on`           | `boolean` | État de la TV (allumée / éteinte)        |
| `brand`        | `String`  | Marque de la TV                          |
| `channel`      | `int`     | Chaîne courante                          |
| `soundVolume`  | `int`     | Volume sonore (entre 0 et `maxSound`)    |
| `maxSound`     | `int`     | Volume maximum autorisé                  |

### Méthodes principales

- `on()` / `off()` — allumer / éteindre la TV
- `changeChannel(int channelNum)` — changer de chaîne (uniquement si la TV est allumée)
- `currentChannel()` — retourner la chaîne actuelle
- `volumeUp()` / `volumeDown()` — augmenter / diminuer le volume
- `toString()` — afficher l'état de la TV

### Exemple d'exécution (`TvMain`)

```java
Tv tv1 = new Tv("BelEcran");
tv1.on();
tv1.changeChannel(7);
tv1.volumeUp();
System.out.println(tv1);
tv1.off();
```

---

## Exercice 2 — Bibliothèque (`library/`)

### Description

Modélisation d'une bibliothèque contenant des livres écrits par des auteurs.

### Classe `Author`

Représente un auteur avec son nom, prénom et année de naissance.

| Attribut     | Type     | Description           |
|--------------|----------|-----------------------|
| `lastname`   | `String` | Nom de famille        |
| `firstname`  | `String` | Prénom                |
| `birthYear`  | `int`    | Année de naissance    |

### Classe `Book`

Représente un livre avec son titre, son auteur, son année de publication et son nombre de pages.

| Attribut           | Type     | Description               |
|--------------------|----------|---------------------------|
| `title`            | `String` | Titre du livre            |
| `author`           | `Author` | Auteur du livre           |
| `publicationYear`  | `int`    | Année de publication      |
| `nbPages`          | `int`    | Nombre de pages (0 par défaut) |

Deux constructeurs disponibles : avec ou sans le nombre de pages.

### Classe `Library`

Contient un tableau de livres (maximum 10).

| Méthode              | Description                                     |
|----------------------|-------------------------------------------------|
| `addBook(Book book)` | Ajoute un livre si la bibliothèque n'est pas pleine |
| `displayBooks()`     | Affiche tous les livres présents                |
| `getNbBooks()`       | Retourne le nombre de livres                    |
| `getBook(int i)`     | Retourne le i-ème livre (ou `null` si invalide) |

### Exemple d'exécution (`LibraryMain`)

```java
Author tolkien = new Author("Tolkien", "JRR", 1892);
Book book1 = new Book("Le seigneur des anneaux", tolkien, 1954, 1600);
Book book2 = new Book("Bilbo le Hobbit", tolkien, 1937);

Library lib = new Library();
lib.addBook(book1);
lib.addBook(book2);
lib.displayBooks();
```

---

## Concepts abordés

- Déclaration de classes, attributs et méthodes
- Constructeurs (avec et sans paramètres, surcharge)
- Encapsulation (`private`, getters/setters)
- Méthode `toString()`
- Tableaux d'objets
- Boucles `while` et `for`
- Conditions (`if`)
