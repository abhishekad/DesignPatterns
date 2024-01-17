package designPatternExamples.creational.factoryMethod;

public class Client extends Computer{

    private String RAM;
    private String HHD;
    private String CPU;

    public Client(String RAM, String HHD, String CPU){
        this.RAM = RAM;
        this.HHD = HHD;
        this.CPU = CPU;
    }
    @Override
    public String getRAM() {
        return this.RAM;
    }

    @Override
    public String getHHD() {
        return this.HHD;
    }

    @Override
    public String getCPU() {
        return this.CPU;
    }
}
