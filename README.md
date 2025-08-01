# Lab Assignment 19

In this lab you will practice working with static variables.

Unlike previous labs, your class has already been created for you. 

## Let's get started!

For this lab your **main() method** is in the School class. You can create any new classes below the Shool class or inside a new java file. 

Now let's begin!

## Static

The static keyword is used for accessing methods and attributes from a class without an object, however its main purpose is for memory management.

The static keyword must be added before the type of the attribute or method.

**Static attributes (variables)** are initiated prior to being instanciated. This means static variables are allocated in memory prior to the creation of any objects.

<img src="img/static.png" width="300px">

Thus the same static variable is used throughout all instances (objects). If a static variable is updated in one objects, it gets updated for all the other objects.

<img src="img/shared_mem.png" width="300px">

**Code Example:**

```java
public class Owner {
    public static void main(String[] args) {

        // Object 1
        Dog dog1 = new Dog();
        dog1.age = 7;

        // Object 2
        Dog dog2 = new Dog();
        System.out.println( dog2.age ); // Will output 7, since age is static.
    }
}

class Dog {

    public String name;
    public static int age = 5; // same variable will be used for all objects.
}
```

**Static methods (functions)** are simply accessible outside the class without an object. This means any outside variables & methods called inside a static method must be static themselves, since they need to allocated and initialized prior.

**Code Example:**

```java
public class Main {
    public static void main(String[] args) {
        // Accessing the random() method from class Math without an object.
        Math.random();
    }
}
```

## Your Program

### Student Manager

Create a class `Student` inside the `school` directory with the following **public** attributes `name` (String), `email` (String), and `school_id` (int) and create a **public** constructor to assign values to <ins>`name` and `email` ONLY</ins>.

Since all students go to the same school, make the `school_id` **static**.

===

Now, see for yourself how **static** variables work. Inside the `Main` class assign a value to `school_id` without creating an object, but by simply referencing it from the class.

Next, <ins>create 3 Student objects</ins> with a unique `name` and `email`, and output their information. Now, assign a new value to the `school_id` of one object and see how it affects all the objects by printing out their `school_id`.

Your output may look like:

```
Student Info: Bob Bobbert, bob@uni.edu, 123
Student Info: Carl Carlton, carl@uni.edu, 123
Student Info: Jane Janeson, jane@uni.edu, 123

Student Info: Bob Bobbert, bob@uni.edu, 456
Student Info: Carl Carlton, carl@uni.edu, 456
Student Info: Jane Janeson, jane@uni.edu, 456
```

You can test your solution by running the command below in your terminal.

```
./test.sh
```

## Submit your assignment

[Grading Criteria](https://joselitoguardado.dev/3326/labs/Lab_18.pdf)

[How to Submit Assignments to GitHub](https://joselitoguardado.dev/3326/How_to_Submit_Assignments_to_GitHub.pdf)
