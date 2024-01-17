import designPatternExamples.creational.factoryMethodDesignPattern.Computer;
import org.junit.jupiter.api.Test;

import static designPatternExamples.creational.factoryMethodDesignPattern.ComputerFactory.getComputer;
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

    @Test
    public void testServerCreation(){
        String RAM = "52 GB";
        String HHD = "265 GB";
        String CPU = "intel i5 gen 19";
        Computer server = getComputer("server", RAM, HHD, CPU);
        assertEquals(server.getRAM(), RAM);
        assertEquals(server.getHHD(), HHD);
        assertEquals(server.getCPU(), CPU);
    }

    @Test
    public void testNoneOfTheOptions(){
        String RAM = "5 GB";
        String HHD = "25 GB";
        String CPU = "intel i5 gen 19";
        Computer client = getComputer("Client", RAM, HHD, CPU);
        assertEquals(client, null);

    }
}
