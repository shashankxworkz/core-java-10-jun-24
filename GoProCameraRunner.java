class GoProCameraRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		 GoProCamera.turnOn();
		 GoProCamera.turnOff();
		 GoProCamera.turnOn();
		 GoProCamera.turnOff();
		
		System.out.println("End of main method");
	}
}