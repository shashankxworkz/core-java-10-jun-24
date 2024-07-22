class XworkzRunner{
	
	public static void main(String[] register){
		
		
		
	System.out.println("Main started");
	
	boolean registration = Xworkz.createTraineeRegistration("Akash",9676523656L,9986321560L,"Akash@gmai.com","2av19ec012","ECE","BE",2024);
	
	if(registration == true)
	Xworkz.readTraineeRegistration();
	
	System.out.println("Main ended");
	}

}