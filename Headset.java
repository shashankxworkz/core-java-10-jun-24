class Headset{
 
  public static void main(String [] headphone){
	  System.out.println("Main Started");
  
  getFeatutes();
  System.out.println("Main Ended");
  
  }
  
  
  
  public static void getFeatutes(){
  System.out.println("getFeatutes Method started");
   
   String brand = "	Ozeino";
   String model = "Gaming Headset for PC, PS4, PS5, Xbox Headset with 7.1 Surround Sound, Gaming Headphones with Noise Cancelling Mic RGB Light Over Ear Headphones for Xbox Series X/S, Switch";
   String color = "White" ;
   String noiseControl	 = "Active Noise Cancellation" ;
   int price = 1599 ;
   
   
   System.out.println("The Brand Name is "+brand);
   System.out.println("The Model Name is : "+model);
   System.out.println("The Headset Color is : "+color);
   System.out.println("The Headset Supports  : "+noiseControl);
   System.out.println("The Headset  Price   is : "+price);
   System.out.println("The getFeatutes Method is Ended");
   
   return;
  }
  }
  