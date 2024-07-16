class SwiggyProductsRunner{
 
   public static void main(String [] food){
   
     System.out.println("main Started");
	 
	 String foodName = "Chicken Biryani" ;
   
  double price = SwiggyProducts.searchProductPriceByName(foodName);
  
	 System.out.println("The Food Price is : " +price);

   System.out.println("main Ended");	 
   
   }

}