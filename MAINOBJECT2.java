class Object2
{
	static int k=45;
		double l=790.23;
	static double m=123.90;
	static void display()
	{
		System.out.println("EXECUTING DISPLAY METHOD");
		System.out.println("**************************");
		System.out.println("ENDING OF DISPLAY METHOD");
	}
	void execute()
	{
		System.out.println("execution will start here");
	}
}





class MAINOBJECT2 
{
	public static void main(String[] args) 
	{
		System.out.println("START OF THE PROGRAM");
		System.out.println("k is"+ Object2.k);
		System.out.println("l is"+ new Object2().l);
		System.out.println("m is"+Object2.m);
		Object2.display();
		new Object2().execute();
		System.out.println("END OF THE PROGRAM!");
	}
}
