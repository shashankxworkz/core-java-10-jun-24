class SmartWatchRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		SmartWatch.turnOn();
		SmartWatch.turnOff();
		SmartWatch.turnOn();
		SmartWatch.turnOff();
		
		System.out.println("End of main method");
	}
}