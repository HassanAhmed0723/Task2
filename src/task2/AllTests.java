package task2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ accountfailedtest.class, accounttest.class, depositfailedtest.class, deposittest.class })
public class AllTests {

}
