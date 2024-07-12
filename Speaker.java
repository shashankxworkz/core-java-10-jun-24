class Speaker{

	static boolean isSpeakerOn = false ;
	static int maxVolume = 6;
	static int minVolume = 0;  
	static int currenSpeakerVolume;

	
	public static boolean OnOrOff(){
		
		System.out.println("Start of OnOrOff method");
		
		
		isSpeakerOn = (isSpeakerOn == false) ? true : false;
		
		/*if(!isSpeakerOn) isSpeakerOn = true;
			System.out.println(" Speaker is turned on");
		}
		else isSpeakerOn = false;
			System.out.println(" Speaker is turned off");
		System.out.println("End of onOrOff method");
		}*/
		
		System.out.println("End of onOrOff method");
		return isSpeakerOn;
		}
		
		public static void increaseVolume(){
		
		System.out.println("Start of increase volume method");
	
			if(isSpeakerOn == true){
				if(currenSpeakerVolume < maxVolume){
					currenSpeakerVolume = currenSpeakerVolume + 1;
					System.out.println("Current volume is " + currenSpeakerVolume);
				}else System.out.println("Maximum volume reached");
			}else System.out.println("Turn on the Speaker");

		System.out.println("End of increase volume method");
		return;
	}

         public static void decreaseVolume(){
		
		System.out.println("Start of decrease volume method");
	
			if(isSpeakerOn == true){
				if(currenSpeakerVolume > minVolume){
					currenSpeakerVolume = currenSpeakerVolume - 1;
					System.out.println("Current volume is "+ currenSpeakerVolume);
				}else System.out.println("Minimum volume reached");
			}else System.out.println("Turn on the Speaker");

		System.out.println("End of decrease volume method");
	return;
	}
}
	
		
	
	/*public static void turnOff(){
		
		System.out.println("Start of turnOff method");
		
		if(isSpeakerOn == true){
			isSpeakerOn = false;
			System.out.println(" Speaker is turned off");
		}
		System.out.println("End of turnOff method");
	return;*/
