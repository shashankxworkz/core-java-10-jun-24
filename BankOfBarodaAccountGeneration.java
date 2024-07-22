class BankOfBarodaAccountGeneration{
        
	    static String name ;
		static long aadhaarNo ;
		static String dob;
		static String location;
		static String nation ;
		static String dis ;
		static String sta ;
		static long phoneNumber ;

		
    public static boolean createCustomerBankAccountDetails(String firstName, long aadhaarNumber, String dOB, String address, String nationality, String district, String state, long mobileNumber){
	
	     boolean isBankAccountCreated = false ;
		 
		boolean isFirstName = false;
		boolean isAadhaarNumber = false;
		boolean isDob = false;
		boolean isLocation = false;
		boolean isNation  = false;
		boolean isDistrict = false;
		boolean isState = false;
		boolean isPhoneNo = false;
		
		if(firstName != null){
			name=firstName;
			isFirstName = true;
		}else
			System.out.println("Invalid name");
		
		 if(aadhaarNumber != 0L){
			aadhaarNo=aadhaarNumber;
			isAadhaarNumber = true;
		}else
			System.out.println("Invalid Aadhaar Number");
		
		if(dOB != null){
			dob=dOB;
			isDob = true;
		}else
			System.out.println("Invalid DOB ");
		
		if(address != null){
			location=address;
			isLocation = true;
		}else
			System.out.println("Invalid Location ");
		
		
		if(nationality != null){
			nation=nationality;
			isNation = true;
		}else
			System.out.println("Invalid nationality ");
		
         if(district != null){
			dis=district;
			isDistrict = true;
		}else
			System.out.println("Invalid District ");		

		 if(state != null){
			sta=state;
			isState = true;
		}else
			System.out.println("Invalid State ");
		 
		 if(mobileNumber != 0L){
			phoneNumber=mobileNumber;
			isPhoneNo = true;
		}else
			System.out.println("Invalid PhoneNo ");
		 
		 
		 if(isFirstName == true && isAadhaarNumber == true && isDob == true && isLocation == true && isNation == true && isDistrict == true && isState == true && isPhoneNo == true)
			isBankAccountCreated = true;
		 
		 
		 return isBankAccountCreated ;
	
	}
    
	public static void readCustomerBankAccountDetails(){
	
	    System.out.println("fetching... Customer Details...");
		System.out.println("The Customer Name is :" + name);
		System.out.println("The Customer Aadhaar Number is :" + aadhaarNo);
		System.out.println("The Customer Date of Birth is :" + dob);
		System.out.println("The Customer address is :" + location);
		System.out.println("The Customer Nationality is :" +nation);
		System.out.println("The Customer District is :" + dis);
		System.out.println("The Customer State is :" + sta);
		System.out.println("The Customer Mobile Number is :" + phoneNumber);
		
		
	
	}
}
