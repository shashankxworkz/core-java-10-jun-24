class House1{
	
	int houseId;
	String houseName;
	int noOfRooms;
	int noOfFloors;
	int areaInSqrt;
	int noOfMembers;


    public House(){
	System.out.println("House object is created");
}

   public House(int houseId,String houseName,int noOfRooms,int noOfFloors,int areaInSqrt,int noOfMembers){
	this.houseId = houseId;
	this.houseName = houseName;
	this.noOfRooms = noOfRooms;
	this.noOfFloors = noOfFloors;
	this.areaInSqrt = areaInSqrt;
	this.noOfMembers = noOfMembers;
}

public void displayInfo(){
	System.out.println("--------------------------------");
	System.out.println("House Id is "+this.houseId);
	System.out.println("House name is "+this.houseName);
	System.out.println("Number of Rooms is "+this.noOfRooms);
	System.out.println("Number of Floors is "+this.noOfFloors);
	System.out.println("Area in Sqrt is "+this.areaInSqrt);
	System.out.println("Number of members is "+this.noOfMembers);
}
}