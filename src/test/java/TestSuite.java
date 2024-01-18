import creationDpTest.FactoryMethodTest;
import creationDpTest.SingletonPatternTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import structuralDpTest.FacadePatternTest;


@SelectClasses({FactoryMethodTest.class
        , SingletonPatternTest.class, FacadePatternTest.class})
@Suite
public class TestSuite {

}

