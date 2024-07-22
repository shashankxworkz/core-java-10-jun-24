class LoanApplicationGenerationRunner{
	
	public static void main(String[] loan){
		
		
		
	System.out.println("Main started");
	
	LoanApplicationGeneration.createLoanApplicationDetails("Amogh","canara bank","Student loan",748,"8%"," 5 Years");
	LoanApplicationGeneration.readLoanApplicationDetails();
	
	System.out.println("Main ended");
	}

}