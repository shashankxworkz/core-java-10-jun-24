class BillRunner{
	
	public static void main(String []bills){
		
		Bill ref = new Bill();
		ref.billReferenceId = 505012;
		ref.billSequenceNo = 102;
		ref.billIssueDate = "14/07/2024";
		ref.billDueDate = "31/07/2024";
		ref.isBillPaid = false;
		ref.isLatestBill = true;
		ref.isFinalBill = true;
		ref.billAmount = 35963.59;
		ref.taxInclusiveBill = true;
		
		System.out.println("Fetching The This  Month Bill Details ..........");
		System.out.print("\n");

		
		
		
		System.out.println("The Bill Reference Id : "+ref.billReferenceId);
		System.out.println("The Bill Sequence No is : "+ref.billSequenceNo);
		System.out.println("The Bill Issue Date is : "+ref.billIssueDate);
		System.out.println("The Bill Due Date is  : "+ref.billDueDate);
		System.out.println("The Bill Is Paid  : "+ref.isBillPaid);
		System.out.println("The Bill Is Latest One  : "+ref.isLatestBill);
		System.out.println("Is This Bill Final : "+ref.isFinalBill);
		System.out.println("The Bill Amount is : "+ref.billAmount);
		System.out.println("The Bill is Tax Inclusive  : "+ref.taxInclusiveBill);
		
		
		Bill ref1 = new Bill();
		ref1.billReferenceId = 505010;
		ref1.billSequenceNo = 101 ;
		ref1.billIssueDate = "14/06/2024";
		ref1.billDueDate = "15/07/2024";
		ref1.isBillPaid = true;
		ref1.isLatestBill = false;
		ref1.isFinalBill = true;
		ref1.billAmount = 49999.99;
		ref1.taxInclusiveBill = true;
		
		
		System.out.print("\n");
		System.out.println("Fetching The Old Month Bill Details...........");
		System.out.print("\n");
		
		
		System.out.println("The Bill Reference Id : "+ref1.billReferenceId);
		System.out.println("The Bill Sequence No is : "+ref1.billSequenceNo);
		System.out.println("The Bill Issue Date is : "+ref1.billIssueDate);
		System.out.println("The Bill Due Date is  : "+ref1.billDueDate);
		System.out.println("The Bill Is Paid  : "+ref1.isBillPaid);
		System.out.println("The Bill Is Latest One  : "+ref1.isLatestBill);
		System.out.println("Is This Bill Final : "+ref1.isFinalBill);
		System.out.println("The Bill Amount is : "+ref1.billAmount);
		System.out.println("The Bill is Tax Inclusive  : "+ref1.taxInclusiveBill);
		
		Bill1 ref3 = new Bill1();
		ref3.billReferenceId = 88964;
		ref3.billSequenceNo = 4 ;
		ref3.billIssueDate = "14/10/2024";
		ref3.billDueDate = "30/10/2024";
		ref3.isBillPaid = false;
		ref3.isLatestBill = true;
		ref3.isFinalBill = false;
		ref3.billAmount = 599.89;
		ref3.taxInclusiveBill = true;
		System.out.println("Bill is Generated for Next Month are:");
		System.out.println("Bill Reference Id is " + ref3.billReferenceId);
		System.out.println("Bill Sequence Number is " + ref3.billSequenceNo);
		System.out.println("Bill Issue Date is " + ref3.billIssueDate);
		System.out.println("Bill Due Date is " + ref3.billDueDate);
		System.out.println("Bill is Paid " + ref3.isBillPaid);
		System.out.println("Latest Bill is " + ref3.isLatestBill);
		System.out.println("Final Bill is " + ref3.isFinalBill);
		System.out.println("Bill Amount is " + ref3.billAmount);
		System.out.println("Tax Inclusive the Bill is " + ref3.taxInclusiveBill);
		
		Bill1 ref4 = new Bill1();
		ref4.billReferenceId = 757634;
		ref4.billSequenceNo = 5 ;
		ref4.billIssueDate = "14/11/2024";
		ref4.billDueDate = "30/11/2024";
		ref4.isBillPaid = false;
		ref4.isLatestBill = true;
		ref4.isFinalBill = false;
		ref4.billAmount = 234.90;
		ref4.taxInclusiveBill = true;
		System.out.println("Bill is Generated for Next Month are:");
		System.out.println("Bill Reference Id is " + ref4.billReferenceId);
		System.out.println("Bill Sequence Number is " + ref4.billSequenceNo);
		System.out.println("Bill Issue Date is " + ref4.billIssueDate);
		System.out.println("Bill Due Date is " + ref4.billDueDate);
		System.out.println("Bill is Paid " + ref4.isBillPaid);
		System.out.println("Latest Bill is " + ref4.isLatestBill);
		System.out.println("Final Bill is " + ref4.isFinalBill);
		System.out.println("Bill Amount is " + ref4.billAmount);
		System.out.println("Tax Inclusive the Bill is " + ref4.taxInclusiveBill);
		
		Bill1 ref5 = new Bill1();
		ref5.billReferenceId = 73642224;
		ref5.billSequenceNo = 6 ;
		ref5.billIssueDate = "14/12/2024";
		ref5.billDueDate = "30/12/2024";
		ref5.isBillPaid = false;
		ref5.isLatestBill = true;
		ref5.isFinalBill = false;
		ref5.billAmount = 456.98;
		ref5.taxInclusiveBill = true;
		System.out.println("Bill is Generated for Next Month are:");
		System.out.println("Bill Reference Id is " + ref5.billReferenceId);
		System.out.println("Bill Sequence Number is " + ref5.billSequenceNo);
		System.out.println("Bill Issue Date is " + ref5.billIssueDate);
		System.out.println("Bill Due Date is " + ref5.billDueDate);
		System.out.println("Bill is Paid " + ref5.isBillPaid);
		System.out.println("Latest Bill is " + ref5.isLatestBill);
		System.out.println("Final Bill is " + ref5.isFinalBill);
		System.out.println("Bill Amount is " + ref5.billAmount);
		System.out.println("Tax Inclusive the Bill is " + ref5.taxInclusiveBill);
		
		Bill1 ref6 = new Bill1();
		ref6.billReferenceId = 234346;
		ref6.billSequenceNo = 7 ;
		ref6.billIssueDate = "15/01/2025";
		ref6.billDueDate = "31/01/2025";
		ref6.isBillPaid = false;
		ref6.isLatestBill = true;
		ref6.isFinalBill = false;
		ref6.billAmount = 398.99;
		ref6.taxInclusiveBill = true;
		System.out.println("Bill is Generated for Next Month are:");
		System.out.println("Bill Reference Id is " + ref6.billReferenceId);
		System.out.println("Bill Sequence Number is " + ref6.billSequenceNo);
		System.out.println("Bill Issue Date is " + ref6.billIssueDate);
		System.out.println("Bill Due Date is " + ref6.billDueDate);
		System.out.println("Bill is Paid " + ref6.isBillPaid);
		System.out.println("Latest Bill is " + ref6.isLatestBill);
		System.out.println("Final Bill is " + ref6.isFinalBill);
		System.out.println("Bill Amount is " + ref6.billAmount);
		System.out.println("Tax Inclusive the Bill is " + ref6.taxInclusiveBill);
	
		
	}
	
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
      /*System.out.println("--The Bill Reference Id Numbers are---- : ");

		Bill ref = new Bill();
	int billReferenceId = ref.billReferenceId;
	   System.out.println(billReferenceId);
	   
	   billReferenceId = 505020;
System.out.println(billReferenceId);
	   
	   billReferenceId = 505021;
System.out.println(billReferenceId);

  billReferenceId = 505022;
System.out.println(billReferenceId);

  billReferenceId = 505023;
System.out.println(billReferenceId);

  billReferenceId = 505024;
System.out.println(billReferenceId);

  billReferenceId = 505025;
System.out.println(billReferenceId);

  billReferenceId = 505026;
System.out.println(billReferenceId);

  billReferenceId = 505027;
System.out.println(billReferenceId);

  billReferenceId = 505028;
System.out.println(billReferenceId);

  billReferenceId = 505029;
System.out.println(billReferenceId);

System.out.println("--The Bill Sequence  Numbers are ----  :");

		Bill ref1 = new Bill();
	int billSequenceNo = ref1.billSequenceNo;
	   System.out.println(billSequenceNo);   
	   
	   billSequenceNo = 101;
System.out.println(billSequenceNo);

billSequenceNo = 102;
System.out.println(billSequenceNo);

billSequenceNo = 103;
System.out.println(billSequenceNo);

billSequenceNo = 104;
System.out.println(billSequenceNo);

billSequenceNo = 105;
System.out.println(billSequenceNo);

billSequenceNo = 106;
System.out.println(billSequenceNo);

billSequenceNo = 107;
System.out.println(billSequenceNo);

billSequenceNo = 108;
System.out.println(billSequenceNo);

billSequenceNo = 109;
System.out.println(billSequenceNo);

billSequenceNo = 110;
System.out.println(billSequenceNo);

System.out.println("--The Bill Issue dates are ----  :");

		Bill ref2 = new Bill();
	String billIssueDate = ref2.billIssueDate;
	   System.out.println(billIssueDate);  
	   
	 billIssueDate = "21/07/2024";
	 System.out.println(billIssueDate);
	 
	  billIssueDate = "22/07/2024";
	 System.out.println(billIssueDate);
	 
	  billIssueDate = "23/07/2024";
	 System.out.println(billIssueDate);
	 
	  billIssueDate = "21/07/2024";
	 System.out.println(billIssueDate);
	 
	  billIssueDate = "24/07/2024";
	 System.out.println(billIssueDate);
	 
	  billIssueDate = "25/07/2024";
	 System.out.println(billIssueDate);
	 
	  billIssueDate = "26/07/2024";
	 System.out.println(billIssueDate);
	 
	  billIssueDate = "27/07/2024";
	 System.out.println(billIssueDate);
	 
	  billIssueDate = "28/07/2024";
	 System.out.println(billIssueDate);
	 
	  billIssueDate = "29/07/2024";
	 System.out.println(billIssueDate);
	 
	  billIssueDate = "30/07/2024";
	 System.out.println(billIssueDate);

  System.out.println("--The Bill Due dates are ----  :");

		Bill ref3 = new Bill();
	String billDueDate = ref3.billDueDate;
	   System.out.println(billDueDate); 
	   
	   billDueDate = "10/8/2024";
	   System.out.println(billDueDate);
	   
	   billDueDate = "11/8/2024";
	   System.out.println(billDueDate);
	   
	   billDueDate = "12/8/2024";
	   System.out.println(billDueDate);
	   
	   billDueDate = "13/8/2024";
	   System.out.println(billDueDate);
	   
	   billDueDate = "14/8/2024";
	   System.out.println(billDueDate);
	   
	   billDueDate = "15/8/2024";
	   System.out.println(billDueDate);
	   
	   billDueDate = "16/8/2024";
	   System.out.println(billDueDate);
	   
	   billDueDate = "17/8/2024";
	   System.out.println(billDueDate);
	   
	   billDueDate = "18/8/2024";
	   System.out.println(billDueDate);
	   
	   billDueDate = "19/8/2024";
	   System.out.println(billDueDate);
	   
	   System.out.println("--If The Bill is Paid or Not ----  :");

		Bill ref4 = new Bill();
	boolean isBillPaid = ref4.isBillPaid;
	   System.out.println(isBillPaid); 
	   
	   isBillPaid = true;
	   System.out.println(isBillPaid);
	   
	    isBillPaid = true;
	   System.out.println(isBillPaid);
	   
	    isBillPaid = false;
	   System.out.println(isBillPaid);
	   
	    isBillPaid = true;
	   System.out.println(isBillPaid);
	   
	    isBillPaid = false;
	   System.out.println(isBillPaid);
	   
	    isBillPaid = false;
	   System.out.println(isBillPaid);
	   
	    isBillPaid = true;
	   System.out.println(isBillPaid);
	   
	    isBillPaid = true;
	   System.out.println(isBillPaid);
	   
	    isBillPaid = false;
	   System.out.println(isBillPaid);
	   
	    isBillPaid = true;
	   System.out.println(isBillPaid);
	   
	   System.out.println("--The Bill Is Latest one ----  :");

		Bill ref5 = new Bill();
	boolean isLatestBill = ref5.isLatestBill;
	   System.out.println(isLatestBill);  
	   
	   isLatestBill = true;
	   System.out.println(isLatestBill);
	   
	   isLatestBill = true;
	   System.out.println(isLatestBill);
	   
	   isLatestBill = true;
	   System.out.println(isLatestBill);
	   
	   isLatestBill = false;
	   System.out.println(isLatestBill);
	   
	   isLatestBill = false;
	   System.out.println(isLatestBill);
	   
	   isLatestBill = true;
	   System.out.println(isLatestBill);
	   
	   isLatestBill = true;
	   System.out.println(isLatestBill);
	   
	   isLatestBill = false;
	   System.out.println(isLatestBill);
	   
	   isLatestBill = true;
	   System.out.println(isLatestBill);
	   
	   isLatestBill = true;
	   System.out.println(isLatestBill);
	   
	   System.out.println("--The Final Bills Are  ----  :");
	   
	   Bill ref6 = new Bill();
	boolean isFinalBill = ref6.isFinalBill;
	   System.out.println(isFinalBill);  
	   
	   isFinalBill = true;
	   System.out.println(isFinalBill);
	   
	   isFinalBill = true;
	   System.out.println(isFinalBill);
	   
	   isFinalBill = true;
	   System.out.println(isFinalBill);
	   
	   isFinalBill = true;
	   System.out.println(isFinalBill);
	   
	   isFinalBill = false;
	   System.out.println(isFinalBill);
	   
	   isFinalBill = true;
	   System.out.println(isFinalBill);
	   
	   isFinalBill = true;
	   System.out.println(isFinalBill);
	   
	   isFinalBill = false;
	   System.out.println(isFinalBill);
	   
	   isFinalBill = true;
	   System.out.println(isFinalBill);
	   
	   isFinalBill = true;
	   System.out.println(isFinalBill);
	   
	    System.out.println("--The Bill Amouts Are  ----  :");
	   
	   Bill ref7 = new Bill();
	double billAmount = ref7.billAmount;
	   System.out.println(billAmount);  
	   
	   billAmount = 20999.00d;
	   System.out.println(billAmount);
	   
	    billAmount = 25999.00d;
	   System.out.println(billAmount);
	   
	    billAmount = 36990.00d;
	   System.out.println(billAmount);
	   
	    billAmount = 39899.85d;
	   System.out.println(billAmount);
	   
	    billAmount = 120900.00d;
	   System.out.println(billAmount);
	   
	    billAmount = 150999.50d;
	   System.out.println(billAmount);
	   
	    billAmount = 180998.50d;
	   System.out.println(billAmount);
	   
	    billAmount = 200999.00d;
	   System.out.println(billAmount);
	   
	    billAmount = 210900.05d;
	   System.out.println(billAmount);
	   
	    billAmount = 220999.50d;
	   System.out.println(billAmount);
	   
	   
	   System.out.println("--The Tax Inclusive Bills Are  ----  :");
	   
	   Bill ref8 = new Bill();
	boolean taxInclusiveBill = ref8.taxInclusiveBill;
	   System.out.println(taxInclusiveBill);  
	   
	   taxInclusiveBill = true;
	   System.out.println(taxInclusiveBill);
	   
	   taxInclusiveBill = true;
	   System.out.println(taxInclusiveBill);
	   
	   taxInclusiveBill = true;
	   System.out.println(taxInclusiveBill);
	   
	   taxInclusiveBill = true;
	   System.out.println(taxInclusiveBill);
	   
	   taxInclusiveBill = false;
	   System.out.println(taxInclusiveBill);
	   
	   taxInclusiveBill = true;
	   System.out.println(taxInclusiveBill);
	   
	   taxInclusiveBill = true;
	   System.out.println(taxInclusiveBill);
	   
	   taxInclusiveBill = true;
	   System.out.println(taxInclusiveBill);
	   
	   taxInclusiveBill = true;
	   System.out.println(taxInclusiveBill);
	   
	   taxInclusiveBill = false;
	   System.out.println(taxInclusiveBill);*/
	   
	   
	   
	   
	   

}
}