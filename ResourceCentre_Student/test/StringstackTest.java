import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StringstackTest {

	private String s1,s2;
	private Stringstack stack ;
	
	@Before 
	public void setUp() throws Exception {
		s1 = "Hello";
		s2 ="World";
		stack = new Stringstack();
	}
	
	@Test 
	public void pushTest() {
		//Normal condition:
		// New stack must be empty 
		// After pushing an element , stack is no longer empty 
		
	assertTrue(stack.isEmpty());
	stack.push(s1);
	assertFalse(stack.isEmpty());
	stack.clear();
	assertTrue(stack.isEmpty());
	//boundary
	stack.push(null);
	assertTrue(stack.isEmpty());
}
}