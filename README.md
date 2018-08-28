# D&A, Datenstrukturen und Algorithmen, BSc INF 2015, BE1, HS18/19, Dr. Hochmann Jiri

## Block 1: 2 Aufgaben (ca. 14h)

### 1.1. Implementierungsaufgabe zu doppelt geketteten Listen (ca. 6h)

#### Ziel

- Sie verstehen das Konzept der geketten Listen.
- Sie verstehen, weshalb unterschiedliche Listenkalssen unterschiedliche angepasste Interatorklassen verwenden.
- Sie können gekettete Listen und dazugehörige Iteratoren implementieren.

#### Auftrag

- Implementieren Sie eine doppelt gekettete Liste sowie eine dazugehörige Iterator-Klasse.
- Die Listenklasse soll die folgenden Methoden aus dem Interface java.util.List implementieren:
`add(E), add(int, E), get(), set(int, E), remove(int), size(), iterator();` die Iterator-Klasse sollte möglichst effizient implementiert sein und die drei Methoden `hasNext(), next()` und `remove()` implementieren.
Hinweis: Definieren Sie eine Hilfsklasse `Node<E>` mit einem Wert für ein Listenelement und je einem Verweis auf das nächste (next) und das vorhergehende (prev) Element.
Sie können in der Listenklasse ein Node-Element als Anker verwenden; next zeigt dabei auf das erste Element der Liste, prev auf das letzte.
- Verwenden Sie dazu die Klassenrümpfe im package `ch.ffhs.dua.list` iim AufgabenProjekt aus dem Informationsblock dieses Moodle-Kurses.
- Stellen Sie sicher, dass das Projekt kompiliert werden kann und dass alle TestCases laufen.
- Pushen Sie Ihre Lösung in Git und erstellen Sie in git einen Tag «ListAufgabe».
Bestätigen Sie hier durch einen kurzen Texteintrag, dass Sie die Aufgabe fertig gelöst haben.

### 1.2. Implementierungsaufgabe zu Permutationen (ca. 8h)

#### Ziel

- Sie können ein nichttriviales Problem mit einem rekursiven Algorithmus lösen.

#### Auftrag

- Implementieren Sie eine eine statische Methode in Java, die alle Permutation für ein Array erzeugt (es genügt, wenn Sie sich auf die Permutationen von {1,2,3,...,n} beschränken.
- Verwenden Sie dazu die Klasse Permutationsaus dem Package ﻿`ch.ffhs.dua.permutations` im AufgabenProjekt aus dem Informationsblock dieses Moodle-Kurses und vervollständigen Sie dort diese Klasse (mit TODO gekennzeichnet).
- Stellen Sie sicher, dass die Klasse kompiliert und dass alle TestCases positiv ausgfallen.
- Pushen Sie Ihre Lösung ins Git-Repository und erstellen Sie einen Tag «AufgabePermutationen».
Bestätigen Sie hier durch einen kurzen Texteintrag, dass Sie die Aufgabe fertig gelöst haben.

## Block 2: Aufgabe zur binären Suche (ca. 6h)

### Ziel

- Sie kennen das Prinzip der binären Suche, und Sie können das Verfahren implementieren.

### Auftrag

- Schreiben Sie ein Programm, das zu einem sortierten Array a von Zahlen eine Zahl m sucht und den kleinsten Index i und den größten Index j bestimmt so dass a[i] == m == a[j].
Die Komplexität des Algorithmus sei O(log(n))(wobei n die Anzahl der Elemente des Arrays sei).
- Verwenden Sie dazu die Klassenrümpfe im package ch.ffhs.dua.binSearch iim AufgabenProjekt aus dem Informationsblock dieses Moodle-Kurses.
- Stellen Sie sicher, dass das Projekt kompiliert werden kann und dass alle TestCases laufen.
- Pushen Sie Ihre Lösung in Git und erstellen Sie in git einen Tag «BinSearchAufgabe».
Bestätigen Sie hier durch einen kurzen Texteintrag, dass Sie die Aufgabe fertig gelöst haben.

## Block 3: Aufgaben zu Sortierverfahren (ca. 12h)

### Ziel

- Sie verstehen die Funktionsweise von Quicksort und Heapsort.
- Sie können diese Algorithmen implementieren.
- Sie kennen die Haken des (reinen) Quicksort-Algorithmus:
  - Nicht besonders schnell für klene Arrays
  - Schlechtes Worst-Case-Verhalten.
- Sie können Quick-Sort optimieren und die erwähnten Nachteile beseitigen durch Kombination mit anderern Verfahren.

### Auftrag

1. Implementieren Sie "Sortieren durch Einfügen" für int-Arrays.
2. Implementieren Sie Quicksort für int-Arrays
3. Testen Sie, für welche Grössen der zu sortierenden Arrays 'Sortieren durch Einfügen' bzw. Quicksort schneller ist.
4. Modifizieren Sie Quicksort so, dass bei den rekursiven Aufrufen bei kleinen Argumenten 'Sortieren duch Einfügen' aufgerufen wird. (Entscheiden Sie auf Grund der Überlegungen aus der vorherigen Aufgabe, wann der Wechsel auf 'Sortieren duch Einfügen' erfolgen soll.)
5. Testen und beschreiben Sie, wie gross die Verbesserung aus Teilaufgabe 4 gegnüber des reinen Quicksorts ist.
Quicksort ist eines der schnellsten Sortierverfahren, aber nur im Mittel. Das Worstcase-Verhalten von Quicksort ist hingegen schlecht: O(n2). Im Gegensatz dazu ist Heapsort im Mittel etwas langsamer als Quicksort, aber das Worstcase-Verhalten von Heapsort ist besser, nämlich O(n⋅log(n)).
Introsort ist eine Kombination dieser beiden Verfahren: Man beginnt ein Array mit Quicksort zu sortieren (oder mit der Variante aus der vorhergehenden Aufgabe); wird die Rekursionstiefe jedoch zu gross, dann ruft man nicht mehr nicht mehr Quicksort auf, sondern Heapsort. Eine Möglichkeit für einen Schwellwert zum Wechseln auf Heapsort ist eine Rekursionstiefe von 2⋅log2(n).
6. Implementieren Sie Heapsort, um ein Teilstück eines Arrays zu Sortieren.
7. Passen Sie Quicksort so an, dass die Rekursionstiefe als Parameter übergeben wird.
8. Kombinieren Sie diese beiden obigen Teilaufgaben, um Introsort zu implementieren (mit dem Schwellwert von 2ncotlog2(n) für die Rekursionstiefe).

- Verwenden Sie dazu die Klassenrümpfe im package ch.ffhs.dua.sort iim AufgabenProjekt aus dem Informationsblock dieses Moodle-Kurses.
- Stellen Sie sicher, dass das Projekt kompiliert werden kann und dass alle TestCases laufen.
- Pushen Sie Ihre Lösung in Git und erstellen Sie in git einen Tag «SortAufgabe». Bestätigen Sie hier durch einen kurzen Texteintrag, dass Sie die Aufgabe fertig gelöst haben.

## Block 4: Traversierung von Bäumen (ca. 12h)

### Ziel

- Sie kennen verschiedene Strategien, einen Baum zu traversieren.
- Sie können Baumtraversierungsalgorithmen implementieren.

### Auftrag

Ein Baum bestehe aus Knoten, die das folgende Java-Interface repräsentieren:

```
package ch.ffhs.dua.tree;
public interface TreeNode<N> {
    N value();
    List<N> children();
}
```

#### Aufgabe 1

Analog zu den Traversierungen in 6.2.4 aus [SG] implementiere man rekursiv eine Traversierung für beliebige (nicht nur binäre) Bäume.

Implementiere Sie dazu eine Klasse DepthFirstTraverser

```
package ch.ffhs.dua;
public abstract class DepthfirstTraverser<N> {
    public void traverse(TreeNode<N> node) { ... }
    public abstract  void preOperation(N value) { }   
    public abstract void postOperation(N value) { }   
}
```

In konkreten Subklassen sollte mindestens eine der beiden Methoden preOperation oder postOperation überschrieben sein. Für jeden Knoten k wird einmal preOperation(k.value()) und einmal postOrder(k.value()) aufgerufen, und zwar preOperation(k.value()) bevor die Kinder von k durchlaufen werden, und postOperation(k.value()) nachdem die Kinder von k durchlaufen worden sind.

(Falls nur die Methode preOperation überschrieben wird, so entspricht das der Preorder-Traversierung bei Binärbäumen, falls nur postOperation überschrieben wird, so entspricht das der Postorder-Traversierung bei Binärbäumen.)

#### Aufgabe 2

Analog zu Aufgabe 1 implementiere man einen Traverser für beliebige (nicht nur binäre) Bäume, jedoch ohne Rekursion zu verwenden. Der Einfacheit halber können Sie sich hier Pre-Order-Traversierung beschränken:

Implementiere Sie dazu eine Klasse DepthFirstPreOrderTraverser.

#### Aufgabe 3

Zu einem Baum erzeuge man einen Traverser als Iterator, der das Interface Iterator<N> implementiere. Dieser Iterator liefere die Knotenwerte in einer Pre-Order zurück. (Die remove Methode des Iterators soll eine UnsupportedOperationException werfen.)

(Hinweis: Sie können von Code des Traversers ohne Rekursion benutzen und anpassen. (Die rekursive Version kann ebenfalls verwendet werden, das ist aber komplizierter, da man die Rekursion unterbrechen muss; das könnte man machen, indem man die Rekursion in einem eigenen Thread laufen lässt und das Erzeuger-Verbraucher Muster verwendet).)

```
package ch.ffhs.dua;
public abstract class DepthfirstTraverser<N> {
    public void traverse(TreeNode<N> node) { ... }
    public abstract void preOperation(N value) { }   
    public void traverse(TreeNode<N>) {
        ...
    }   
}
```

#### Aufgabe 4

Die bis jetzt unterssuchten Traverser verfolgen eine depth-first Strategie. Ein Baum kann jedoch auch mit der Breitensuche (oder Level-Suche) traversiert werden. Bei der Breitensuche wird zuersz die Wurzel besucht, dann alle Knoten mit Tiefe 1 (die Kinder der Wurzel), dann die Knoten mit Tiefe 2 (Enkelknoten der Wurzel) usw.

Implementieren Sie einen Traverser, der die Knoten eines Baumes mit Breitensuche traversiert.

(Hinweis: In Analogie zur Tiefensuche muss hier nicht ein Stack, sondern eine Queue verwendet werden mit zu besuchenden Knoten.

- Dieser Queue wird zu Beginn die Wurzel des Baumes hinzugefügt.
- Folgende Schritte werden wiederholt, bis die Queue leer ist:
  - Der erste Knoten k der Queue wird entfernt und besucht.
  - Alle Kinder von k werden der Queue am Ende hinzugefügt.)
- Verwenden Sie dazu die Klassenrümpfe im package ch.ffhs.dua.tree iim AufgabenProjekt aus dem Informationsblock dieses Moodle-Kurses.
- Stellen Sie sicher, dass das Projekt kompiliert werden kann und dass alle TestCases laufen.
- Pushen Sie Ihre Lösung in Git und erstellen Sie in git einen Tag «TreeAufgaben».
- Bestätigen Sie hier durch einen kurzen Texteintrag, dass Sie die Aufgabe fertig gelöst haben.
