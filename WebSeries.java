class Netfix
{
	String series="MIRZAPUR2";
	void display()
	{
		System.out.println(series+ "is an awesome web series");
		}
}

class WebSeries

{
	public static void main(String[] args) 
	{ 
		Netfix d=new Netfix();
		System.out.println("Start of Java Program");
		System.out.println("new web series "+d.series);
		d.display();
		System.out.println("End of Java code");

	}
}
