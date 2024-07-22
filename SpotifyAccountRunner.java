class SpotifyAccountRunner{

	public static void main(String[] spotify){
	
		boolean createAcc = SpotifyAccount.createAccount("shashank","10/10/2000" ,"shashank@gmail.com", "shash2020", "shashank", "shashank");
	
		if(createAcc == true)
		SpotifyAccount.readUserAccountDetails();
	}
}