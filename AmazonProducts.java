class AmazonProducts{

	static String productNames[] = {null, null, null, null, null, null, null, null, null, null};
	static int start;
	
	public static boolean addProductNames(String productName){
		boolean isProductNameAdded = false;
		
		if(productName != null){
			productNames[start++]=productName;
			isProductNameAdded = true;
		}else
			System.out.println("Product name is invalid");
			
	return isProductNameAdded;
	}
	
	public static void readProductNames(){
		
		System.out.println("Available Product names are");
		for(String products : productNames)
			System.out.println(products);
	
	return;
	
	}
}