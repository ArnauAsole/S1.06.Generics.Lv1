# 📖📄 S1.06.JavaGenerics.Lv1
## 📂📄 Generic Programming in Java – Classes and Methods  

### 🧾 Exercise Description  
The goal of this set of exercises is to practice the use of generics and non-generic types in Java by building simple utility classes and methods. These exercises demonstrate type safety, flexibility, method overloading, and the handling of variable-length argument lists using generics.

### ✅ Requirements  

**Level 1 Exercises**

**Exercise 1**  
Create a class named `NoGenericMethods` that stores three arguments of the same type (non-generic). Implement methods to store and retrieve these objects, as well as a constructor to initialize them. Confirm that the arguments can be passed in any order to the constructor.

**Exercise 2**  
Create a class named `Persona` with attributes `name`, `surname`, and `age`. Then, create a class called `GenericMethods` that has a generic method accepting three arguments of generic types. This method should print all the arguments it receives.  
From the `main()` method, call the generic method using different data types (e.g., a `Persona` object, a `String`, and a primitive type).  
This confirms that the method can receive any type of parameter in any order.

### 🔨 Methods Implemented  

```java
// NoGenericMethods.java
Object getObj1()
Object getObj2()
Object getObj3()

// GenericMethods.java
<T, U, V> void printThree(String fixed, U second, V third)
<T> void printVarargs(T... args)
```

### 💻 Technologies Used

Java 17

IntelliJ IDEA (Community Edition)

No external libraries required

JUnit 5 (optional for testing)

### 📋 Prerequisites

Java JDK 17

IntelliJ IDEA Community Edition

Git (optional, for version control)

### 🛠️ Installation and Setup

Install Required Tools

Java JDK 17

IntelliJ IDEA Community Edition

Clone the Repository (Optional)

bash
```
git clone https://github.com/ArnauAsole/S1.06.Generics.Lv1.git
cd S1.06.JavaGenerics.Lv1/
```

Open the Project in IntelliJ
Go to File → Open and select the root folder of the project.

### ▶️ Running the Project

To run a specific exercise:

Open Main1.java or Main2.java

Right-click the file and select Run

The output will appear in the console

### 🌐 Deployment
This is a console-based Java project for educational purposes. No deployment is needed.

### 🤝 Acknowledgements
Special thanks to the contributors: Arnau, Adrià, Ignasi, Ana, Alejandro and Marc.
