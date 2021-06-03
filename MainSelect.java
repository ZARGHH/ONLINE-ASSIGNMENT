class Select1
{ int a=5;
int b=6;
void add()
	{
	System.out.println(a+b);
	}

}
class Select2 extends Select1
{
	int c=5;
	int d=3;
	void sub()
	{
		System.out.println(c-d);
	}

}
class Select3 extends Select2
{
	int e=6;
	int f=6;
	void prod()
	{
		System.out.println(e*f);
	}
}
class Simplfy
{
	void getStart(Select1 s1)
	{
		System.out.println("a is "+s1.a);
	System.out.println("b is"+s1.b);
	s1.add();
	}
	void getExecute(Select2 s2)
	{
	System.out.println("a is "+s2.a);
	System.out.println("b is"+s2.b);
	s2.add();
	s2.sub();
	System.out.println("c is"+s2.c);
	System.out.println("d is"+s2.d);
	}
	void getEnd(Select3 s3)
	{
	System.out.println("a is "+s3.a);
	System.out.println("b is"+s3.b);
	s3.add();
	s3.sub();
	System.out.println("c is"+s3.c);
	System.out.println("d is"+s3.d);
	System.out.println("e is"+s3.e);
	System.out.println("f is"+s3.f);
	s3.prod();
	}
	

}
class MainSelect 
{
	public static void main(String[] args) 
	{
		System.out.println("Start Of Java Code");
		Simplfy sc=new Simplfy();
		sc.getEnd(new Select3());//same class
		System.out.println("****************************");
		sc.getExecute(new Select2());//same class
		sc.getExecute(new Select3());//sub class upcasting
		System.out.println("****************************");
	    sc.getStart(new Select1());//same class
       sc.getStart(new Select2());//sub class upcasting
	   sc.getStart(new Select3());//sub class upcasting
	   System.out.println("****************************");
	   System.out.println("END Of Java Code");


	}
}
