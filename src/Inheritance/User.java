package Inheritance;

public class User 
{

	public static void main(String[] args)
	{
		Guest guest=new Guest();
		//System.out.println("This is guest path");
		guest.read();
		
		Developer dev= new Developer();
		//System.out.println("This is Developer path");
		dev.read();
		dev.write();
		
	admin ad=new admin ();
	//System.out.println("This is admin path");
	ad.read();
	
	ad.write();
	
	ad.manage();
	
	}

}
