class BulbHolderSH{

public static void main(String [] bulbs){
	  System.out.println("Main Started");
  
  getFeatutes();
  System.out.println("Main Ended");
  
  }
  
       public static void getFeatutes(){
  System.out.println("getFeatutes Method started");
	
	     String brand = "Hiffin";
		 int price = 800;
		 String finishType = "Polished";
		 String bulbBase = "E27";
		 String switchType = "Toggle";
		
		
		
		
		System.out.println("The Brand of the Bulb Holder is "+brand);
		System.out.println("The price is "+ price);
		System.out.println("The finish type is "+finishType);
		System.out.println("The bulb base is "+ bulbBase);
		System.out.println("The switch type is "+switchType);
		
		System.out.println("The getFeatutes Method is Ended");
		  return ;
	}
}