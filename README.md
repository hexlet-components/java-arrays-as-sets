# java-arrays-as-sets

## Usage

### Intersection

```java
import static io.hexlet.utils.ArraysAsSets;

String[] firstNames = {"Vasya", "Kolya", "Petya"};
String[] secondNames = {"Igor", "Petya", "Sergey", "Vasya", "Sasha"};

intersection(firstNames, secondNames);
// ["Vasya", "Petya"]
```

### Union

```java
import static io.hexlet.utils.ArraysAsSets;

String[] firstNames = {"Vasya", "Kolya", "Petya"};
String[] secondNames = {"Igor", "Petya", "Sergey", "Vasya", "Sasha"};

union(firstNames, secondNames);
// ["Petya", "Sasha", "Igor", "Kolya", "Vasya", "Sergey"]
```

### Difference

```java
import static io.hexlet.utils.ArraysAsSets;

String[] firstNames = {"Vasya", "Kolya", "Petya"};
String[] secondNames = {"Igor", "Petya", "Sergey", "Vasya", "Sasha"};
difference(firstNames, secondNames);
// ["Kolya"]
```
