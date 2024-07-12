class RefrigeratorRunner{
	
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		
	
		
		boolean connect =  Refrigerator.OnOrOff();
		System.out.println("The Refrigerator On " +connect);
		
		 Refrigerator.increaseLevel();
		 Refrigerator.increaseLevel();
		 Refrigerator.increaseLevel();
		 
		 Refrigerator.decreaseLevel();
		 Refrigerator.decreaseLevel();
		 Refrigerator.decreaseLevel();
		 
		 connect =  Refrigerator.OnOrOff();
		 System.out.println("The Refrigerator On or off " +connect);
				
		connect =  Refrigerator.OnOrOff();
		System.out.println("The Refrigerator On or off " +connect);
				
	   connect = Refrigerator.OnOrOff();
	   System.out.println("The Refrigerator On or off");
		
		

		
		System.out.println("End of main method");
	}
}