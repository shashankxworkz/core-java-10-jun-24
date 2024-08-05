class DebitCard1{
	
	int cardId;
	String cardHolderName;
	long cardNo;
	String expDate;
	int cvv;
	
	public DebitCard(){
		System.out.println("Debit Card object is created");
	}
	
    public DebitCard(int cardId,String cardHolderName,long cardNo,String expDate,int cvv){
	
	this.cardId = cardId;
	this.cardHolderName = cardHolderName;
	this.cardNo = cardNo;
	this.expDate = expDate;
	this.cvv = cvv;
}

public void getInfo(){
	System.out.println("----------------------------");
		System.out.println("Card Id is "+this.cardId);
		System.out.println("Card holder name is "+this.cardHolderName);
		System.out.println("CardNo is "+this.cardNo);
		System.out.println("Card expiry date is "+this.expDate);
		System.out.println("Card cvv is "+this.cvv);
}
}