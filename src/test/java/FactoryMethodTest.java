import designPatternExamples.creational.factoryMethod.Computer;
import org.junit.jupiter.api.Test;

import static designPatternExamples.creational.factoryMethod.ComputerFactory.getComputer;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryMethodTest {

    @Test
    public void testClientCreation(){
        String RAM = "8 GB";
        String HHD = "16 GB";
        String CPU = "intel i5 gen 12";
        Computer pc = getComputer("PC", RAM, HHD, CPU);
        assertEquals(pc.getRAM(), RAM);
        assertEquals(pc.getHHD(), HHD);
        assertEquals(pc.getCPU(), CPU);
    }
}
