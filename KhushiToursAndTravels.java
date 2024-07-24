class KhushiToursAndTravels{

	static String placeNames[] = {null, null, null, null, null, null, null, null, null, null};
	static int start;
	
	public static boolean addPlaceNames(String placeName){
		boolean isPlaceNameAdded = false;
		
		if(placeName != null){
			placeNames[start++]=placeName;
			isPlaceNameAdded = true;
		}else
			System.out.println("Place name is invalid");
			
	return isPlaceNameAdded;
	}
	
	public static void readPlaceNames(){
		
		System.out.println("Available Place names are");
		for(String place : placeNames)
			System.out.println(place);
	
	return;
	
	}
}