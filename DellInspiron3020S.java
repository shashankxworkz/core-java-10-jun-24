class DellInspiron3020S {
 
  public static void main(String [] desktop){
	  System.out.println("Main Started");
  
  getFeatutes();
  System.out.println("Main Ended");
  
  }
  
  
  
  public static void getFeatutes(){
  System.out.println("getFeatutes Method started");
   
   String brand = "Dell";
   String model = "Dell Inspiron 3020S" ;
   int cacheSize = 20 ;
   String cpuSpeed = "4.6 GHz" ;
   String opertingSystem = "Windows 11 Home";
   int price = 52985 ;
   
   
   System.out.println("The Brand Name is "+brand);
   System.out.println("The  Model is : "+model);
   System.out.println("The Cache Size Of The   : "+cacheSize);
   System.out.println("The CPU Speed is  : "+cpuSpeed);
   System.out.println("The Operting System is : "+opertingSystem);
   System.out.println("The  Price   is : "+price);
   System.out.println("The getFeatutes Method is Ended");
   
   return;
  }
  }
  