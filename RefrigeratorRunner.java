class RefrigeratorRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		Refrigerator.turnOn();
		Refrigerator.turnOff();
		Refrigerator.turnOn();
		Refrigerator.turnOff();
		
		System.out.println("End of main method");
	}
}