class Speaker{

	static boolean isSpeakerOn = false ;
	
	public static boolean OnOrOff(){
		
		System.out.println("Start of OnOrOff method");
		
		if(isSpeakerOn == false){
			isSpeakerOn = true;
			System.out.println("GoPro Camera is turned on");
		}
		else if(isSpeakerOn == true){
			isSpeakerOn = false;
			System.out.println("GoPro Camera is turned off");
		System.out.println("End of onOrOff method");
		}
	return isSpeakerOn;
		
	
	/*public static void turnOff(){
		
		System.out.println("Start of turnOff method");
		
		if(isSpeakerOn == true){
			isSpeakerOn = false;
			System.out.println("GoPro Camera is turned off");
		}
		System.out.println("End of turnOff method");
	return;*/
	}
}