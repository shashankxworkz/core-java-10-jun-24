class InsurencePackageRunner{
 
   public static void main(String [] ins){
   
     System.out.println("main Started");
	 
	 String insName = "Icic Pre Term Insurence";
	// String insName1 = "Hdfc Life Insurence";//
   
  double price = InsurencePackage.findInsurenceForLife(insName);
  
	 System.out.println("The Insurence price is :" +price);

   System.out.println("main Ended");	 
   
   }

}