package designPatternExamples.structural.AdapterDesignPattern;

public class ToyDuck {

    //(Existing Class with Different Interface):

    public String squeak(){
        System.out.println("Squeak... Squeak");
        return "Squeak... Squeak";
    }


    /// The toy duck cant fly but the BirdTargetInterface has fly method. toy duck can jump hence we need a adapter class
}
