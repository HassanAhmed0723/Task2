package task2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class accounttest {

	@Test
	public void test1() {
		account testing = new account();
		int output = testing.access(1122);
		assertEquals(1122,output);
	}


}
