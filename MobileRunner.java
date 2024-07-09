class MobileRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		Mobile.turnOn();
		Mobile.turnOff();
		Mobile.turnOn();
		Mobile.turnOff();
		
		System.out.println("End of main method");
	}
}