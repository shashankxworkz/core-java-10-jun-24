class Amazon{

static String fullName;
static String location;
static String email;
static String passwordd;
static String confirmPassword;

public static boolean createAmazonUserAccount(String name, String address, String emailId, String pwd, String confirmpwd){
	boolean isAmazonCreated = false ;
	
	boolean isNameValid = false;
	boolean isLocationValid = false;
	boolean isemailValid = false;
	boolean ispasswordValid = false;
	boolean isconfirmpasswordValid = false;
	
	
	                    if(name != null){
						
						fullName = name ;
						isNameValid = true;
						}
						else
							System.out.println("Name is Invalid");
						
						if(address != null){
						
						location = address ;
						isLocationValid = true;
						}
						else
							System.out.println("Location is Invalid");
						
						if(emailId != null){
						
						email = emailId ;
						isemailValid = true;
						}
						else
							System.out.println("Email is Invalid");
						
						if(pwd != null){
						
						passwordd = pwd ;
						ispasswordValid = true;
						}
						else
							System.out.println("Password is Invalid");
						
						if(confirmpwd != null){
						
						confirmPassword = confirmpwd ;
						isconfirmpasswordValid = true;
						}
						else
							System.out.println(" Confirm Password is Invalid");
						
						  if(isNameValid == true && isLocationValid == true && isemailValid == true && ispasswordValid == true && isconfirmpasswordValid == true)
							  
	isAmazonCreated = true;
	
	return isAmazonCreated;
}
    
	public static void readAmazonUserAccount(){
		
		System.out.println("Amazon registration");
		System.out.println("Name:"+fullName);
		System.out.println("Location:"+location);
		System.out.println("Email Id:"+email);
		System.out.println("Password:"+passwordd);
		System.out.println("Confirm:"+confirmPassword);
	}
}