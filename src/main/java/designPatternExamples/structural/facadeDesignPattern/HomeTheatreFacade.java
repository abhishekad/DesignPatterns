package designPatternExamples.structural.facadeDesignPattern;

public class HomeTheatreFacade {

    /*
    >> Info
    The facade design pattern provides a single simplified interface for client classes to interact with the subsystem.
    A facade is a wrapper class that encapsulate the subsystem in order to hide the subsystem's complexity.
    This wrapper class will allow a client class to interact with the subsystem through a facade.
    In practice, a facade class can be used to wrap all the interfaces and classes for a subsystem.

    << Encapsulation, Information Hiding and Separation of Concerns >>

    >> Steps to Implement facade design pattern:
    Step one: Design the interface.
    Step two. Implement the interface with one or more classes.
    Step three. Create the facade class and wrap the classes that implement the interface.
    Step four. Use facade class to access the sub-system.

    >> Characteristics of the facade design pattern:
    The facade design pattern is a means to hide the complexity of a subsystem by encapsulating it behind a unifying wrapper called a facade class;
     removes the need for client classes to manage a subsystem on their own, resulting in less coupling between the subsystem and the client classes;
     handles instantiation and redirection of tasks to the appropriate class within the subsystem;
     provides client classes with a simplified interface for the subsystem;
     acts simply as a point of entry to a subsystem and does not add more functionality to the subsystem.
     The facade design pattern is a way to provide client classes with an easier means of interacting with the parts of your system.
     Complex subsystems can be difficult to use and navigate. By providing a simpler interface through a facade,
     client classes will have an easier time successfully using your software.


     */


    /*
    ========================================================================================================================
    In this class we create a facade for the home theater system. We have diff sub system such as TV, Projector, DVD, sound system etc
    so we need to interact with each component to turn home theatre on instead we create a home theatre facade.
    ========================================================================================================================
     */

    private TV tv;
    private SoundSystem soundSystem;
    private DVDPlayer dvd;
    private Projector projector;

    public HomeTheatreFacade(TV tv, SoundSystem soundSystem, DVDPlayer dvd, Projector projector){
        this.tv = tv;
        this.soundSystem = soundSystem;
        this.dvd = dvd;
        this.projector = projector;
    }


    public String setUpHomeTheatre(){
        tv.turnTVOn();
        soundSystem.turnSoundOn();
        dvd.turnDVDOn();
        projector.turnProjectorOn();
        return "Home theatre set up complete..";
    }

    public String watchMovie(){
        tv.setTVChannel();
        soundSystem.setSound();
        dvd.setDVD();
        projector.setProjector();
        return "Now Playing the Movie..";
    }

    public String switchOffTheatre(){
        tv.turnTVOff();
        soundSystem.turnSoundOff();
        dvd.turnDVDOff();
        projector.turnProjectorOff();
        return "Home theatre turned off..";
    }

}
