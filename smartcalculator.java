package isa;

public class smartcalculator 
{
	
	private static int p, t, r;     //principal, time, rate
	int principal, time, rate; //a= amount
	int[] m;
    static int fact =1 ;
	private static int total, obtained;
	
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
	
	public smartcalculator(int a, int time, int rate, int[] m) 
	{
		
		this.principal = a;
		this.time = time;
		this.rate = rate;
		this.m = m;
	}

	public static int getP() {
		return p;
	}

	public static void setP(int p) {
		smartcalculator.p = p;
	}

	public static int getT() {
		return t;
	}

	public static void setT(int t) {
		smartcalculator.t = t;
	}

	public static int getR() {
		return r;
	}

	public static void setR(int r) {
		smartcalculator.r = r;
	}

	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		smartcalculator.total = total;
	}

	public static int getObtained() {
		return obtained;
	}

	public static void setObtained(int obtained) {
		smartcalculator.obtained = obtained;
	}

	public static double simpleinterest()
	{
		return (p*t*r)/100;
	}
	
	public static double compoundinterest(int principal, int rate, int time)
	{
		rate=rate/100;
		return (principal*Math.pow((1+rate/4),4*time));
		
	}
     
	public  static int mean(int[] input)
	{
		int sum = 0;
	    for (int i = 0; i < input.length; i++) {
	        sum += input[i];
	    }
	    return sum / input.length;
	}
	
	public static int factorial(int num)
	{
		int i;
		for (i=1; i<=num;i++)
		{
			fact = fact * num;
		}
		return fact;
	}
	
	public static double percent(int total, int obtained)
	{
		return (obtained*100)/total;
	}
}
