class JuiceParkRunner{


		public static void main(String [] fruitJuice){
		
		System.out.println("Main started");
		
		boolean juiceAdded  =  JuicePark.addJuiceNames("Apple juice");
		System.out.println("juice name added");
		
		  juiceAdded = JuicePark.addJuiceNames("Mango Juice");
		System.out.println("juice name added");

        juiceAdded = JuicePark.addJuiceNames("orange juice");
		System.out.println("juice name added");

        juiceAdded = JuicePark.addJuiceNames("strawberry juice");
		System.out.println("juice name added");

        juiceAdded = JuicePark.addJuiceNames("Banana juice");
		System.out.println("juice name added");
		
		juiceAdded = JuicePark.addJuiceNames("Watermelon juice");
		System.out.println("juice name added");
		
		juiceAdded = JuicePark.addJuiceNames("Papaya juice");
		System.out.println("juice name added");
		
		juiceAdded = JuicePark.addJuiceNames("Lemon juice");
		System.out.println("juice name added");
		
		juiceAdded = JuicePark.addJuiceNames("Kiwi juice");
		System.out.println("juice name added");
		
		juiceAdded = JuicePark.addJuiceNames("Dragon Fruit juice");
		System.out.println("juice name added");
		
			
		JuicePark.readJuiceNames();
		
		
		System.out.println("main ended");
	}


}