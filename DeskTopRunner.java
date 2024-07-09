class DeskTopRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		DeskTop.turnOn();
		DeskTop.turnOff();
		DeskTop.turnOn();
		DeskTop.turnOff();
		
		System.out.println("End of main method");
	}
}