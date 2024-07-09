class DeskTop{

	static boolean isDeskTopOn = false ;
	
	public static void turnOn(){
		
		System.out.println("Start of turnOn method");
		
		if(isDeskTopOn == false){
			isDeskTopOn = true;
			System.out.println("DeskTop is turned on");
		}
		System.out.println("End of turnOn method");
	return;
	}
	
	public static void turnOff(){
		
		System.out.println("Start of turnOff method");
		
		if(isDeskTopOn == true){
			isDeskTopOn = false;
			System.out.println("DeskTop is turned off");
		}
		System.out.println("End of turnOff method");
	return;
	}
}