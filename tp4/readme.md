# TP4 — Exceptions, Enums, Packages et Tests unitaires

**Réalisé par :** Aboubacrin Simpara  
**Établissement :** Université de Lille

---

## Présentation

Ce TP modélise un système de vélos en libre-service inspiré du **V'Lille**. On y gère des vélos et des stations de dépôt/retrait, en introduisant des notions avancées comme les packages, les énumérations, les exceptions personnalisées et les tests unitaires avec JUnit 5.

---

## Structure du projet

```
tp4/
├── src/
│   └── vlille/
│       ├── Bike.java                       # Classe représentant un vélo
│       ├── BikeStation.java                # Classe représentant une station
│       ├── BikeNotAvailableException.java  # Exception personnalisée
│       ├── BikeMain.java                   # Programme : créer un vélo
│       ├── BikeStationMain.java            # Programme : gérer une station
│       └── util/
│           └── BikeModel.java              # Enum des modèles de vélos
└── test/
    └── vlille/
        ├── BikeTest.java                   # Tests unitaires de Bike
        ├── BikeSecondTest.java             # Tests complémentaires
        └── BikeStationTest.java            # Tests unitaires de BikeStation
```

---

## Les classes principales

### `BikeModel` — l'énumération des modèles

Un vélo peut être de trois types : **CLASSIC** (mécanique), **ELECTRIC** (à assistance électrique) ou **TANDEM** (deux places). Ces valeurs sont définies dans une énumération Java (`enum`).

---

### `Bike` — le vélo

Chaque vélo est identifié par un identifiant unique (`id`), un modèle (`BikeModel`) et une couleur (rouge par défaut). Deux vélos sont considérés égaux si et seulement si ils ont le même identifiant, peu importe leur modèle ou couleur.

Le prix de location est une constante de classe : `RENTAL_PRICE = 100`.

---

### `BikeStation` — la station

Une station possède un nom, une capacité fixe (nombre de slots) et un tableau de vélos. Au départ, elle est vide.

Les opérations possibles sont :

- **Déposer un vélo** (`dropBike`) : place le vélo dans le premier emplacement libre. Retourne `false` si la station est pleine.
- **Retirer un vélo** (`takeBike`) : récupère le vélo à un emplacement donné. Lance une exception si l'emplacement est invalide ou vide.
- **Premier emplacement libre** (`firstFreeSlot`) : retourne l'index du premier slot libre, ou `-1` si la station est pleine.

---

### `BikeNotAvailableException` — l'exception personnalisée

Cette exception est lancée lorsqu'on essaie de prendre un vélo à un emplacement vide ou avec un index invalide (négatif ou trop grand). C'est une exception dite **vérifiée** (`checked exception`), ce qui oblige le code appelant à la gérer avec `try/catch`.

---

## Les programmes principaux

**`BikeMain`** : crée simplement un vélo électrique et affiche sa description.

**`BikeStationMain`** : prend un numéro de slot en argument et tente de récupérer le vélo qui s'y trouve.

```bash
java -classpath classes vlille.BikeStationMain 0   # prend le vélo au slot 0
java -classpath classes vlille.BikeStationMain 5   # slot invalide → message d'erreur
```

---

## Tests unitaires (JUnit 5)

Les tests vérifient le comportement de `Bike` et `BikeStation` dans tous les cas :

- L'état initial d'une station (0 vélos, capacité correcte)
- Le dépôt et le retrait de vélos avec mise à jour du compteur
- Le premier slot libre après ajout/retrait
- Le lancement de `BikeNotAvailableException` pour un slot vide, négatif ou trop grand
- L'égalité entre vélos basée uniquement sur l'identifiant

---

## Ce que ce TP nous a appris

- Organiser son code en **packages** (`vlille`, `vlille.util`)
- Utiliser les **énumérations** (`enum`) pour représenter des valeurs fixes
- Créer et utiliser une **exception personnalisée** (`checked exception`)
- Écrire des **tests unitaires** avec JUnit 5 (`@Test`, `assertEquals`, `assertThrows`, `assertSame`)
