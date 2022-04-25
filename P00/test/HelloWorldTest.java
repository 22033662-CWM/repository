import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		HelloWorld h = new HelloWorld();
		String str1 = "Hello World";
		String str2 = h.announce();
		assertEquals(str1, str2);
	}

}
