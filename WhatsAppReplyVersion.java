// example for MetodOverRiding 

class WhatsAppStatusReply
{
	void statusReply()
	{
		System.out.println("Reply by typing text");
	}
}

class WhatsAppStatusReplyLatest extends WhatsAppStatusReply

{
	void statusReply()
	{
		System.out.println("Reply by selecting emojies and text both !");
	}
}

class WhatsAppReplyVersion
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to whatsapp");
		WhatsAppStatusReplyLatest reply = new WhatsAppStatusReplyLatest();
		reply.statusReply();
	}


}
