package designPatternExamples.creational;

import java.security.Signature;

public class Singleton {

    // This class show the implementation of singleton pattern

    /* singleton pattern can be implemented as : the design goal of having only one instance of a class
    you give the class a private constructor but how can we create an instance of the class if the constructor
    is private.

    step 1: The first is to declare a class variable called, say, unique instance.
            This class variable will refer to the one instance of your Singleton class.
            You declare the variable as private, so that it can only be modified within the class
    step 2: create a public method in the class that will create an instance of this class, but only if an instance does not exist already.
            We can call this method getInstance. This method will first check if the uniqueInstance variable is null.
            If it is null, then it will instantiate the class and set this variable to reference the object.
            If the uniqueInstance class variable currently references an object, in other words, if there is already an object of this class,
             then the method will simply return that object.
     */

    // Implementation

    private static Singleton uniqueInstance = null;  // step 1

    // private constructor
    private Singleton(){

    }

    // step 2
    public static Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }


}
