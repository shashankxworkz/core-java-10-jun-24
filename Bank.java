class Bank{
	
	static int id;
	static String name;
	static String branchName;
	static String ifscCode;
	static String swiftCode;
	static int noOfWorker;
    static String branchManager;
	
	public Bank(){
		System.out.println("Bank object is created");
	}
	
	public Bank(int id,String name,String branchName,String ifscCode,String swiftCode,int noOfWorker,String branchManager){
		this.id=id;
	    this.name=name;
		this.branchName=branchName;
	    this.ifscCode=ifscCode;
	    this.swiftCode=swiftCode;
	    this.noOfWorker=noOfWorker;
        this.branchManager=branchManager;
	}
	this()
	
	public void getInfo(){
	System.out.println("-------------------------------");
	System.out.println("Customer id is "+this.id);
	System.out.println("Customer name is "+this.name);
	System.out.println("Bank branch name is "+this.branchName);
	System.out.println("Bank ifscCode is "+this.ifscCode);
	System.out.println("Bank swiftCode is "+this.swiftCode);
	System.out.println("Number of workers is"+this.noOfWorker);
	System.out.println("Branch manager is "+this.branchManager);
	}
}