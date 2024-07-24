class  AmazonProductsRunner{


		public static void main(String [] products){
		
		System.out.println("Main started");
		
		boolean productAdded  =   AmazonProducts.addProductNames("OnePlus Nord CE4 Lite 5G ");
		System.out.println("Product name added");
		
		  productAdded =  AmazonProducts.addProductNames("Redmi Note 13 Pro");
		System.out.println("Product name added");

        productAdded =  AmazonProducts.addProductNames("Xiomi SmartTv 43 inch");
		System.out.println("Product name added");

        productAdded =  AmazonProducts.addProductNames("Hp Victis Laptop");
		System.out.println("Product name added");

        productAdded =  AmazonProducts.addProductNames("Macbook air");
		System.out.println("Product name added");
		
		productAdded =  AmazonProducts.addProductNames("Iphone 15");
		System.out.println("Product name added");
		
		productAdded =  AmazonProducts.addProductNames("Samsung Refrigerator");
		System.out.println("Product name added");
		
		productAdded =  AmazonProducts.addProductNames("Boat 121 pro Airdops");
		System.out.println("Product name added");
		
		productAdded =  AmazonProducts.addProductNames("Boat Strome speaker");
		System.out.println("Product name added");
		
		productAdded =  AmazonProducts.addProductNames("Zebronics keyboards");
		System.out.println("Product name added");
		
			
		 AmazonProducts.readProductNames();
		
		
		System.out.println("main ended");
	}


}