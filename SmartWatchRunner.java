class SmartWatchRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		

		
		boolean connect =  SmartWatch.OnOrOff();
		System.out.println("The SmartWatch On " +connect);
		
	
		 SmartWatch.increaseVolume();
		 SmartWatch.increaseVolume();
		 SmartWatch.increaseVolume();
		 SmartWatch.increaseVolume();
		 
		 
		 SmartWatch.decreaseVolume();
		 SmartWatch.decreaseVolume();
		 SmartWatch.decreaseVolume();
		 SmartWatch.decreaseVolume();
		 
		 connect =  SmartWatch.OnOrOff();
		 System.out.println("The SmartWatch On or off " +connect);
				
		connect =  SmartWatch.OnOrOff();
		System.out.println("The SmartWatch On or off " +connect);
				
	   connect = SmartWatch.OnOrOff();
	   System.out.println("The SmartWatch On or off");
		
		
		
		
		/*SmartWatch.turnOn();
		SmartWatch.turnOff();
		SmartWatch.turnOn();
		SmartWatch.turnOff();*/
		
		System.out.println("End of main method");
	}
}