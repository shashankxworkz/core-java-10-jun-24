class LogitechG413SE{
 
  public static void main(String [] keyboard){
	  System.out.println("Main Started");
  
  getFeatutes();
  System.out.println("Main Ended");
  
  }
  
  
  
  public static void getFeatutes(){
  System.out.println("getFeatutes Method started");
   
   String brand = "Logitech G";
   String model = " Logitech G413 SEs";
   String color = "Black" ;
   String connectivityTechnology = "USB 2.0" ;
   String material = "Silicone";
   String compatibleDevices = "PC";
   int price = 4580 ;
   
   
   System.out.println("The Brand Name is "+brand);
   System.out.println("The Model Name is : "+model);
   System.out.println("The  Color is : "+color);
   System.out.println("The Connectivity Technology Of KeyBoard is  : "+connectivityTechnology);
   System.out.println("The Material Used In KeyBoard  is  : "+material);
   System.out.println("The Keyboard Compatible Devices for : "+compatibleDevices);
   System.out.println("The  Price   is : "+price);
   System.out.println("The getFeatutes Method is Ended");
   
   return;
  }
  }
  