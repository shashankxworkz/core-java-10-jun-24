class Mobile{

	static boolean isMobileOn = false ;
	static int maxVolume = 6;
	static int minVolume = 0;
	static int currenMobilVolume;
	
	public static boolean turnOnOrOff(){
		
		System.out.println("Start of turnOn method");
		isMobileOn = (isMobileOn == false) ? true : false;

		
		/*if(isMobileOn == false){
			isMobileOn = true;
			System.out.println("Mobile is turned on");
		}
		else if(isMobileOn == true){
			isMobileOn = false;
			System.out.println("Mobile is turned off");
		}
		System.out.println("End of turnOn method");*/
		
		
	return isMobileOn;
	}
	
	
	public static void increaseVolume(){
		
		System.out.println("Start of increase volume method");
	
			if(isMobileOn == true){
				if(currenMobilVolume < maxVolume){
					currenMobilVolume = currenMobilVolume + 1;
					System.out.println("Current volume is "+ currenMobilVolume);
				}else System.out.println("Maximum volume reached");
			}else System.out.println("Turn on the SmartTv");

		System.out.println("End of increase volume method");
		return;
	}

       public static void decreaseVolume(){
		
		System.out.println("Start of decrease volume method");
	
			if(isMobileOn == true){
				if(currenMobilVolume > minVolume){
					currenMobilVolume = currenMobilVolume - 1;
					System.out.println("Current volume is "+ currenMobilVolume);
				}else System.out.println("Minimum volume reached");
			}else System.out.println("Turn on the SmartTv");

		System.out.println("End of decrease volume method");
	return;
	
	}
}
	/*public static void turnOff(){
		
		System.out.println("Start of turnOff method");
		
		if(isMobileOn == true){
			isMobileOn = false;
			System.out.println("Mobile is turned off");
		}
		System.out.println("End of turnOff method");
	return;
	
	}
	}
*/