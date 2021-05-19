class Object5
{
	static int l=2;
	static int b=5;
 static int  s=2;
	 static void area()
	{
		 int a=l*b;
		 System.out.println("AREA OF RECTANGLE IS"+a);
	}
	static void area2()
	{
		int b1=s*s;
		System.out.println("AREA OF SQUARE IS"+b1);
	}

}
class MAINOBJECT5 
{
	public static void main(String[] args) 
	{
		System.out.println("Start of main class");
		System.out.println("l is"+ Object5.l);
		System.out.println("b is"+Object5.b);
		Object5.area();
		System.out.println("s is"+ Object5.s);
		Object5.area2();
		System.out.println("end of main class");

	}
}
