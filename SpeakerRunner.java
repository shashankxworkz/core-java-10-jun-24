class SpeakerRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		boolean connect = Speaker.OnOrOff();
		System.out.println("The Speaker Connected " +connect);
		
		 Speaker.increaseVolume();
		 Speaker.increaseVolume();
		 Speaker.increaseVolume();
		 Speaker.increaseVolume();
		 Speaker.increaseVolume();
		 Speaker.increaseVolume();
		 Speaker.increaseVolume();
		 Speaker.increaseVolume();
		 
		 
		 Speaker.decreaseVolume();
		 Speaker.decreaseVolume();
		 Speaker.decreaseVolume();
		 Speaker.decreaseVolume();
		 Speaker.decreaseVolume();
		 Speaker.decreaseVolume();
		 Speaker.decreaseVolume();
		 Speaker.decreaseVolume();
		 
		 connect = Speaker.OnOrOff();
		 System.out.println("The Speaker Connected " +connect);
				
		connect = Speaker.OnOrOff();
		System.out.println("The Speaker Connected " +connect);
				
	   connect = Speaker.OnOrOff();
	   System.out.println("The Speaker Connected");

				
				 

		 
		
		//Speaker.OnOrOff();
		//Speaker.OnOrOff();
		//Speaker.OnOrOff();
		
		System.out.println("End of main method");
	}
}