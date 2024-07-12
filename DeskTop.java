class DeskTop{

	static boolean isDeskTopOn = false ;
	static int maxVolume = 9;
	static int minVolume = 0;
	static int currenDeskTopolume;
	
	public static boolean OnOrOff(){
		
		System.out.println("Start of turnOn method");
			
	
		isDeskTopOn = (isDeskTopOn == false) ? true : false;
		
		/*if(isDeskTopOn == false){
			isDeskTopOn = true;
			System.out.println("DeskTop is turned on");
		}
		else if(isDeskTopOn == true){
			isDeskTopOn = false;
			System.out.println("DeskTop is turned off");
		System.out.println("End of turnOn method");
		}*/
			System.out.println("Start of OnOrOff method");
	return isDeskTopOn;
	}
	
	public static void increaseVolume(){

	System.out.println("Start of increase volume method");
	
			if(isDeskTopOn == true){
				if(currenDeskTopolume < maxVolume){
					currenDeskTopolume = currenDeskTopolume + 1;
					System.out.println("Current volume is "+ currenDeskTopolume);
				}else System.out.println("Maximum volume reached");
			}else System.out.println("Turn on the DeskTop");

		System.out.println("End of increase volume method");
		return;
	}

         public static void decreaseVolume(){
		
		System.out.println("Start of decrease volume method");
	
			if(isDeskTopOn == true){
				if(currenDeskTopolume > minVolume){
					currenDeskTopolume = currenDeskTopolume - 1;
					System.out.println("Current volume is "+ currenDeskTopolume);
				}else System.out.println("Minimum volume reached");
			}else System.out.println("Turn on the DeskTop");

		System.out.println("End of decrease volume method");
	return;
	}
}
	
	
	/*public static void turnOff(){
		
		System.out.println("Start of turnOff method");
		
		if(isDeskTopOn == true){
			isDeskTopOn = false;
			System.out.println("DeskTop is turned off");
		}
		System.out.println("End of turnOff method");
	return;*/
	
