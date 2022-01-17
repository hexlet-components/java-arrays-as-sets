# java-arrays-as-sets

**Usage example:**

Intersection:

```java
import static io.hexlet.utils.ArraysAsSets;

String[] firstNames = {"Vasya", "Kolya", "Petya"};
String[] secondNames = {"Igor", "Petya", "Sergey", "Vasya", "Sasha"};

intersection(firstNames, secondNames); // => ["Vasya", "Petya"]
```

Union:

```java
import static io.hexlet.utils.ArraysAsSets;

String[] firstNames = {"Vasya", "Kolya", "Petya"};
String[] secondNames = {"Igor", "Petya", "Sergey", "Vasya", "Sasha"};

union(firstNames, secondNames); // => ["Petya", "Sasha", "Igor", "Kolya", "Vasya", "Sergey"]
```

Difference:

```java
import static io.hexlet.utils.ArraysAsSets;

String[] firstNames = {"Vasya", "Kolya", "Petya"};
String[] secondNames = {"Igor", "Petya", "Sergey", "Vasya", "Sasha"};
difference(firstNames, secondNames); // => ["Kolya"]
```

Includes:

```java
import static io.hexlet.utils.ArraysAsSets;

String[] names = {"Vasya", "Kolya", "Petya"};

includes(names, "Vasya"); // => true
includes(names, "Sergey"); // => false
```
