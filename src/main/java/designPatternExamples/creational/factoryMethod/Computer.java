package designPatternExamples.creational.factoryMethod;

public abstract class Computer {

    public abstract String getRAM();
    public abstract String getHHD();
    public abstract String getCPU();


    public String toString(){
        return "RAM: " + this.getRAM() + " HHD: " + this.getHHD() + " CPU: " + this.getCPU();
    }

}
