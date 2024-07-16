class PvrMoviesRunner{
 
   public static void main(String [] films){
   
     System.out.println("main Started");
	 
	 String movieName = "Yuva" ;
   
  int price = PvrMovies.getMoviePriceByName(movieName);
  
	 System.out.println("The Movie Price is : " +price);

   System.out.println("main Ended");	 
   
   }

}