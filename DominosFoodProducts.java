class DominosFoodProducts {

    public static int SearchFoodPriceByName(String foodName) {
		
        if (foodName == "Margherita Pizza") {
            return 299;
        }
        if (foodName == "Farmhouse Pizza") {
            return 399;
        }
        if (foodName == "Pepper Barbecue Chicken Pizza") {
            return 449;
        }
        if (foodName == "Veggie Paradise Pizza") {
            return 379;
        }
        if (foodName == "Chicken Dominator Pizza") {
            return 499;
        }
        if (foodName == "Indi Tandoori Paneer Pizza") {
            return 429;
        }
        if (foodName == "Mexican Green Wave Pizza") {
            return 359;
        }
        if (foodName == "Deluxe Veggie Pizza") {
            return 389;
        }
        if (foodName == "Chicken Fiesta Pizza") {
            return 459;
        }
        if (foodName == "Paneer Makhani Pizza") {
            return 399;
        }
        if (foodName == "Pepper Paneer Pizza") {
            return 379;
        }
        if (foodName == "Cheese N Corn Pizza") {
            return 299;
        }
        if (foodName == "Chicken Sausage Pizza") {
            return 429;
        }
        if (foodName == "Non Veg Supreme Pizza") {
            return 499;
        }
        if (foodName == "Veg Extravaganza Pizza") {
            return 429;
        }
        if (foodName == "Chicken Golden Delight Pizza") {
            return 469;
        }
        if (foodName == "Pepperoni Pizza") {
            return 499;
        }
        if (foodName == "Garlic Breadsticks") {
            return 99;
        }
        if (foodName == "Stuffed Garlic Bread") {
            return 129;
        }
        if (foodName == "Choco Lava Cake") {
            return 99;
			
        } else {
            System.out.println(foodName + " not found");
            return 0;
        }
    }

}
