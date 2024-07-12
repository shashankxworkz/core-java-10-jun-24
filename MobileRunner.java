class MobileRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		boolean connect = Mobile.turnOnOrOff();
		System.out.println("The  Mobile On " +connect);
		
		 Mobile.increaseVolume();
		 Mobile.increaseVolume();
		 Mobile.increaseVolume();
		 Mobile.increaseVolume();
		 Mobile.increaseVolume();
		 Mobile.increaseVolume();
		 Mobile.increaseVolume();
		 
		 Mobile.decreaseVolume();
		 Mobile.decreaseVolume();
		 Mobile.decreaseVolume();
		 Mobile.decreaseVolume();
		 Mobile.decreaseVolume();
		 Mobile.decreaseVolume();
		 Mobile.decreaseVolume();
		 
		 connect = Mobile.turnOnOrOff();
		 System.out.println("The Mobile On or off " +connect);
				
		connect = Mobile.turnOnOrOff();
		System.out.println("The Mobile On or off " +connect);
				
	   connect = Mobile.turnOnOrOff();
	   System.out.println("The Mobile On or off");
		
		
		
		
		
		
		
		
		/*Mobile.turnOn();
		Mobile.turnOff();
		Mobile.turnOn();
		Mobile.turnOff();*/
		
		System.out.println("End of main method");
	}
}