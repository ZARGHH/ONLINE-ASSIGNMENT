class Object1
{
	int a=78;
	 int b=47;
	 int area=a*b;
}


class NONSTATIC
{
	public static void main(String[] args) 
	{
		System.out.println("START OF JAVA CODE");
		Object1 ref=new Object1();
		System.out.println("a is"+ new Object1().a);
		System.out.println("b is"+ new Object1().b);
		System.out.println("area is"+ new Object1().area);
		ref.a=12;
		System.out.println("reinitalized value of a is"+ref.a);
		ref.b=2;
		System.out.println("reinitalized value of b is"+ref.b);
		ref.area=24;
		System.out.println("reinitalized value of area is"+ref.area);
		System.out.println("END OF JAVA CODE");

	}
}
