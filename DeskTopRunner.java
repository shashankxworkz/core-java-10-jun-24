class DeskTopRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		boolean connect = DeskTop.OnOrOff();
		System.out.println("The DeskTop On " +connect);
		
		
		 DeskTop.increaseVolume();
		 DeskTop.increaseVolume();
		 DeskTop.increaseVolume();
		 DeskTop.increaseVolume();
		 DeskTop.increaseVolume();
		 DeskTop.increaseVolume();
		 DeskTop.increaseVolume();
		 DeskTop.increaseVolume();
		 DeskTop.increaseVolume();
		 DeskTop.increaseVolume();
		 
		 
		 DeskTop.decreaseVolume();
		 DeskTop.decreaseVolume();
		 DeskTop.decreaseVolume();
		 DeskTop.decreaseVolume();
		 DeskTop.decreaseVolume();
		 DeskTop.decreaseVolume();
		 DeskTop.decreaseVolume();
		 DeskTop.decreaseVolume();
		 DeskTop.decreaseVolume();
		 DeskTop.decreaseVolume();
		 
		 connect = DeskTop.OnOrOff();
		 System.out.println("The DeskTop On or off " +connect);
				
		connect = DeskTop.OnOrOff();
		System.out.println("The DeskTop On or off " +connect);
				
	   connect = DeskTop.OnOrOff();
	   System.out.println("The DeskTop On or off");

				
				 


		
		System.out.println("End of main method");
	}
}