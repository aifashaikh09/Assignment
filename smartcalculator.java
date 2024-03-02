/**
 * Calculates different mathematical problems
 */
package isa;

public class smartcalculator 
{
	
	private static int p, t, r;     //principal, time, rate
	int principal, time, rate; //a= amount
	int[] m;
    static int fact =1 ;
	private static int total, obtained;
	
	/**
	 * Non parameterised constructor
	 */
	public smartcalculator ()
	{
		fact=1;
		total=500;
		obtained=400;
		t=5;
		p=500;
		r=3;
		principal=10;
		rate=4;
		time=2;
	}
	
	/**
	 * Parameterised constructor
	 * @param a
	 * @param time
	 * @param rate
	 * @param m
	 */
	public smartcalculator(int a, int time, int rate, int[] m) 
	{
		
		this.principal = a;
		this.time = time;
		this.rate = rate;
		this.m = m;
	}
	/**
	 * getter method
	 * @return total marks
	 */

	public static int getP() {
		return p;
	}
/**
 * This is Setter method 
 * @param p
 */
	public static void setP(int p) {
		smartcalculator.p = p;
	}

	/**
	 * This is getter method
	 * @return t
	 */
	public static int getT() {
		return t;
	}

	/**
	 * This is setter method
	 * @param t
	 */
	public static void setT(int t) {
		smartcalculator.t = t;
	}

	/**
	 * This is getter method
	 * @return r
	 */
	public static int getR() {
		return r;
	}

	/**
	 * This is setter method
	 * @param r
	 */
	public static void setR(int r) {
		smartcalculator.r = r;
	}

	/** 
	 * This is getter method
	 * @return total
	 */
	public static int getTotal() {
		return total;
	}

	/**
	 * This is setter method
	 * @param total
	 */
	public static void setTotal(int total) {
		smartcalculator.total = total;
	}

	/**
	 * This is getter method
	 * @return obtained
	 */
	public static int getObtained() {
		return obtained;
	}

	public static void setObtained(int obtained) {
		smartcalculator.obtained = obtained;
	}
	
	/**
	 * Calculate simple interest
	 * @return simple interest
	 */

	public static double simpleinterest()
	{
		return (p*t*r)/100;
	}
	
	/**
	 * Calculate compound interest
	 * @param principal
	 * @param rate
	 * @param time
	 * @return compound interest
	 */
	
	public static double compoundinterest(int principal, int rate, int time)
	{
		rate=rate/100;
		return (principal*Math.pow((1+rate/4),4*time));
		
	}
	
	/**
	 * calculate of a given number
	 * @param input number
	 * @return mean of a number
	 */
     
	public  static int mean(int[] input)
	{
		int sum = 0;
	    for (int i = 0; i < input.length; i++) {
	        sum += input[i];
	    }
	    return sum / input.length;
	}
	
	/**
	 * Calculate factorial of a given number
	 * @param num number
	 * @return fact factorial of given number
	 */
	
	public static int factorial(int num)
	{
		int i;
		for (i=1; i<=num;i++)
		{
			fact = fact * i;
		}
		return fact;
	}
	
	/**
	 * Calculate percentage 
	 * @return percentage
	 */
	
	public static double percent()
	{
		return (obtained*100)/total;
	}
}
