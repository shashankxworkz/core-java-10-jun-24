class AmazonRunner{

public static void main(String[]ecommerceweb){
	
	
	
    System.out.println("Main started");
	
	  boolean createAmazonUser = Amazon.createAmazonUserAccount("shashank","Hubli", "shashank@gmail.com","shash@","shash@");
	    if(createAmazonUser == true)
	Amazon.readAmazonUserAccount();
	
	System.out.println("Main ended");
	}
}