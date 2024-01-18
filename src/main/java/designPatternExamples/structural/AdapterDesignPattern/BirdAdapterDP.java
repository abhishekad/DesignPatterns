package designPatternExamples.structural.AdapterDesignPattern;

public class BirdAdapterDP implements BirdTargetInterface{

    /*
    The output of one system may not conform with the expected input of another system.
    You'll find that this is a recurring problem when your preexisting system needs to incorporate third-party libraries, or needs to connect to other systems.
    The adapter design pattern will help facilitate communication between two existing systems by providing a compatible interface.

    1. The client class will be part of your system that wants to use a third-party library or external system.
    2. The adaptee is a class in the third-party library or external system to be used.
    3. Adapter The adapter class sits in between the client and the adaptee. It will implement a target interface which is the interface that the client will use.
         The adapter conforms to what the client is expecting to see

    >> Steps to implement adapter desing pattern
    Step one. design the target interface. You create the target interface that your adapter class will be implementing for your client class to use.
    Step two. implement the target interface with the adapter class. Your adapter provides the methods that will take the client classes object and convert it into a Json object.
            This means that the adapter can convert any instance of a class that the client can create and send that in a request. The adapter class also handles transferring the translated request to the adaptee.
            The client class only needs to know about the target interface of the adapter.
    Step three. send the request from the client to the adapter using the target interface. The WebClient is responsible for doing some work to create your message for you.

    >> Remember,
    that an adapter is meant to wrap the adaptee and expose a target interface to the client.
    Indirectly change the adaptee's interface into one that the client is expecting by implementing a target interface
    Indirectly translate the client's request into one the adaptee is expecting.
    Reuse an existing adaptee with an incompatible interface.

    >>> Why?
    It isn't always practical to rewrite large chunks of your system in order to properly interface with new third-party libraries or external systems.
    Just because an interface doesn't conform to what your system is expecting, doesn't mean that your system has to change.
    The adapter design pattern is a technique that helps bridge the gap between two incompatible interfaces.
    This will let you continue to use your existing systems and integrate external sources into them.


    >> Common Scenario:
    Integrating legacy code with new code that expects a different interface.
    Using third-party libraries that don't align with your application's interfaces

     */

    private ToyDuck toyDuck;
    public BirdAdapterDP(ToyDuck toyDuck){
        this.toyDuck = toyDuck;
    }

    @Override
    public String fly() {
        return "Duck jump....";

    }

    @Override
    public String makeSound() {
        return toyDuck.squeak();
    }
}
