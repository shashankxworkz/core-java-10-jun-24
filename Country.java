class Country{
	
	 int countryId;
	 String countryName;
	 int noOfStates;
	 String primeMinister;
	 String population;
	
	public Country(){
		System.out.println("Country object is created");
	}
	
	public Country(int countryId,String countryName,int noOfStates,String primeMinister,String population){
	this.countryId=countryId;
	this.countryName=countryName;
	this.noOfStates=noOfStates;
	this.primeMinister=primeMinister;
	this.population=population;
	}
	
	public void getInfo(){
		System.out.println("--------------------------");
	System.out.println("Country Id is "+this.countryId);
	System.out.println("Country name is "+this.countryName);
	System.out.println("Number of states is "+this.noOfStates);
	System.out.println("Prime Minister is "+this.primeMinister);
	System.out.println("Population of country is "+this.population);
	}
}