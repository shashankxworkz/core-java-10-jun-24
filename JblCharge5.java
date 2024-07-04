class JblCharge5{
 
  public static void main(String [] speaker){
	  System.out.println("Main Started");
  
  getFeatutes();
  System.out.println("Main Ended");
  
  }
  
  
  
  public static void getFeatutes(){
  System.out.println("getFeatutes Method started");
   
   String brand = "JBL";
   String color = "Black" ;
   String output = "40 Watts" ;
   String inputVoltage = "3.6 Volts" ;
   String audioOutputMode = "Stereo";
   int price = 15499 ;
   
   
   System.out.println("The Brand Name is "+brand);
   System.out.println("The  Color is : "+color);
   System.out.println("The Output Of The Speaker: "+output);
   System.out.println("The Input Voltage of  Speaker  : "+inputVoltage);
   System.out.println("The Audio Output Mode is : "+audioOutputMode);
   System.out.println("The  Price   is : "+price);
   System.out.println("The getFeatutes Method is Ended");
   
   return;
  }
  }
  