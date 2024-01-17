import designPatternExamples.creational.Singleton;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingletonPatternTest {

    @Test
    public void testSingletonPattern(){
        Singleton sing = Singleton.getInstance();
        Singleton sing2 = Singleton.getInstance();
        assertEquals(sing, sing2);
    }
}
