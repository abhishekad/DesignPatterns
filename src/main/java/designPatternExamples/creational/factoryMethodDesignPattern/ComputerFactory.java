package designPatternExamples.creational.factoryMethodDesignPattern;

public class ComputerFactory {

    // create a factory object whose role is to create product objects of particular types.
    // In general, a factory object is an instance of such a class, which has a method to create product objects

    /*
     why factory method?
    The knifeStore and its orderKnife method may not be the only client of your knifeFactory. Other clients may use knifeFactories to create knives for other purposes.
    Maybe there's a method for bulk orders or equality testing.
    Since all  the actual knife creation happens in the knifeFactory, you can simply add new knife types to your knifeFactory without modifying the client code.
    "If there are multiple clients that want to instantiate the same set of classes, then by using a factory object, you have cut out redundant code and made the software easier to modify."

     INTENT
     The factory method design intent is to define an interface for creating objects, but let the sub-classes decide which class to instantiate.

     Factories allow client code to operate on generalizations. This is called coding to an interface, not an implementation

     */

    // This is example method of the factory method design pattern implementation
    /* components of factory method design pattern is as below
    1. Super class : Super class in factory design pattern can be an interface, abstract class or a normal java class.
    2. Sub-classes : which extends super class
    3. Factory class : this creates the objects based on the parameters provided
     */

    public static Computer getComputer(String type, String RAM, String HHD, String CPU){
        if("PC".equalsIgnoreCase(type))  return new Client(RAM, HHD, CPU);
        if("Server".equalsIgnoreCase(type)) return new Server(RAM, HHD, CPU);
        return null;
    }
}
