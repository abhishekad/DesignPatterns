package structuralDpTest;

import designPatternExamples.structural.AdapterDesignPattern.BirdAdapterDP;
import designPatternExamples.structural.AdapterDesignPattern.ToyDuck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdapterPatternTest {
    ToyDuck td = new ToyDuck();

    @Test
    public void testToyDuckVoice(){
        assertEquals(td.squeak(), "Squeak... Squeak");
    }

    @Test
    public void testAdapter(){
        BirdAdapterDP adapterDP = new BirdAdapterDP(td);
        assertEquals(adapterDP.fly(), "Duck jump....");
    }

    @Test
    public void testDuckVoiceViaAdapter(){
        BirdAdapterDP adapterDP = new BirdAdapterDP(td);
        assertEquals(adapterDP.makeSound(), "Squeak... Squeak");
    }
}
