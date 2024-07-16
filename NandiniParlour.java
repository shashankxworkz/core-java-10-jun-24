class NandiniParlour {

    public static double getProductPriceByName(String milkProductName){
	
        if (milkProductName == "Toned Milk") {
            return 40.00 ;
        }
        if (milkProductName == "Full Cream Milk") {
            return 50.15 ;
        }
        if (milkProductName == "Curd") {
            return 30.25;
        }
        if (milkProductName == "Butter Milk") {
            return 20.00;
        }
        if (milkProductName == "Ghee") {
            return 450.00;
        }
        if (milkProductName == "Paneer") {
            return 200.05;
        }
        if (milkProductName == "Cheese") {
            return 250.50;
        }
        if (milkProductName == "Flavored Milk") {
            return 25.65;
        }
        if (milkProductName == "Cream") {
            return 60.00;
        }
        if (milkProductName == "Butter") {
            return 80.25;
        } 
		else {
            System.out.println(milkProductName + " not found");
            return 0;
        }
    }

}
