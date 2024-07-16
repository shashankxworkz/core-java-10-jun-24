
class FoodPanda{
	public static double findMenuPrice(String menuName){
		double menuPrice=0.0;
		System.out.println("Menu Started");
		if(menuName=="Nippat masala"){
			menuPrice=98.45;
			return menuPrice;
		}
		if(menuName=="pani puri"){
			menuPrice=24.42;
			return menuPrice;
		}
		if(menuName=="dahi puri"){
			menuPrice=56.35;
			return menuPrice;
		}
		if(menuName=="masala puri"){
			menuPrice=89.45;
			return menuPrice;
		}
		if(menuName=="floating pani puri"){
			menuPrice=27.39;
			return menuPrice;
		}
		if(menuName=="Sev puri"){
			menuPrice=89.35;
			return menuPrice;
		}
		if(menuName=="Bhel puri"){
			menuPrice=90.12;
			return menuPrice;
		}
		if(menuName=="Vada pav"){
			menuPrice=88.35;
			return menuPrice;
		}
		if(menuName=="French fries"){
			menuPrice=90.25;
			return menuPrice;
		}
		if(menuName=="Noodles"){
			menuPrice=67.98;
			return menuPrice;
		}
		if(menuName=="Gobi dry"){
			menuPrice=87.25;
			return menuPrice;
		}
		if(menuName=="Gobi manchurian"){
			menuPrice=48.24;
			return menuPrice;
		}
		if(menuName=="Dahi vada"){
			menuPrice=14.46;
			return menuPrice;
		}
		if(menuName=="Pav bhaji"){
			menuPrice=89.86;
			return menuPrice;
		}
		if(menuName=="Potato twister"){
			menuPrice=58.50;
			return menuPrice;
		}
		if(menuName=="gobi 65"){
			menuPrice=23.67;
			return menuPrice;
		}
		if(menuName=="Gobi pepper dry"){
			menuPrice=76.23;
			return menuPrice;
		}
		if(menuName=="Aloo chat"){
			menuPrice=98.35;
			return menuPrice;
		}
		if(menuName=="Khachori"){
			menuPrice=35.78;
			return menuPrice;
		}
		if(menuName=="Maggi"){
			menuPrice=67.90;
			return menuPrice;
		}
		else{
			System.out.println(menuName+"is not available");
		}
		System.out.println("Menu ended");
		return menuPrice;
	}
}
