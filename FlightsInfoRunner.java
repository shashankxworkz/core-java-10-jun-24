class FlightsInfoRunner{
 
   public static void main(String [] air){
   
     System.out.println("main Started");
	 
	 String flightName = "Hubli" ;
   
  int price = FlightsInfo.getFlightPriceByDestinationName(flightName);
  
	 System.out.println("The Flight   Price is :" +price);

   System.out.println("main Ended");	 
   
   }

}