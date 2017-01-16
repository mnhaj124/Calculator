package pk.ciit.sc.final1.calculator;

import org.junit.Test;

import junit.framework.TestCase;

public class TestCalculator extends TestCase {

	
	@Test
	public void testFindMax()
	{
		System.out.println("Testing");
		Calculator c=new Calculator();
		int expected=c.findMax(3, 2, 1);
		System.out.println("Max : "+expected);
		assertEquals(expected,3);
	}
	
	
	@Test
	public void testFindMax1()
	{
		System.out.println("Testing");
		Calculator c=new Calculator();
		int expected=c.findMax(3, 5, 7);
		System.out.println("Max : "+expected);
		assertEquals(expected,7);
	}
	
	@Test
	public void testSquare()
	{
		System.out.println("Testing");
		Calculator c=new Calculator();
		int expected=c.square(2);
		assertEquals(expected,4);
		
	}
	
	@Test
	public void testCube()
	{
		System.out.println("Testing");
		Calculator c=new Calculator();
		int expected=c.cube(2);
		assertEquals(expected,8);
		
	}
	
	
}
