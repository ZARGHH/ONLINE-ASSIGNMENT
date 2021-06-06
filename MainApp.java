class Search
{
	void searchEngine()
	{
		System.out.println("Searching using Sewarch Engine");
}
}
class Google extends Search
{
void searchEngine()
	{
		System.out.println("Searching using Google");
}
}
class Yahoo extends Search
{
	void searchEngine()
	{
		System.out.println("Searching using Yahoo");
}
}
class Bing extends Search
{
	void searchEngine()
	{
		System.out.println("Searching using  Bing");
}
}
class  SearchApp
{
	void searching(Search sc)
	{
		sc.searchEngine();
	}
}
class MainApp
{

	public static void main(String[] args) 
	{
		System.out.println("Start Of Java Code");
		SearchApp  ref=new SearchApp();
		ref.searching(new Google());
		System.out.println("***************");
		ref.searching(new Yahoo());
		System.out.println("***************");
		ref.searching(new Bing());
		System.out.println("***************");
		System.out.println("End Of Java Code");

	}
}
