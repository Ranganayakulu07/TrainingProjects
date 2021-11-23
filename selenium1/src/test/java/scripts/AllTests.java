package scripts;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
//TestSuite
@RunWith(Suite.class)
@SuiteClasses({ addDivTest.class, calculator1.class })
public class AllTests {

}
