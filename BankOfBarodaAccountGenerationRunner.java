class BankOfBarodaAccountGenerationRunner{
	
	public static void main(String[] account){
		
		
		
	System.out.println("Main started");
	
	boolean bankAccCreate = BankOfBarodaAccountGeneration.createCustomerBankAccountDetails("shashank",967652365635L,"11-08-2002","hubli","Indian","Dharwad","Karnataka",6360025460L);
	
	if(bankAccCreate == true)
	BankOfBarodaAccountGeneration.readCustomerBankAccountDetails();
	
	System.out.println("Main ended");
	}

}