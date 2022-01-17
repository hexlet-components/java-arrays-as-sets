# java-arrays-as-sets

# Usage example:

Intersection:
```
import static lib.ArraysAsSets.*;

String[] firstArr = new String[]{"Vasya", "Kolya", "Petya"};
String[] secondArr = new String[]{"Igor", "Petya", "Sergey", "Vasya", "Sasha"};

intersection(firstArr, secondArr) => ["Vasya", "Kolya"]
```

Union:
```
import static lib.ArraysAsSets.*;

String[] firstArr = new String[]{"Vasya", "Kolya", "Petya"};
String[] secondArr = new String[]{"Igor", "Petya", "Sergey", "Vasya", "Sasha"};

union(firstArr, secondArr) => ["Petya", "Sasha", "Igor", "Kolya", "Vasya", "Sergey"]
```

Difference:
```
import static lib.ArraysAsSets.*;

String[] firstArr = new String[]{"Vasya", "Kolya", "Petya"};
String[] secondArr = new String[]{"Igor", "Petya", "Sergey", "Vasya", "Sasha"};
difference(firstArr, secondArr) => ["Kolya"]
```

Includes:
```
import static lib.ArraysAsSets.*;

String[] firstArr = new String[]{"Vasya", "Kolya", "Petya"};

includes(firstArr, "Vasya") => true
includes(firstArr, "Sergey") => false
```
