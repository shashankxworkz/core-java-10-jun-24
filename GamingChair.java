class GamingChair{
 
  public static void main(String [] chair){
	  System.out.println("Main Started");
  
  getFeatutes();
  System.out.println("Main Ended");
  
  }
  
  
  
  public static void getFeatutes(){
  System.out.println("getFeatutes Method started");
   
   String brand = "YSSOA";
   String color = "Red With Footrest" ;
   String size = "21D x 23W x 46H Inch" ;
   String material = "Leather";
   String weight = "33 Pounds";
   int price = 9595 ;
   
   
   System.out.println("The Brand Name is "+brand);
   System.out.println("The  Color is : "+color);
   System.out.println("The Size Of The Chair  : "+size);
   System.out.println("The Material Used In Chair is  : "+material);
   System.out.println("The Chair Weight is : "+weight);
   System.out.println("The  Price   is : "+price);
   System.out.println("The getFeatutes Method is Ended");
   
   return;
  }
  }
  