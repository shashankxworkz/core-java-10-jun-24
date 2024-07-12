class Refrigerator{

	static boolean isRefrigeratorOn = false ;
	static int maxLevele = 2;
	static int minLevele = 0;
	static int currenLevele;
	
	public static boolean OnOrOff(){
		
		System.out.println("Start of turnOn method");
		
		isRefrigeratorOn = (isRefrigeratorOn == false) ? true : false;

		
		/*if(isRefrigeratorOn == false){
			isRefrigeratorOn = true;
			System.out.println("Refrigerator is turned on");
		}
		else if (isRefrigeratorOn == true){
			isRefrigeratorOn = false;
			System.out.println("Refrigerator is turned off");
		System.out.println("End of turnOff method");
		}*/
		
		
	return isRefrigeratorOn ;
	}
	
	public static void increaseLevel(){

	System.out.println("Start of increase Level method");
	
			if(isRefrigeratorOn == true){
				if(currenLevele < maxLevele){
					currenLevele = currenLevele + 1;
					System.out.println("Current Level is "+ currenLevele);
				}else System.out.println("Maximum Level reached");
			}else System.out.println("Turn on the Refrigerator");

		System.out.println("End of increase Level method");
		return;
	}

         public static void decreaseLevel(){
		
		System.out.println("Start of decrease Level method");
	
			if(isRefrigeratorOn == true){
				if(currenLevele > minLevele){
					currenLevele = currenLevele - 1;
					System.out.println("Current Level is "+ currenLevele);
				}else System.out.println("Minimum Level reached");
			}else System.out.println("Turn on the Refrigerator");

		System.out.println("End of decrease Level method");
	return;
	}
}
