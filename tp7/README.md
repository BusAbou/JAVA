# TP7 — Agence de Location de Véhicules

**Réalisé par :** Aboubacrin Simpara  
**Établissement :** Université de Lille

---

## Présentation

Ce TP modélise une agence de location de véhicules. On y manipule des véhicules (voitures et motos), des clients, et une agence qui gère les locations. C'est aussi l'occasion de mettre en pratique l'**héritage**, les **interfaces**, les **collections Java** (`List`, `Map`) et les **filtres**.

L'agence permet d'ajouter ou supprimer des véhicules, de louer un véhicule à un client et de le retourner. On peut aussi filtrer les véhicules selon différents critères (marque, prix maximum, début de marque...) et afficher la sélection.

Deux variantes de l'agence ont été créées par héritage :

- **`SuspiciousRentalAgency`** : applique une majoration de 10% sur le prix pour les clients de moins de 25 ans.
- **`FriendlyRentalAgency`** : accumule des points de fidélité pour chaque location. Au-delà d'un seuil, le client bénéficie d'une réduction.

Pour les filtres, une interface `VehicleFilter` définit un contrat simple : la méthode `accept(Vehicle v)`. Chaque filtre concret l'implémente différemment (`BrandFilter`, `MaxPriceFilter`, `BrandBeginByFilter`). Le filtre `AndFilter` combine plusieurs filtres ensemble.

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