# Lab Assignment 12

In this lab you will practice working with static variables.

Unlike previous labs, your class has already been created for you. 

## Let's get started!

First, let's look at the name of our .java file in the src/ directory and name your class accordingly and remember to make it **public**. Next, **create your main() method inside your class**.

Now let's begin!

## Static

**Revision:** The static keyword is used for accessing methods and attributes from a class without an object, however its main purpose is for memory management.

Static variables are initiated prior to being instanciated. This means static variables are allocated in memory prior to the creation of any objects.
ystem.out.println("Hello, World!");
<img src="img/static.png" width="300px">

Thus the same static variable is used throughout all instances (objects). If a static variable is updated in one objects, it gets updated for all the other objects.

```java
public class Main {
    public static void main(String[] args) {
        // Object 1
        Dog dog1 = new Dog();
        dog1.age = 7;

        // Object 2
        Dog dog2 = new Dog();
        dog2.showAge(); // Will output 7, since age is static.
    }
}

class Dog {
    String name;
    static int age = 5; // same variable will be used for all objects.

    public void showAge() {
        System.out.println(age);
    }
}
```

Static methods (functions) are simply accessible outside the class without an object, however any global variables used inside must be static as well, since non-static variables won't be initiated until an object is created.

## Your Program

### Student Manager

Create a class Student to with the following attributes `name`, `age`, `school_id` and with the method `studentInfo()` that prints out the name, age, and school_id of each student.

Since all students go to the same school, make the `school_id` static.

Now, see for yourself how **static** variables work. Create multiple student objects and see how updating the `school_id` for one objects affects all the other objects.

## Submit your assignment

To submit your lab assignment click on the source control icon (3 circles with 2 lines) on your leftside navbar. Next, click on the '+' symbol next to "Changes" to stage your changes. Lastly, add a commit message (ex: "First commit") and click "Commit" then "Push" or "Sync Changes". And you're done!