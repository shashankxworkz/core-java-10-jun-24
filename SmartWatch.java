class SmartWatch{

	static boolean isSmartWatchOn = false ;
	
	public static void turnOn(){
		
		System.out.println("Start of turnOn method");
		
		if(isSmartWatchOn == false){
			isSmartWatchOn = true;
			System.out.println("Smart Watch is turned on");
		}
		System.out.println("End of turnOn method");
	return;
	}
	
	public static void turnOff(){
		
		System.out.println("Start of turnOff method");
		
		if(isSmartWatchOn == true){
			isSmartWatchOn = false;
			System.out.println("Smart Watch is turned off");
		}
		System.out.println("End of turnOff method");
	return;
	}
}