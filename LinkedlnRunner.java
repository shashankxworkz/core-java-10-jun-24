class LinkedlnRunner{

public static void main(String[]job){
	
	System.out.println("Main started");
	
	boolean linkdinProfile = Linkedln.createLinkedlnAccount("shashank","Hondad","shashankh@gmail.com","shasha@300","shasha@300","India",581207,"Microsoft","SDE","IT","BE in CSE");
	if(linkdinProfile == true)
		
	Linkedln.readLinkedlnAccount();
	System.out.println("Main ended");
}
}