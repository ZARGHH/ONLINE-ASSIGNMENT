class Computer
{
	void computerInfo( String name, int ram)
	{
		System.out.println("Info Method executed");
		System.out.println("operating system of the computer is"+name);
		System.out.println("ram number is"+ram+"gb");
}

void computerInfo( long mfgnumber, int seriesno)
	{
	System.out.println("Info method executed again");
	System.out.println("MFG NUMBER OF COMPUTER IS"+mfgnumber);
	System.out.println("Series number is"+seriesno);
	}
}
class MainComputer

{
	public static void main(String[] args) 
	{
		System.out.println("Start of java Code");
		Computer sc=new Computer();
		sc.computerInfo(" WINDOWS 10",8);
		sc.computerInfo(22345678L,10);
		System.out.println("End of Java code");
	}
}
