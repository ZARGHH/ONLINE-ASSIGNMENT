class Ola
{
	String car;
	double star;
	int sal;
	Ola()
	{
		car="SWIFT DEZIRE";
		star=4.5;
		sal=8000;
		}

}


class MainOla
{
	public static void main(String[] args) 
	{
		System.out.println("Start of Java Code");
		Ola s1=new Ola();
		System.out.println(" Car name is"+s1.car);
		System.out.println("Star rate of driver is"+s1.star);
		System.out.println("Salary of the driver is"+s1.sal);
		System.out.println("**************************");
         Ola s2=new Ola();
		System.out.println(" Car name is"+s2.car);
		System.out.println("Star rate of driver is"+s2.star);
		System.out.println("Salary of the driver is"+s2.sal);
		System.out.println("**************************");
		Ola s3=new Ola();
		System.out.println(" Car name is"+s3.car);
		System.out.println("Star rate of driver is"+s3.star);
		System.out.println("Salary of the driver is"+s3.sal);
		System.out.println("**************************");
       System.out.println("End of JAVA code");

	}
}
