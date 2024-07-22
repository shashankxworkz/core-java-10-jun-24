class DigiLocker{

static String full;
static String age;
static String sex;
static String phone;
static String otp;
static String email;
static String aadhaar;


public static boolean createDigiLockerSignUp(String fullName, String dob, String gender, String phoneNumber, String otpPin, String emailId, String aadhaarNumber){
	boolean isDigiLockerCreated = true;
	
	full=fullName;
	age=dob;
	sex=gender;
	phone=phoneNumber;
	otp=otpPin;
	email=emailId;
	aadhaar=aadhaarNumber;
	
	isDigiLockerCreated = true;
	return isDigiLockerCreated;
}
    
	public static void readDigiLockerSignUp(){
		
		System.out.println("Digi Locker sign up..");
		System.out.println("Full Name:"+full);
		System.out.println("Date of birth:"+age);
		System.out.println("Gender:"+sex);
		System.out.println("Phone Number:"+phone);
		System.out.println("otp Pin:"+otp);
		System.out.println("Email Id:"+email);
		System.out.println("Aadhaar Number:"+aadhaar);
		
	}
}