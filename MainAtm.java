abstract class Atm
{
	abstract void enterPin();
	abstract void cashWithdraw();
	abstract void printReciept();
}
abstract class Sample1 extends Atm
{
	void enterPin()
	{
		System.out.println("ENTER THE PIN");
	}
}
abstract class Sample2 extends Sample1
{
	void cashWithdraw()
	{ 
		System.out.println(" Withdraw  the Cash");
	}
}
class Sample3 extends Sample2
{
	void printReciept()
	{
		System.out.println("Print the Reciept");
}
}
		
class MainAtm

{
	public static void main(String[] args) 
	{
		System.out.println("Start of Java Program");
		Atm d1=new Sample3();//upcasting(sub class is behaving like super class)
		d1.enterPin();
		System.out.println("**********************");
		d1.cashWithdraw();
		System.out.println("**********************");
		d1.printReciept();
		System.out.println("**********************");
		System.out.println("END OF JAVA CODE");
}
}