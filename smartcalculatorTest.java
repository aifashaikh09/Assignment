package isa;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class smartcalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("After Class");
	}

	@Test
	public void testSimpleinterest() 
	{
		smartcalculator sc = new smartcalculator();
	      sc.setP(300);
	      sc.setT(3);
	      sc.setR(2);
	      System.out.println("Simple Interest");
	      double res= smartcalculator.simpleinterest();
	      assertEquals(18,res,0.001);
	}

	@Test
	public void testCompoundinterest() 
	{
		System.out.println("Coumpound Interest");
	       double res1=smartcalculator.compoundinterest(200,4,2);
	        assertEquals(200, res1,0.001);
		
	}

	@Test
	public void testMean() 
	{
		System.out.println("Mean of the given number");
        int[] num= {1,2,3,4,5,6,7};
         int res2=smartcalculator.mean(num);
         assertEquals(4,res2);
		
	}

	@Test
	public void testFactorial() 
	{
		System.out.println("Factorial of a numb");
		int res3=smartcalculator.factorial(4);
        assertEquals(24,res3);
	}

	@Test
	public void testPercent() 
	{     smartcalculator sc = new  smartcalculator(); 
		System.out.println("Percentage");
			sc.setTotal(600);
			sc.setObtained (400);
         	double res4=smartcalculator.percent();
			assertEquals(66,res4,0.01);
		
	}

}

