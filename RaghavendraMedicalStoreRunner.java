  class  RaghavendraMedicalStoreRunner{


		public static void main(String [] pharmacy){
		
		System.out.println("Main started");
		
		boolean medicineAdded  =   RaghavendraMedicalStore.addMedicineNames("Acrivastine");
		System.out.println("Medicine name added");
		
		  medicineAdded =  RaghavendraMedicalStore.addMedicineNames("Paracetamol");
		System.out.println("Medicine name added");

        medicineAdded =  RaghavendraMedicalStore.addMedicineNames("Tylenol");
		System.out.println("Medicine name added");

        medicineAdded =  RaghavendraMedicalStore.addMedicineNames("ibuprofen");
		System.out.println("Medicine name added");

        medicineAdded =  RaghavendraMedicalStore.addMedicineNames("aspirin");
		System.out.println("Medicine name added");
		
		medicineAdded =  RaghavendraMedicalStore.addMedicineNames("Advil");
		System.out.println("Medicine name added");
		
		medicineAdded =  RaghavendraMedicalStore.addMedicineNames("Motrin");
		System.out.println("Medicine name added");
		
		medicineAdded =  RaghavendraMedicalStore.addMedicineNames("naproxen");
		System.out.println("Medicine name added");
		
		medicineAdded =  RaghavendraMedicalStore.addMedicineNames("Acephen");
		System.out.println("Medicine name added");
		
		medicineAdded =  RaghavendraMedicalStore.addMedicineNames("Dolono");
		System.out.println("Medicine name added");
		
			
		 RaghavendraMedicalStore.readMedicineNames();
		
		
		System.out.println("main ended");
	}


}