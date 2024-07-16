class FlightsInfo {

    public static int getFlightPriceByDestinationName(String destinationName){
		
		
        if (destinationName == "Bengalore") {
            return 2500;
        }
        if (destinationName == "Mumbai") {
            return 3500;
        }
        if (destinationName == "Hubli") {
            return 4800;
        }
        if (destinationName == "Pune") {
            return 4420;
        }
        if (destinationName == "Kolkata") {
            return 6500;
        }
        if (destinationName == "Hydrabad"){
            return 3000;
        }
        if (destinationName == "Ranchi") {
            return 4330;
        }
        if (destinationName == "Mangalore") {
            return 2500;
        }
        if (destinationName == "Belgavi") {
            return 2400;
        }
        if (destinationName == "San Jose") {
            return 14470;
        }
        if (destinationName == "Austin") {
            return 25460;
        }
        if (destinationName == "Jacksonville") {
            return 32350;
        }
        if (destinationName == "Fort Worth") {
            return 21370;
        }
        if (destinationName == "Columbus") {
            return 36380;
        }
        if (destinationName == "Charlotte") {
            return 32560;
        }
        if (destinationName == "San Francisco") {
            return 39480;
        }
        if (destinationName == "Indianapolis") {
            return 25390;
        }
        if (destinationName == "Seattle") {
            return 38490;
        }
        if (destinationName == "Denver") {
            return 40410;
        }
        if (destinationName == "Washington") {
            return 45420;
			
        } 
		
		else {
            System.out.println(destinationName + " not found");
            return 0;
		}
	}
}

