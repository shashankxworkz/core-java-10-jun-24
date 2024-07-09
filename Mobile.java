class Mobile{

	static boolean isMobileOn = false ;
	
	public static void turnOn(){
		
		System.out.println("Start of turnOn method");
		
		if(isMobileOn == false){
			isMobileOn = true;
			System.out.println("Mobile is turned on");
		}
		System.out.println("End of turnOn method");
	return;
	}
	
	public static void turnOff(){
		
		System.out.println("Start of turnOff method");
		
		if(isMobileOn == true){
			isMobileOn = false;
			System.out.println("Mobile is turned off");
		}
		System.out.println("End of turnOff method");
	return;
	}
}