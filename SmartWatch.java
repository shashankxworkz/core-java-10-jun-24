class SmartWatch{

	static boolean isSmartWatchOn = false ;
	static int maxVolume = 3;
	static int minVolume = 0;
	static int currenWatchVolume;
	
	
	public static boolean OnOrOff(){
		
		System.out.println("Start of turnOn method");
		
		isSmartWatchOn = (isSmartWatchOn == false) ? true : false;
		
		
		/*if(isSmartWatchOn == false){
			isSmartWatchOn = true;
			System.out.println("Smart Watch is turned on");
		}
		else if(isSmartWatchOn == true){
			isSmartWatchOn = false;
			System.out.println("Smart Watch is turned off");
		}
		*/
		
		System.out.println("End of turnOn method");
	return isSmartWatchOn;
	}
	
	public static void increaseVolume(){
		
		System.out.println("Start of increase volume method");
	
			if(isSmartWatchOn == true){
				if(currenWatchVolume < maxVolume){
					currenWatchVolume = currenWatchVolume + 1;
					System.out.println("Current volume is "+ currenWatchVolume);
				}else System.out.println("Maximum volume reached");
			}else System.out.println("Turn on the SmartTv");

		System.out.println("End of increase volume method");
		return;
	}

       public static void decreaseVolume(){
		
		System.out.println("Start of decrease volume method");
	
			if(isSmartWatchOn == true){
				if(currenWatchVolume > minVolume){
					currenWatchVolume = currenWatchVolume - 1;
					System.out.println("Current volume is "+ currenWatchVolume);
				}else System.out.println("Minimum volume reached");
			}else System.out.println("Turn on the SmartTv");

		System.out.println("End of decrease volume method");
	return;
	
	}
}
	
	/*public static void turnOff(){
		
		System.out.println("Start of turnOff method");
		
		if(isSmartWatchOn == true){
			isSmartWatchOn = false;
			System.out.println("Smart Watch is turned off");
		}
		System.out.println("End of turnOff method");
	return;
	
	}
}*/