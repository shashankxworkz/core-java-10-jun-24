class DominosFoodProductsRunner{
 
   public static void main(String [] dominosfood){
   
     System.out.println("main Started");
	 
	 String pizzaName = "Chicken Dominator Pizza" ;
   
  int price = DominosFoodProducts.SearchFoodPriceByName(pizzaName);
  
	 System.out.println("The Pizza Price is : " +price);

   System.out.println("main Ended");	 
   
   }

}