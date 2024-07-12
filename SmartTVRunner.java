class SmartTVRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		
		boolean connect = SmartTV.OnOrOff();
		System.out.println("The  SmartTV Connected " +connect);
		
		 SmartTV.increaseVolume();
		 SmartTV.increaseVolume();
		 SmartTV.increaseVolume();
		 SmartTV.increaseVolume();
		 SmartTV.increaseVolume();
		 SmartTV.increaseVolume();
		 SmartTV.increaseVolume();
		 SmartTV.increaseVolume();
		 SmartTV.increaseVolume();
		 SmartTV.increaseVolume();
		 
		 
		 SmartTV.decreaseVolume();
		 SmartTV.decreaseVolume();
		 SmartTV.decreaseVolume();
		 SmartTV.decreaseVolume();
		 SmartTV.decreaseVolume();
		 SmartTV.decreaseVolume();
		 SmartTV.decreaseVolume();
		 SmartTV.decreaseVolume();
         SmartTV.decreaseVolume();
		 SmartTV.decreaseVolume();
		 
		 connect = SmartTV.OnOrOff();
		 System.out.println("The  SmartTV Connected " +connect);
				
		connect = SmartTV.OnOrOff();
		System.out.println("The  SmartTV Connected " +connect);
				
	   connect = SmartTV.OnOrOff();
	   System.out.println("The  SmartTV Connected");
		
		
		
		
		
		
		
		
		
		
		
		/*SmartTV.turnOn();
		SmartTV.turnOff();
		SmartTV.turnOn();
		SmartTV.turnOff();*/
		
		System.out.println("End of main method");
	}
}