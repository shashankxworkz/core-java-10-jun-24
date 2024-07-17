class Zomato{
	public static double search(String foodName){
		double foodPrice = 0.0;
		if (foodName == "Butter Chicken") return foodPrice =259.00;
		if (foodName == "Chicken Lollipop") return foodPrice =179.00;
		else return foodPrice;
	}
	
	public static double search(String foodName , int quantity){
		double foodPrice = 0.0;
		if (foodName == "Butter Chicken") return foodPrice =259.00 * quantity;
		if (foodName == "Chicken Lollipop") return foodPrice =179.00 * quantity;	
		else return foodPrice;
	}
}