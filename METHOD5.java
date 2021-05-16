class METHOD5 
{
	public static void main(String[] args) 
	{
		System.out.println("START OF JAVA PROGRAM!");
		wallclock(25);
		System.out.println("END OF JAVA PROGRAM");
	}

static void wallclock(int sec)
	{
	int min=sec*60;
	int hour=min*60;
	System.out.println(min);
	System.out.println(hour);
	}
}
