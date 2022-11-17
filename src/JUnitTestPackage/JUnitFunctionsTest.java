package JUnitTestPackage;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class JUnitFunctionsTest {

	@Test
	public void test() {
		JUnitFunctions junit = new JUnitFunctions();
		int result = junit.addNumbers(100, 200);
		assertEquals (300, result);
	}

}
