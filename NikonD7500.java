class NikonD7500 {
 
  public static void main(String [] dslr){
	  System.out.println("Main Started");
  
  getFeatutes();
  System.out.println("Main Ended");
  
  }
  
  
  
  public static void getFeatutes(){
  System.out.println("getFeatutes Method started");
   
   String brand = "Nikon";
   String model = "Nikon D7500" ;
   String opticalZoom	 = 	"5 x" ;
   String supportedFileFormat = "JPG Raw" ;
   String imageStabilization = "Digital";
   int price = 92000 ;
   
   
   System.out.println("The Brand Name is "+brand);
   System.out.println("The  Model is : "+model);
   System.out.println("The Optical Zoom Of The Camera is   : "+opticalZoom);
   System.out.println("The Supported File Formate Is : "+supportedFileFormat);
   System.out.println("The Image Stabilization is : "+imageStabilization);
   System.out.println("The  Price   is : "+price);
   System.out.println("The getFeatutes Method is Ended");
   
   return;
  }
  }
  