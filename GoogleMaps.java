class SourcePlace
{ 
	String from;
	SourcePlace(String from)
	{
		System.out.println("Enter from location");
		this.from = from;
	}
}

class DestinationPlace extends SourcePlace
{
	String to;
	DestinationPlace(String to)
	{
		super("Bengaluru");
		System.out.println("Enter to location");
		this.to=to;
	}
}

class GoogleMaps
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Google Maps!");

		DestinationPlace mapSearch = new DestinationPlace("hyderabad");

		System.out.println( "Selected Source Location is " + mapSearch.from );
		System.out.println( "Selected Destination Location is " + mapSearch.to );
	}
}