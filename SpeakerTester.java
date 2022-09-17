class SpeakerTester
{

	public static void main(String speaker[])
	{
		System.out.println("main method is started");
		
		Speaker.brand = "boat";
		Speaker.color = "black";
		Speaker.price = 1500.00;
		
		System.out.println(Speaker.brand);
		System.out.println(Speaker.color);
		System.out.println(Speaker.price);
		
		Speaker.onOrOff();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		
		System.out.println("main method is ended");
	}
	
}