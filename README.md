# java-arrays-as-sets

# Usage example:

Intersection:
```java
import static lib.ArraysAsSets.*;

String[] firstArr = new String[]{"Vasya", "Kolya", "Petya"};
String[] secondArr = new String[]{"Igor", "Petya", "Sergey", "Vasya", "Sasha"};

intersection(firstArr, secondArr) => ["Vasya", "Petya"]
```

Union:
```java
import static lib.ArraysAsSets.*;

String[] firstArr = new String[]{"Vasya", "Kolya", "Petya"};
String[] secondArr = new String[]{"Igor", "Petya", "Sergey", "Vasya", "Sasha"};

union(firstArr, secondArr) => ["Petya", "Sasha", "Igor", "Kolya", "Vasya", "Sergey"]
```

Difference:
```java
import static lib.ArraysAsSets.*;

String[] firstArr = new String[]{"Vasya", "Kolya", "Petya"};
String[] secondArr = new String[]{"Igor", "Petya", "Sergey", "Vasya", "Sasha"};
difference(firstArr, secondArr) => ["Kolya"]
```

Includes:
```java
import static lib.ArraysAsSets.*;

String[] firstArr = new String[]{"Vasya", "Kolya", "Petya"};

includes(firstArr, "Vasya") => true
includes(firstArr, "Sergey") => false
```
