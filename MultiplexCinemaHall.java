class PVRCinemas 
{
	void ticketCounter()
	{
		System.out.println("Take tickets Here!");
	}

	void popCorns()
	{
		int price=450;
		System.out.println("Take popcorns by paying amount");
	}
}

class Kanthara extends PVRCinemas
{
	void kannadaCinema()
	{
		System.out.println("you are watching Kannada cinema");
	}
}

class Godfather extends PVRCinemas
{
	void telaguCinema()
	{
		System.out.println("you are wathing telagu Cinema");
	}

}

class PS1 extends PVRCinemas

{
	void TamilCinema()

	{
		System.out.println("you are wathing Tamil Cinema");
	}
}

class MultiplexCinemaHall extends PVRCinemas
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to PVR Cinema");

		PVRCinemas boxOffice = new PVRCinemas();
		boxOffice.ticketCounter();
		boxOffice.popCorns();
		Kanthara kannada = new Kanthara();
		kannada.kannadaCinema();
		Godfather telagu = new Godfather();
		telagu.telaguCinema();

	}
}
