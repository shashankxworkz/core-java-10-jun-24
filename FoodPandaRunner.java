class FoodPandaRunner{
	public static void main(String[]food){
		System.out.println("Main started");
		
		String menuName="pani puri";
		double findMenuPrice= FoodPanda.findMenuPrice(menuName);
		System.out.println("The cost of "+menuName+" is "+findMenuPrice);
		System.out.println("Main ended");
	}

}