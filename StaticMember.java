class Static1
{
	static int a=2;
	static int b=8;
	static  void area()
	{
		 int c=a*b;
		 System.out.println(  "a is"+a);
		 System.out.println("b is"+b);
		 System.out.println("Area is"+c);
}
}


class StaticMember 
{
	public static void main(String[] args) 
	{
	System.out.println("Start of Java Code");
	System.out.println("a is"+ Static1.a);
	System.out.println("b is"+ Static1.b);
	Static1.area();
	System.out.println("End of Java Code");
	}
}
