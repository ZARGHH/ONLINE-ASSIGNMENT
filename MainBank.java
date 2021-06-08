abstract class Bank
{
	abstract void getOpen();
	abstract void getDeposit();
	abstract void getWithdraw();
	abstract void getTransaction();
}
abstract class Select1 extends Bank
{
	void getOpen()
	{
		System.out.println("open the saving banks account");
	}
}
abstract class Select2 extends Select1
{
	void getDeposit()
	{
		System.out.println("Deposit your Cash in the  Bank Account");
}
}
abstract class Select3 extends Select2
{
	void getWithdraw()
	{
		System.out.println(" WITHDRAW CASH ANY TIME");
	}
}
class Select4 extends Select3
{
	void getTransaction()
	{
		System.out.println("TRANSACTION SUCESSFULL");
	}
}


class MainBank 
{
	public static void main(String[] args) 
	{
		System.out.println("START OF JAVA CODE");
		Bank b1=new Select4();
		b1.getOpen();
System.out.println("*************");
b1.getDeposit();
System.out.println("*************");
b1.getWithdraw();
System.out.println("*************");
b1.getTransaction();
System.out.println("*************");
System.out.println("end of java code");
	}
}
