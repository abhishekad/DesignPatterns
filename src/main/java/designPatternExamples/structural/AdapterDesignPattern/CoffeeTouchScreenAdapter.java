package designPatternExamples.structural.AdapterDesignPattern;

public class CoffeeTouchScreenAdapter implements CoffeeMachineInterface{

    OldCoffeMachine oldie = new OldCoffeMachine();

    @Override
    public void chooseFirstSelection() {
        oldie.selectA();
    }

    @Override
    public void chooseSecondSelection() {
        oldie.selectB();

    }


}
