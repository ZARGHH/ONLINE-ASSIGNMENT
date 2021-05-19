class Object3
{ 
	 static int a=56;
	 static int b=45;
	  static void add()
	{
		  System.out.println(a+b);
	}
	void difference()
	{
		System.out.println(a-b);
	}

}


class MAINOBJECT3 
{
	int c=24;
		int d=72;
	
		void prod()
		{
System.out.println(c*d);
		}
	   void div()
		{
		System.out.println(d/c);
		}
	public static void main(String[] args) 
	{
		System.out.println("Start of main class!");

System.out.println("a is"+ Object3.a);
System.out.println("b is"+ Object3.b);
Object3.add();
new Object3().difference();
System.out.println("c is"+ new MAINOBJECT3().c);
System.out.println("d is"+ new MAINOBJECT3().d);
new MAINOBJECT3().prod();
 new MAINOBJECT3().div();
System.out.println("END OF MAIN CLASS");



	}
}
