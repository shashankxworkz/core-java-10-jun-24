class Sopa{
 
  public static void main(String [] sittingSofa){
	  System.out.println("Main Started");
  
  getFeatutes();
  System.out.println("Main Ended");
  
  }
  
  
  
  public static void getFeatutes(){
  System.out.println("getFeatutes Method started");
   
   String brand = "	POLY & BARK";
   String assemblyRequired = "Yes" ;
   String seatDepth = "24 inches" ;
   String seatHeight	 = "19 Inches";
   String productDimensions = " 30D x 104.5 ";
   int price = 6999 ;
   
   
   System.out.println("The Brand Name is "+brand);
   System.out.println("The Assembly Required is : "+assemblyRequired);
   System.out.println("The Sopa  Seat Depth  is : "+seatDepth);
   System.out.println("The Sopa  Seat Heigh  is : "+seatHeight);
   System.out.println("The Sopa  Product Dimensions  is : "+productDimensions);
   System.out.println("The Sopa  Price   is : "+price);
   System.out.println("The getFeatutes Method is Ended");
   
   return;
  }
  }
  