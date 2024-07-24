class RaghavendraMedicalStore{

	static String medicineNames[] = {null, null, null, null, null, null, null, null, null, null};
	static int start;
	
	public static boolean addMedicineNames(String medicineName){
		boolean isMedicineNameAdded = false;
		
		if(medicineName != null){
			medicineNames[start++]=medicineName;
			isMedicineNameAdded = true;
		}else
			System.out.println("Medicine name is invalid");
			
	return isMedicineNameAdded;
	}
	
	public static void readMedicineNames(){
		
		System.out.println("Available Medicine names are");
		for(String medicine : medicineNames)
			System.out.println(medicine);
	
	return;
	
	}
}