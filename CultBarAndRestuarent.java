class CultBarAndRestuarent{

	static String alcoholNames[] = {null, null, null, null, null, null, null, null, null, null};
	static int start;
	
	public static boolean addAlcoholNames(String alcoholName){
		boolean isAlcoholNameAdded = false;
		
		if(alcoholName != null){
			alcoholNames[start++]=alcoholName;
			isAlcoholNameAdded = true;
		}else
			System.out.println("Alcohol name is invalid");
			
	return isAlcoholNameAdded;
	}
	
	public static void readAlcoholNames(){
		
		System.out.println("Available Alcohol names are : ");
		for(String alcohol : alcoholNames)
			System.out.println(alcohol);
	
	return;
	
	}
}