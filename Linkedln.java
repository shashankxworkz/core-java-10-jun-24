class Linkedln{
	
	static String first;
	static String last;
      static String email;
static String pword;
static String confirm;
static String nation;
static int pin;
static String comp;
static String role;
static String ind;
static String edu;

public static boolean createLinkedlnAccount(String firstName, String lastName,String emailId, String pwd,String confirmPwd,String country,int pinCode, String company, String title, String industry,String education){
	boolean isLinkedlnCreated = true;
	
	first = firstName;
	last = lastName;
	email = emailId;
	pword = pwd;
	confirm = confirmPwd;
	nation = country;
	pin = pinCode;
	comp = company;
	role = title;
	ind = industry;
	edu = education;
	
	isLinkedlnCreated = true;
	return isLinkedlnCreated;
}
    
	public static void readLinkedlnAccount(){
		
		System.out.println("details...");
		System.out.println("First Name:"+first);
		System.out.println("Last Name:"+last);
		System.out.println("email Id:"+email);
		System.out.println("Password:"+pword);
		System.out.println("Confirm Password:"+confirm);
		System.out.println("Country:"+nation);
		System.out.println("Pin Code:"+pin);
		System.out.println("Company:"+comp);
		System.out.println("Title:"+role);
		System.out.println("Industry:"+ind);
		System.out.println("Education:"+edu);
		
	}
}