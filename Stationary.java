class Stationary{
	
		static String name = "Sri Ganesh Stationary Store ";
		
		static String items[] = {"Paper","Scissors","Stapler","Folder","Marker","Paperclips Pen","Highlighter","Highlighters","Notebook","Pencils","Sticky Notes","Calculator","Desk accessories","Eraser","Envelopes"};
	   
	    public static void main(String[] statonary){
		System.out.println("Main started");
		System.out.println("The Shop Name is "+name);
		System.out.println("The Number of items is " + items.length);
		
		for (int ref = 0 ; ref < items.length ; ref++){
			String value = items[ref];
			System.out.println(value);
		}
		//(String item: items){
		//System.out.println(item);
		//}
		
	
		
		
		//System.out.println("*");
		//System.out.println("Available Items are\n"+items[0]+"\n"+items[1]+"\n"+items[2]+"\n"+items[3]+"\n"+items[4]+"\n"+items[5]+"\n"+items[6]+"\n"+items[7]+"\n"+items[8]+"\n"+items[9]+"\n"+items[10]+"\n"+items[11]+"\n"+items[12]+"\n"+items[13]+"\n"+items[14]);
		//System.out.println("*");
		
		System.out.println("Main ended");
		
	}
}