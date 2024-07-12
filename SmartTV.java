class SmartTV{

	static boolean isDisplayOn = false ;
	static int maxVolume = 10;
	static int minVolume = 0;
	static int currenSmartTvolume;
	
	public static boolean OnOrOff(){
		
		System.out.println("Start of turnOn method");
		isDisplayOn = (isDisplayOn == false) ? true : false;
		
		
		/*if(isDisplayOn == false){
			isDisplayOn = true;
			System.out.println("TV is turned on");
		}
		else if(isDisplayOn == true){
			isDisplayOn = false;
			System.out.println("TV is turned off");
		
		System.out.println("End of turnOff method");
		System.out.println("End of turnOn method");
	}*/
	
	return isDisplayOn;
	}
	
	public static void increaseVolume(){
		
		System.out.println("Start of increase volume method");
	
			if(isDisplayOn == true){
				if(currenSmartTvolume < maxVolume){
					currenSmartTvolume = currenSmartTvolume + 1;
					System.out.println("Current volume is "+ currenSmartTvolume);
				}else System.out.println("Maximum volume reached");
			}else System.out.println("Turn on the SmartTv");

		System.out.println("End of increase volume method");
		return;
	}

       public static void decreaseVolume(){
		
		System.out.println("Start of decrease volume method");
	
			if(isDisplayOn == true){
				if(currenSmartTvolume > minVolume){
					currenSmartTvolume = currenSmartTvolume - 1;
					System.out.println("Current volume is "+ currenSmartTvolume);
				}else System.out.println("Minimum volume reached");
			}else System.out.println("Turn on the SmartTv");

		System.out.println("End of decrease volume method");
	return;
	
	}
}
	
	/*public static void turnOff(){
		
		System.out.println("Start of turnOff method");
		
		if(isDisplayOn == true){
			isDisplayOn = false;
			System.out.println("TV is turned off");
		}
		System.out.println("End of turnOff method");
	return;*/
	
	//}
//}