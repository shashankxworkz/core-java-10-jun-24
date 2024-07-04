class Levoit{
 
  public static void main(String [] purifiers){
	  System.out.println("Main Started");
  
  getFeatutes();
  System.out.println("Main Ended");
  
  }
  
  
  
  public static void getFeatutes(){
  System.out.println("getFeatutes Method started");
   
   String brand = "LEVOIT";
   String color = "white" ;
   String productDimensions = "6.4D x 12.8W x 16.1H" ;
   String powerSource = "AC" ;
   String floorArea	 = "1110 Square Feet";
   int price = 15499 ;
   
   
   System.out.println("The Brand Name is "+brand);
   System.out.println("The  Color is : "+color);
   System.out.println("The Product Dimensions is  : "+productDimensions);
   System.out.println("The powerSource  is : "+powerSource);
   System.out.println("The  Floot Area   is : "+floorArea);
   System.out.println("The Price is : "+price);
   System.out.println("The getFeatutes Method is Ended");
   
   return;
  }
  }
  