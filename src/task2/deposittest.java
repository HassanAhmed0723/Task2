package task2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class deposittest {
	
	@Test
	public void test() {
			account testing = new account();
			int output = testing.deposit(500);
			assertEquals(1000,output);
		}

}
