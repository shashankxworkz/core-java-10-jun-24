class Domninos{
	public static double search(String foodName){
		double foodPrice = 0.0;
		if (foodName == "Burgers") return foodPrice =99.00;
		if (foodName == "Samosas") return foodPrice =79.00;
		else return foodPrice;
	}
	
	public static double search(String foodName , int quantity){
		double foodPrice = 0.0;
		if (foodName == "Burgers") return foodPrice =99.00 * quantity;
		if (foodName == "Samosas") return foodPrice =79.00 * quantity;	
		else return foodPrice;
	}
}