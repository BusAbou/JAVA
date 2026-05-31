# TP2 — Objets et Associations en Java

**Réalisé par :** Aboubacrin Simpara
**Établissement :** Université de Lille

Ce TP approfondit la programmation orientée objet en Java à travers la modélisation d'un système d'éclairage (ampoules, interrupteurs, guirlandes) et la révision de la classe TV.

---

## Structure du projet

```
tp2/
├── light/
│   └── src/
│       ├── LightBulb.java    # Classe représentant une ampoule
│       ├── LightSwitch.java  # Classe représentant un interrupteur
│       ├── LightString.java  # Classe représentant une guirlande d'ampoules
│       └── LightMain.java    # Programme principal
└── tv/
    └── src/
        └── Tv.java           # Classe Télévision (révision TP1)
```

---

## Exercice 1 — Système d'éclairage (`light/`)

### Classe `LightBulb`

Modélise une ampoule électrique avec sa puissance, son flux lumineux et sa couleur.

| Attribut  | Type      | Description                      |
|-----------|-----------|----------------------------------|
| `power`   | `int`     | Puissance en watts               |
| `lumens`  | `int`     | Flux lumineux en lumens          |
| `color`   | `String`  | Couleur de la lumière            |
| `on`      | `boolean` | État de l'ampoule (allumée/éteinte) |

| Méthode       | Description                          |
|---------------|--------------------------------------|
| `turnOn()`    | Allume l'ampoule                     |
| `turnOff()`   | Éteint l'ampoule                     |
| `isOn()`      | Indique si l'ampoule est allumée     |
| `getWatt()`   | Retourne la puissance en watts       |
| `getLumen()`  | Retourne le flux lumineux en lumens  |
| `getColor()`  | Retourne la couleur                  |
| `toString()`  | Description textuelle de l'ampoule   |

---

### Classe `LightSwitch`

Modélise un interrupteur contrôlant une seule ampoule.

| Attribut    | Type         | Description                     |
|-------------|--------------|---------------------------------|
| `theBulb`   | `LightBulb`  | L'ampoule contrôlée             |

| Méthode           | Description                                          |
|-------------------|------------------------------------------------------|
| `getLightBulb()`  | Retourne l'ampoule associée à l'interrupteur         |
| `push()`          | Appuie sur l'interrupteur (inverse l'état de l'ampoule) |

---

### Classe `LightString`

Modélise une guirlande lumineuse composée de plusieurs ampoules.

| Attribut   | Type           | Description                        |
|------------|----------------|------------------------------------|
| `theBulb`  | `LightBulb[]`  | Tableau d'ampoules                 |
| `ISON`     | `boolean`      | État global de la guirlande        |

| Méthode                            | Description                                             |
|------------------------------------|---------------------------------------------------------|
| `getLightBulb(int i)`              | Retourne la i-ème ampoule (index commence à 1)          |
| `changeLightbulb(int i, LightBulb)`| Remplace la i-ème ampoule                              |
| `getConsumedPower()`               | Retourne la puissance totale consommée (0 si éteinte)   |
| `turnOn()`                         | Allume toutes les ampoules de la guirlande              |
| `turnOff()`                        | Éteint toutes les ampoules de la guirlande              |

---

### Exemple d'exécution (`LightMain`)

```java
// Création et affichage d'une ampoule
LightBulb bulb = new LightBulb(4, 1200, "white");
bulb.turnOn();
System.out.println(bulb);

// Guirlande de 10 ampoules (1W chacune)
LightString garland = new LightString(10);
garland.turnOn();
System.out.println("Puissance consommée : " + garland.getConsumedPower() + " W"); // 10 W

// Remplacement de la 4e ampoule par une ampoule de 2W
garland.changeLightbulb(4, new LightBulb(2, 120, "jaune"));
System.out.println("Puissance après remplacement : " + garland.getConsumedPower() + " W"); // 11 W
```

---

## Exercice 2 — Télévision (`tv/`)

Révision et amélioration de la classe `Tv` du TP1. Les fonctionnalités restent identiques :
`on()`, `off()`, `changeChannel()`, `volumeUp()`, `volumeDown()`, `toString()`.

Modification par rapport au TP1 : le volume initial est fixé à **3** (au lieu de 7).

---

## Concepts abordés

- Association entre objets (`LightSwitch` contrôle un `LightBulb`)
- Tableaux d'objets (`LightBulb[]` dans `LightString`)
- Boucle `for-each`
- Délégation de méthodes entre objets
- Encapsulation et séparation des responsabilités
