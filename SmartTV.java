class SmartTV{

	static boolean isDisplayOn = false ;
	
	public static void turnOn(){
		
		System.out.println("Start of turnOn method");
		
		if(isDisplayOn == false){
			isDisplayOn = true;
			System.out.println("TV is turned on");
		}
		System.out.println("End of turnOn method");
	return;
	}
	
	public static void turnOff(){
		
		System.out.println("Start of turnOff method");
		
		if(isDisplayOn == true){
			isDisplayOn = false;
			System.out.println("TV is turned off");
		}
		System.out.println("End of turnOff method");
	return;
	}
}