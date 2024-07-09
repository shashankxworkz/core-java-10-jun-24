class SmartTVRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		SmartTV.turnOn();
		SmartTV.turnOff();
		SmartTV.turnOn();
		SmartTV.turnOff();
		
		System.out.println("End of main method");
	}
}