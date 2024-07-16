class NandiniParlourRunner{
 
   public static void main(String [] karnatak){
   
     System.out.println("main Started");
	 
	 String productName = "Curd" ;
   
  double price = NandiniParlour.getProductPriceByName(productName);
  
	 System.out.println("The Nandini Parlour Price is : " +price);

   System.out.println("main Ended");	 
   
   }

}