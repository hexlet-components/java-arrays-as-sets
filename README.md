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
[![Hexlet Ltd. logo](https://raw.githubusercontent.com/Hexlet/assets/master/images/hexlet_logo128.png)](https://hexlet.io?utm_source=github&utm_medium=link&utm_campaign=java-arrays-as-sets)

This repository is created and maintained by the team and the community of Hexlet, an educational project. [Read more about Hexlet](https://hexlet.io?utm_source=github&utm_medium=link&utm_campaign=java-arrays-as-sets).

See most active contributors on [hexlet-friends](https://friends.hexlet.io/).
