class Languages
{
	void Programming()
	{
		System.out.println("There are many Programming Lnaguage we can learn");
	}
}
class Java extends Languages
{
	void Programming()
	{
		System.out.println("JAVA USEs THE CONCEPT OF OOPS");
	}
}
class Python extends Languages
{
void Programming()
	{
		System.out.println("Python USES THE CONCEPT OF OOPS");
	}
}
class Ruby extends Languages
{
	void Programming()
	{
		System.out.println("Ruby LANGUAGE IS VERY TOUGH");
	}
}
class Fortan extends Languages
{
	void Programming()
	{
		System.out.println(" Fortan is procuderal Languagee");
	}
}

class Version
{
	void Execute(Languages sc)
	{
		sc.Programming();
}
}

class MainLang
{
	public static void main(String args[])
	{
		Version ref2=new Version();
		ref2.Execute(new Languages());
		System.out.println("****************");
		ref2.Execute(new Java());
		System.out.println("*****************");
		ref2.Execute(new Python());
		System.out.println("*****************");
		ref2.Execute(new Ruby());
		System.out.println("*****************");
		ref2.Execute(new Fortan());
		System.out.println("*****************");

}
}