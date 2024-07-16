class SwiggyProducts{

    public static double searchProductPriceByName(String foodName){
		
        if (foodName == "Pizza Margherita") {
            return 299.00;
        }
        if (foodName == "Chicken Biryani") {
            return 199.00;
        }
        if (foodName == "Veg Biryani") {
            return 179.00;
        }
        if (foodName == "Paneer Butter Masala") {
            return 249.00;
        }
        if (foodName == "Butter Chicken") {
            return 299.00;
        }
        if (foodName == "Mutton Rogan Josh") {
            return 399.00;
        }
        if (foodName == "Dal Makhani") {
            return 199.00;
        }
        if (foodName == "Garlic Naan") {
            return 49.00;
        }
        if (foodName == "Chicken Tikka") {
            return 259.00;
        }
        if (foodName == "Fish Curry") {
            return 279.00;
        }
        if (foodName == "Egg Curry") {
            return 149.00;
        }
        if (foodName == "Pasta Alfredo") {
            return 199.00;
        }
        if (foodName == "Pasta Arrabiata") {
            return 199.00;
        }
        if (foodName == "Caesar Salad") {
            return 159.00;
        }
        if (foodName == "Greek Salad") {
            return 179.00;
        }
        if (foodName == "Chocolate Brownie") {
            return 99.00;
        }
        if (foodName == "Ice Cream Sundae") {
            return 129.00;
        }
        if (foodName == "Fruit Salad") {
            return 119.00;
        }
        if (foodName == "Gulab Jamun") {
            return 89.00;
        }
        if (foodName == "Ras Malai") {
            return 99.00;
        } 
		
		else {
            System.out.println(foodName + " not found");
            return 0.0;
        }
    }
}