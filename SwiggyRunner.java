class SwiggyRunner{
	public static void main(String[] item){
		double price = Swiggy.search("Pizza");
		System.out.println("Pizza price is "+price);
		
	}
}