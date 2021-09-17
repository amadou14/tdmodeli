taches realises
[X] 1- creation d'un projet gradle 
[X] A quoi servent ces librairies ? reponse aux question 
[ ] 3-  verification
[X] 1. Construire une classe de tests nommée `DictionaryTest`.
[X] 2. Ecrire dans cette classe un test créant un objet de type `Dictionary`, lui assignant un nom, et vérifiant que ce nom est correctement stocké dans l’objet.

[ ]2. Ecrire dans cette classe un test créant un objet de type `Dictionary`, lui assignant un nom, et vérifiant que ce nom est correctement stocké dans l’objet.


6. Supprimer la duplication du code en introduisant un attribut privé `name`, et adapter le constructeur et la méthode `getName()`de manière à s’assurer que cette variable soit correctement positionnée et renvoyée.

        Qu’englobe la notion de refactoring ? Toute forme de modification du code qui conserve le passage des tests existants, et qui permet d’obtenir une architecture logicielle avec un minimum de défauts.
        Quelques exemples :

        – supprimer la duplication du code / déplacer du code ;

        – ajuster le caractère privé/public des attributs/méthodes.

7. Le cycle de travail est maintenant bouclé. Il devient alors possible de recommencer ce cycle avec un nouveau test. Les tests pré-existant assurent une certaine confiance dans le code déjà écrit, et permettent d’envisager les modifications futures avec sérénité.

        Utiliser la technique précédente pour écrire un test, puis une méthode permettant de vérifier si un dictionnaire est vide ou pas (méthode `isEmpty`). En l’absence de méthodes pour ajouter quoi que ce soit au dictionnaire, on se limitera à renvoyer une valeur constante.

8. Comme cette fonctionnalité n’est pas implémentée de manière correcte, rajouter le problème du traitement du dictionnaire vide dans la task list.

Écrire un test permettant de vérifier que l’ajout d’une traduction au dictionnaire (`addTranslation`) se passe correctement lors de la vérification (`getTranslation`).
Ajouter à la classe `Dictionary`une table de hachage `Map<String, String> translations`.
Rendre le code de `addTranslation` et de `getTranslation` correct.
