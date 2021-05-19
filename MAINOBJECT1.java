class Object1


{
	 static int a=21;
	 double b=78.5;
	 static void run()
	{
		 System.out.println("start of run method");
		 System.out.println("**************************");
		 System.out.println("end of run method");
	}
}


class MAINOBJECT1

{
	public static void main(String[] args) 
	{
	System.out.println("start of main class");	
		System.out.println("a is"+ Object1.a);
		System.out.println("b is "+new Object1().b);
		 Object1.run();
System.out.println("end of main class");
	}
}
