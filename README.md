# TP1 – Tests Unitaires : Couverture de Code avec JUnit 5

## 🎯 Objectifs

Ce premier TP vise à :
- Comprendre les différents types de **couverture de code** :
  - Couverture des lignes
  - Couverture des branches
  - Couverture des conditions
  - Couverture des chemins
- Écrire des tests unitaires en **JUnit 5** pour maximiser cette couverture.
- Analyser les cas de test manquants.
- Appliquer la stratégie AAA : Arrange, Act, Assert.

---

## ✅ Exercices réalisés

### 📌 Exercice 1 : `Palindrome`

- Méthode testée : `isPalindrome(String)`
- But : tester si une chaîne est un palindrome.
- **Type de couverture ciblé** : lignes et branches.
- Tests écrits pour :
  - Mot vide
  - Palindrome impair/paire
  - Chaîne non palindrome

### 📌 Exercice 2 : `Anagram`

- Méthode testée : `isAnagram(String a, String b)`
- But : vérifier si deux mots sont des anagrammes.
- **Type de couverture** : branches + conditions
- Scénarios :
  - Longueurs différentes
  - Mêmes lettres avec ordre différent
  - Lettres différentes

### 📌 Exercice 3 : `BinarySearch`

- Méthode testée : `binarySearch(int[] arr, int target)`
- Couverture ciblée : chemins d’exécution
- Cas traités :
  - Élément au milieu
  - Élément à gauche / droite
  - Élément absent

### 📌 Exercice 4 : `QuadraticEquation`

- Méthode testée : `solve(a, b, c)`
- Objectif : tester la résolution d’équations du 2nd degré
- Cas :
  - Δ > 0 (2 racines réelles)
  - Δ = 0 (1 racine double)
  - Δ < 0 (aucune racine réelle)

### 📌 Exercice 5 : `RomanNumeral`

- Méthode testée : `romanToInt(String roman)`
- Cas testés :
  - Conversion simple (X, V, I)
  - Valeurs avec soustraction (IV, IX, XL)
  - Valeurs incorrectes (tester robustesse)

### 📌 Exercice 6 : `FizzBuzz`

- Méthode testée : `fizzBuzz(int n)`
- Cas :
  - Multiple de 3
  - Multiple de 5
  - Multiple de 3 et 5
  - Autres cas

---

## 📊 Types de couverture visés et atteints

| Type de couverture     | Description                                                  | Couvert dans...                         |
|------------------------|--------------------------------------------------------------|-----------------------------------------|
| **Lignes**             | Chaque ligne de code exécutée au moins une fois              | Tous les exercices                      |
| **Branches**           | Chaque `if/else`, `switch`, etc. traversé                   | Palindrome, Anagram, QuadraticEquation |
| **Conditions**         | Chaque condition booléenne testée avec `true` / `false`     | Anagram, QuadraticEquation              |
| **Chemins**            | Chaque chemin d’exécution logique (complexe)                | BinarySearch, QuadraticEquation         |

---

## ✅ Conclusion

Ce TP a permis de :
- Bien maîtriser **JUnit 5**
- Analyser et couvrir les **cas d’usage normaux, limites, et erronés**
- Comprendre l’utilité des **différents niveaux de couverture**
- Créer des **tests robustes et documentés**

> Un bon test ne se contente pas de vérifier un résultat, il **valide une logique complète**.

---

## 🛠️ Technologies utilisées

- Java 13
- JUnit 5
- IntelliJ IDEA
