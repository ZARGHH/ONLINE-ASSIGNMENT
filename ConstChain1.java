class Const1
{
	Const1(int a)
	{
		
		System.out.println("CONSTRUCTOR 1 EXECUTED");
		}

}
class Const2 extends Const1
{ 
	Const2()
	{
		super(23);
		System.out.println("Constructor 2 excuted");
		
}
}
class Const3 extends Const2
{
	Const3( String b)
	{
System.out.println("Constructor  3 get execeuted");
	}

}
class Const4 extends Const3
{
	Const4()
	{
		super.b("Zargham");
		System.out.println("CONST 4 EXECUTED");
	}
}


class ConstChain1 
{
	public static void main(String[] args) 
	{
		System.out.println("Start of Java Code");
		Const4 sc=new Const4();
		System.out.println("End Of Java Code");
	}
}
