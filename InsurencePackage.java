class InsurencePackage{

		public static double findInsurenceForLife(String insurenceName ){
		
		if(insurenceName == "Hdfc Life Insurence"){
		
		       return 7500.85 ;
		}
		if(insurenceName == "Icic Pre Term Insurence"){
		
		    return 6500.85 ;
		}
		
		if(insurenceName == "Policy Bazar Insurence"){
		
		     return  8000.15 ;
		}
		
		if(insurenceName == "Aditya Birla Sun Life "){
			
			return 6500.25;
		}
		
		if(insurenceName == "PNB MetLife Mera Term "){
			  
			  return 7600.36;
		}
		
		if(insurenceName == "SBI Life Term "){
			
                  return 9000.35;
				 
		}
			
		else{
		System.out.println(insurenceName+ "not found");
		
		}
		
		return 0.0;
		

		}



}