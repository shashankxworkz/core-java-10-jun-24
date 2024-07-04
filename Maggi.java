class Maggi{

    public static void main(String [] tasty){
	
	   String name = "Maggie" ;
	   String countryOfOrigin = "India";
	   String shelfLife = "8 Months" ;
	   String ingredients [] = {"Maida" , "Palm oil" , "Iodised salt" , "Thickeners" , "Black pepper powder" , "Green cardamom powder" , "Ginger powder" , "Dried garlic" , "Turmeric powder"};
	   double   price = 20.00 ;
	   String Qty = "70gm" ;
	   
	   
	  System.out.println("The  Product name is : " +name);
	  System.out.println("The Country of origin : " +countryOfOrigin);
	  System.out.println("The Shelf Life Of Product : " +shelfLife);
	  System.out.println("The Price is : " + price);
	  System.out.println("The Qty is : " + Qty);
	  System.out.println("The number of Ingredients used in Maggi : " +ingredients.length);
	  System.out.println("The Ingredients are used in : " +name);
	  
	  
	  for (String val : ingredients){
	  System.out.println(val);
	  }
       	   
	
	
	
	}



}