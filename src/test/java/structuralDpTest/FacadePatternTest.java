package structuralDpTest;

import designPatternExamples.structural.facadeDesignPattern.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacadePatternTest {

    TV tv = new TV();
    SoundSystem soundSystem = new SoundSystem();
    DVDPlayer dvd = new DVDPlayer();
    Projector projector = new Projector();

    @Test
    public void testHomeTheatreFacade(){

        HomeTheatreFacade hmf = new HomeTheatreFacade(tv, soundSystem, dvd, projector);
        assertEquals(hmf.setUpHomeTheatre(), "Home theatre set up complete..");
    }

    @Test
    public void testWatchMovie(){

        HomeTheatreFacade hmf = new HomeTheatreFacade(tv, soundSystem, dvd, projector);
        assertEquals(hmf.watchMovie(), "Now Playing the Movie..");
    }

    @Test
    public void testSwitchOffTheatre(){

        HomeTheatreFacade hmf = new HomeTheatreFacade(tv, soundSystem, dvd, projector);
        assertEquals(hmf.switchOffTheatre(), "Home theatre turned off..");

    }
}
