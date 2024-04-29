package com.demo;

public class MyClass {

//    Every program should have atleast 1 class, and 1 main method
//    You can't run/compile without a main method. IntelliJ won't show the option -
//    this is because the main method is similar to the entry point of the program

    public static void main(String[] args) { // JVM execution starts here
        System.out.println("Main Method");
        method();
    } // JVM execution ends here

    public static void method() { // need to call this
        System.out.println("Test");
    }

//     Fix this problem: compiling this from the command line using javac & java

//    If method is defined in another class: you need to run Class.method();
//    This is basically the idea of contextualization based on scope.

// Look more into these - understand the differences:
//    Static method - basically if we do not create instances then we use static. Also cannot be overridden.
//    Non-static method (also called instance method). Instance is a synonym of object.
//    Static vs non-static is related to objects.

// ---------------------

//    Access Modifiers (we have 4 in total):

//    Private: can only be accessed from inside the class, so not outside the class.
//    Default: can be accessed from inside the class and inside the package, not outside the package. This is there by
//    default. If you don't put an access modifier it will put default, as the name suggests.
//    Protected: can only be accessed from inside the class and package, and also outside the package because of inheritance.
//    Public: can be accessed from everywhere.


//            | Access Modifier | Inside Class | Inside Package | Outside Package | Subclass Outside Package |
//            |-----------------|--------------|----------------|-----------------|--------------------------|
//            | Private         | ✅           | ❌             | ❌              | ❌                       |
//            | Default         | ✅           | ✅             | ❌              | ❌                       |
//            | Protected       | ✅           | ✅             | ✅              | ✅                       |
//            | Public          | ✅           | ✅             | ✅              | ✅                       |

//    ---------------------

//    ⏎ Return values

//    Can be Primitive or Non-Primitive (basically objects)
//    Primitive: [Byte, Short, Int, Long (int values)], Char, [Float, Double (under decimal values)],  Boolean
//    Byte(s) allocated: Byte is 1, Short is 2, Int is 4, Long is 8. Char is 2. Float is 4. Double is 8. Boolean is 1.

//            | Data Type | Byte(s) Allocated |
//            |-----------|-------------------|
//            | byte      | 1                 |
//            | short     | 2                 |
//            | int       | 4                 |
//            | long      | 8                 |
//            | char      | 2                 |
//            | float     | 4                 |
//            | double    | 8                 |
//            | boolean   | 1                 |

//    Non-Primitive

//    Like class types (like String), Arrays.

//    ---------------------

//    📝 Camel Case Notation:

//    classes: first letter of each word should be capitalized
//    method: first letter of first word should be lower-case, rest of words start with capital.
//    variables: same as method ☝️


//    ---------------------

//    Arrays (it is a data structure. Classes are also a type of data structure)

//    It is a class. An array is a representation of contiguous allocated memory slots. In Java, must be same data types.

// Non-Primitive types hold the information of the reference (address) and data (what is actually stored)
// Reference could look something like: I@6504e3b2

}
