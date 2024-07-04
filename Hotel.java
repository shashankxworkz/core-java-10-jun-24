class Hotel{
	
	
	    static String name = "Sai Vilasa";
		static String foodMenu[] = {"Tandori Roti", "Paneer Butter Masala", "Sayi Paneer Kema Paneer", "Chicken Dam Biriyani","Egg Biriyani", "Paneer Burji","Palak Paneer Matter Paneer","Veg Biriyani","Paneer Masala","Gee Rice","Paneer Manchurian","Jeera Rice","Dal Fry Tadka","White Rice Meals","Naan","Green Pees Masala","Boil Rice Meals","Rottia","Kajuma Masala","Fried Rice","Chicken Fried Rice","Egg Fried Rice","Mashroom Masala","Gobi Fried Rice","Aloo Gobi Shabji"};
	    public static void main(String[] foodmenu){
		System.out.println("Main started");
		
		
		
		System.out.println("Welcome to "+name);
		System.out.println("*");
		System.out.println("------MENU------");
		System.out.println("*");
		System.out.println("The Number of items is : " +foodMenu.length);
		
		for (int val = 0; val < foodMenu.length ; val++){
			String ref = foodMenu[val];
			System.out.println(ref);
		}
		
		/*(String food: foodMenu){
			System.out.println(food); 
		}*/
		
		//System.out.println(foodMenu[0]+"\n"+foodMenu[1]+"\n"+foodMenu[2]+"\n"+foodMenu[3]+"\n"+foodMenu[4]+"\n"+foodMenu[5]+"\n"+foodMenu[6]+"\n"+foodMenu[7]+"\n"+foodMenu[8]+"\n"+foodMenu[9]+"\n"+foodMenu[10]+"\n"+foodMenu[11]+"\n"+foodMenu[12]+"\n"+foodMenu[13]+"\n"+foodMenu[14]+"\n"+foodMenu[15]+"\n"+foodMenu[16]+"\n"+foodMenu[17]+"\n"+foodMenu[18]+"\n"+foodMenu[19]+"\n"+foodMenu[20]+"\n"+foodMenu[21]+"\n"+foodMenu[22]+"\n"+foodMenu[23]+"\n"+foodMenu[24]);
		System.out.println("*");
		
		System.out.println("Main ended");
		
	}
}