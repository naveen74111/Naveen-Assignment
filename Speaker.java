class Speaker {

	static String brand ;
	static String color ;
	static double price ;
	static boolean  isConnected ;
	static int minVolume;
	static int currentVolume;
	static int maxVolume = 10;
	
	//functionality
	public static boolean onOrOff()
	{
	    System.out.println("start inside onOrOff()");
		if(isConnected == false)
		{
					isConnected = true;
			System.out.println("Speaker is turned on...");
		
		}
		else if(isConnected == true)
		{
			isConnected =false;
		System.out.println("Speaker is turned off...");}
			
			System.out.println("end of onOrOff()");
		return isConnected;
		}


	public static void increaseVolume()
	{
		System.out.println("inside increase volume()");
		
		if(isConnected == true)
		{
		if(currentVolume < maxVolume){
			currentVolume = currentVolume + 1;
			System.out.println("The current volume is :" + currentVolume);
	
		}
		else
		{
			System.out.println("max volume is reached.....");
		}
	}
		else
		{
			System.out.println("gube first speaker on madu.....");
		}	
	}		
	public static void decreaseVolume()
	{
		System.out.println("start decrease volume()");
		if(currentVolume > minVolume)
		{
			currentVolume =currentVolume - 1;
			System.out.println("The current volume is :" + currentVolume);
			System.out.println("inside decrease volume()");
			
		}
		else
		{
			System.out.println("min volume is reached.....");
		}
		
			if(isConnected == false)
			{
			System.out.println("Speaker is off");
			}
		else
		{
			System.out.println("gube first speaker on madu.....");
		}	
	}
}