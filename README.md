# Object Oriented Programming Practice

Repo just to showcase what I am learning in object-oriented programming. Implemented with Java and Python


## Terminology

### Classes
- __Class__ - contains instructions for how objects can be created, as well as how objects carry out certain actions
- __Superclass / Parent class__ - a class that has other classes inheriting to it
- __Subclass / Child class__ - a class that inherits from other classes
- __Abstract class__ - a class that can only be extended  
  - Cannot instantiate an instance of an abstract class
  - Only meant to be a parent of another class
- __Interface__ - classes that use an interface are compulsory to implement the methods defined in an interface

### Associations
- __Composition__ - a particular object is composed of other objects. If the containing object ceases to exisst, then the internal parts it's composed of no longer exists

#### ___Example 1___
```java
public class Vehicle {

  // If the vehicle ceases to exist, then so does the engine
  Engine myEngine;
  
  public Vehicle(Engine engine) {
    myEngine = engine;
  }
  
  public void operateVehicle() {
    myEngine.start();
  }
  
  // ...
}
```

#### ___Example 2___
```java

// If the department closes down, then the courses no longer exist
public class SchoolLanguageDepartment {
  SpanishCourse spanish;
  FrenchCourse french;
  JapaneseCourse japanese;
}
```
