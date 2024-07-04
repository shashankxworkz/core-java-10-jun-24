class SpeakerZeb{

public static void main(String [] juice){
	  System.out.println("Main Started");
  
  getFeatutes();
  System.out.println("Main Ended");
  
  }
  
     public static void getFeatutes(){
  System.out.println("getFeatutes Method started");
	
	     String Brand = "ZEBRONICS";
		 int price = 24999;
		 String outputPower = "625 Watts";
		 String frequencyResponse = "40 Hz";
		 String connectivityTechnology = "Auxiliary and USB";


		System.out.println("The Brand of the Speaker is "+Brand);
		System.out.println("The price is "+price);
		System.out.println("The Output Power of the Speaker is "+outputPower);
		System.out.println("The Frequency Response of the Speaker is "+frequencyResponse);
		System.out.println("The Connectivity Technology is "+connectivityTechnology);
		
		System.out.println("The getFeatutes Method is Ended");
		  return ;
	}
}