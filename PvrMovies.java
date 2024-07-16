class PvrMovies{

    public static int getMoviePriceByName(String movieName){
	
        if(movieName == "Avatar"){
            return 300;
        }
        if (movieName == "AvengersEndgame"){
            return 350;
        }
        if (movieName == "Kalki"){
            return 280;
        }
        if (movieName == "Titanic") {
            return 250;
        }
        if (movieName == "The Dark Knight") {
            return 320;
        }
        if (movieName == "Lovelie"){
            return 300;
        }
        if (movieName == "Joker"){
            return 290;
        }
        if (movieName == "IT") {
            return 260;
        }
        if (movieName == "Spider-Man: No Way Home") {
            return 340;
        }
        if (movieName == "Black Panther") {
            return 310;
        }
        if (movieName == "Jurassic World") {
            return 330;
        }
        if (movieName == "Kote") {
            return 270;
        }
        if (movieName == "Rajkumar") {
            return 260;
        }
        if (movieName == "Yuva") {
            return 280;
        }
        if (movieName == "Kantara") {
            return 350;
        }
        if (movieName == "KGF 2") {
            return 270;
        }
        if (movieName == "Hanuman") {
            return 250;
        }
        if (movieName == "The Avengers") {
            return 320;
        }
        if (movieName == "Beauty and the Beast") {
            return 300;
        }
        if (movieName == "Iron Man 3") {
            return 330;
        } 
		
		else {
            System.out.println(movieName + " not found");
            return 0;
        }
    }
}

  
