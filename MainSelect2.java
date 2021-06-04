class Select1
{
	double a=7.80;
}
class Select2 extends Select1
{
	void getStart()
	{
		System.out.println("Variable is declared");
		System.out.println("Variable is initialized");
		System.out.println("Variable is substitued");
}
}
class Select3 extends Select2
{
	void processEnd()
	{
		System.out.println("variable operation are execeuted");
	}
}
class MainSelect2 
{
	public static void main(String[] args) 
	{
		System.out.println("Start of Java code");
		Select1 sc1=new Select3();//upcasting
		System.out.println(" the number is"+sc1.a);
		System.out.println("*********************");
		Select2 sc2=(Select2)sc1;//downcasting
		System.out.println(" the number is"+sc2.a);
		sc2.getStart();
		System.out.println("*********************");
		Select3 sc3=(Select3)sc2;
		System.out.println(" the number is"+sc3.a);
		sc3.getStart();
		sc3.processEnd();
		System.out.println("*********************");
		Select1 ref= new Select3();//upcasting
		System.out.println("the number is"+ref.a);
		System.out.println("*********************");
		if(ref instanceof Select3)
		{
			Select3 ref1=(Select3)ref;
			System.out.println("DOWNCASTING IS SUCESSFULL");
		}
		else
		{
			System.out.println("DOWNCASTING IS NOT DONE SOME THING IS MISSSING");
		}

				System.out.println("*********************");
System.out.println("END of Java Code");
	}
}
