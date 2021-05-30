class Daddy
{
	Daddy( int age)
	{
		System.out.println("Dad  is the head of family");
	}
}
class Mummy extends Daddy
{
	Mummy()
		{
	super(43);
	System.out.println(" Mummy and Daddy are husband and wife");
		}

}
class Child1 extends Mummy
{
	Child1(int s)
	{
		System.out.println("Child1 is the first child of Mummy and Daddy");
	}

}
class Child2 extends Child1
{
	Child2()
	{
		super(34);
		System.out.println("Child1 and child 2 are siblings");
		}
}
class KhanFamily 
{
	public static void main(String[] args) 
	{
		System.out.println("Start of Java Code");
		Child2 sc=new Child2();
		System.out.println("End of java code");
	}
}
