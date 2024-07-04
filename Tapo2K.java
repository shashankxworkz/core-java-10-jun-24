class Tapo2K{
 
  public static void main(String [] ccCamera){
	  System.out.println("Main Started");
  
  getFeatutes();
  System.out.println("Main Ended");
  
  }
  
  
  
  public static void getFeatutes(){
  System.out.println("getFeatutes Method started");
   
   String brand = "Tapo";
   String color = "white" ;
   int numberOfChannles = 1 ;
   String material = "plastic" ;
   String shape = "Dome";
   int price = 15499 ;
   
   
   System.out.println("The Brand Name is "+brand);
   System.out.println("The  Color is : "+color);
   System.out.println("The Number Of Channels : "+numberOfChannles);
   System.out.println("The CC Camera Material is  : "+material);
   System.out.println("The Shape Of The Camera  is : "+shape);
   System.out.println("The  Price   is : "+price);
   System.out.println("The getFeatutes Method is Ended");
   
   return;
  }
  }
  