class HPOfficeJetPro {
 
  public static void main(String [] printer){
	  System.out.println("Main Started");
  
  getFeatutes();
  System.out.println("Main Ended");
  
  }
  
  
  
  public static void getFeatutes(){
  System.out.println("getFeatutes Method started");
   
   String brand = "HP";
   String model = "HP OfficeJet Pro" ;
   String color = "Light Cement";
   String maximumPrintSpeed = "10 ppm" ;
   String printingTechnology = "Inkjet" ;
   int price = 9230 ;
   
   
   System.out.println("The Brand Name is "+brand);
   System.out.println("The  Model is : "+model);
   System.out.println("The Color is : "+color);
   System.out.println("The no Of Prints Speed  : "+maximumPrintSpeed);
   System.out.println(" The Printing Technology : "+printingTechnology);
   System.out.println("The  Price   is : "+price);
   System.out.println("The getFeatutes Method is Ended");
   
   return;
  }
  }
  