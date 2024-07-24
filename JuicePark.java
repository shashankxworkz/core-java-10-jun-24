class JuicePark{

	static String juiceNames[] = {null, null, null, null, null, null, null, null, null, null};
	static int start;
	
	public static boolean addJuiceNames(String juiceName){
		boolean isJuiceNameAdded = false;
		
		if(juiceName != null){
			juiceNames[start++]=juiceName;
			isJuiceNameAdded = true;
		}else
			System.out.println("Juice name is invalid");
			
	return isJuiceNameAdded;
	}
	
	public static void readJuiceNames(){
		
		System.out.println("Available Juice names are");
		for(String juices : juiceNames)
			System.out.println(juices);
	
	return;
	
	}
}