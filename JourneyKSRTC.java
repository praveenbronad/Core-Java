abstract class BusJourney
{
	abstract void bookTicket();
	abstract void showTicket();
	abstract void haveJourney();
}

abstract class ticketBooking extends BusJourney
{
	void bookTicket()
	{
		System.out.println("Book ticket using Cash or UPI ");
	}
}

abstract class displayTicketToCondutcor extends ticketBooking
{
	void showTicket()
	{
		System.out.println("SHow Ticket to conductor");
	}
}

class Travel extends displayTicketToCondutcor 
{
	void haveJourney()
	{
		System.out.println("Happy Journey");
	}
}

class JourneyKSRTC
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to KSRTC");
		Travel ref = new Travel();
		ref.bookTicket();
		ref.showTicket();
		ref.haveJourney();
	}
}