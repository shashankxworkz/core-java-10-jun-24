class SuperMarket{
	
    static String groceries[] = {"Rice" , "Urad dal" , "Wheat" , "Ragi" , "Suger" , "Egg" , "Bread" , "Butter" , "Panner" , "Milk" , "Cream Chees" , "Soya Burger" , "coconet" , "Salt" , "Pam Oil"};
	static String vegetables[] = {"carrot" , " Beans" , "Ladies Fingers" , "Onion" , "Spinch" , "Beet Greens" , "Arugula" , "Asparagus" , "Beetroot" , "Broccoli Rabe" , "Butternut Squash" , " Cabbage" , "Cauliflower" , "Eggplant" , "Garlic"};
	static String perfumes[] = {"fogg" , "Villain" , "Bellaveta" , "Parkvenue" , "Wild Stone" , "Yardly" , "SweetHaert" , "Skinn" , "Engage" , "Embark" , "Beardo" , "AXE" , "Lucky You" , "Tom Ford" , "Rose Vanila"};
	static String fruits [] = {"Orange" , "Apple" , "Pinapul" , "Kiwi" , "Water Mellon" , "staroberry" , "Banana" , "dragon Fruit" , "Cocumber" , "Mango" , "Papaya" , "Pear" , "Grape" , "Cheery" , "JackFruit"};
	static String snaks [] = {"PopCorn" , "Energy Bar" , "Soya Stiks" , "Chips" , "Walnuts" , "maggie" , "Sandwich" , "Pani Puri" , "Papad Chatni" , "Burger" , "Kabab" , "Papad masal" , "vada Pav" , "Bel Puri" , "Samosa"};
	static String chocolates [] = {"Dairy Milk" , "Munch" , "Snikers" , "KitKet" , "Perk" , "5-Star" , "Cadbury" , "Aero" , "Big Turk" , "Gems" , "Lotos" , "Hershey" , "Choco Pie" , "Mars" , "Hide & Seek"};
	static String sweets [] = {"Apple halwa" , "Boondi" , "Gulab Jamun" , "Jalebi" , "kaju Katti" , "kheer" , "kulfi" , "Laddu" , "Lassi" , "motiChur" , "Sheera" , "Halwa" , "Besan Laddu" , "Mysore Pak" , "Shavange"};
	static String cosmetics [] = {"Lakme" , "Lotus Herbals" , "Maybelline" , "Revlon" , "Himalaya Herbals" , "L’Oreal Paris" , "Pilgrim" , "AVON" , "Lotus" , "NYX" , "Viviana Colors" , "Coloressence" , "Jovees" , "Elle 18" , "parachute"};
	static String alcohols [] = {"Beer" , "Wine" , "Rum" , "Whisky" , "Brandy" , "Vodka" , "Tequila" , "Gin" , "Mead" , "Cider" , "Desi Daru" , "Taadi – Palm Wine" , "Mahua" , "Hadia – Rice Beer" , "Shindhi"};
	static String biscuits [] = {"Britannia" , "Sunfeast" , "Parle" , "McVitie’s" , "Priyagold" , "Dukes" , "Horlicks" , "Anmol" , "Sobisco" , "Haldiram" , "Nezone" , "Pillsbury" , "Karachi" , "Nature Valley" , "Cremica"};
	static String coolDrinks [] = {"Pepsi" , "Cococola" , "Sprite" , "Maazaa" , "Lichi" , "Sting" , "TumzUp" , "Limca" , "Sherbet" , "Soda" , "Zeera" , "7-Up" , "Fizz" , "Slice" , "Lassi"};
	static String iceCreame [] = {"Vanilla" , "Strawberry" , "Chocolate" , "Blueberry" , "Mango Ice Creame" , "cookies and cream" , "Coconut" , "Butterscotch" , "Kulfi" , "Jaljeera" , "Anjeer Badam" , "Cardamom" , "Kesar Pista" , "Cassata" , "Pista"};
    static String footware [] = {"Liberty" , "Paragon" , "Red Chief" , "Metro Shoes" , "VKC Footwear" , "SKO" , "Inc.5" , "Red Tape" , "Lakhani" , "Hitz" , "Action" , "Puma" , "Nike" , "HRX" , "campus"};
    static String clothes [] = {"Mekhela" , "Saree" , "Kurta" , "Lungi" , "Dhoti" , "Ghagra Choli" , "Salwar Kameez" , "Turban" , "Kediya" , "Pathani Suit" , "Taranga" , "Bandhgala" , "Jainsen" , "Fancy" , "Kurtha"};
	static String milkProduct [] = {"Ayran" , "Butter" , "Buttermilk" , "Cheese" , "Clotted Cream" , "Condensed Milk" , "Cottage Cheese" , "Cream" , "Cream Cheese" , " Dried milk"};
	static String homeAppliances [] = {"Tv" , "Refrigirator" , "Home Theater" , "Sofa" , "Chair" , "Fan" , "AC" , "Cooler" , "Heater" , "Wifi" , "Computer" , "Laptop"};
	
	public static void main(String dMart[]){
	System.out.println("Main started");
	System.out.println("WelCome To DMart Store");
	System.out.println("--------------------------------------");
	
	for (String grocery : groceries){
		System.out.println(grocery);
	}
//System.out.println("The Groceries Available Are in DMart : \n "+groceries[0]+ "  \n "+groceries[1]+ "  \n "+groceries[2]+ " \n  "+groceries[3]+ " \n  "+groceries[4]+" \n  "+groceries[5]+ " \n  "+groceries[6]+ " \n  "+groceries[7]+ " \n  "+groceries[8]+ " \n  "+groceries[9]+ "\n  "+groceries[10]+ " \n  "+groceries[11]+ " \n  "+groceries[12]+ " \n  "+groceries[13]+ " \n  "+groceries[14]);
    System.out.println("--------------------------------------");
	for (String vegetable : vegetables){
		System.out.println(vegetable);
	}
	//System.out.println("The Vegetables Available in DMart  : \n "+vegetables[0]+ "  \n "+vegetables[1]+ "  \n "+vegetables[2]+ " \n  "+vegetables[3]+ " \n  "+vegetables[4]+" \n  "+vegetables[5]+ " \n  "+vegetables[6]+ " \n  "+vegetables[7]+ " \n  "+vegetables[8]+ " \n  "+vegetables[9]+ " \n "+vegetables[10]+ " \n "+vegetables[11]+ " \n "+vegetables[12]+ " \n "+vegetables[13]+ " \n "+vegetables[14]);
	System.out.println("--------------------------------------");
	for (String perfume : perfumes){
		System.out.println(perfume);
	}
//System.out.println("The Perfumes Available in DMart : \n   "+perfumes[0]+ "  \n "+perfumes[1]+ "  \n "+perfumes[2]+ " \n  "+perfumes[3]+ " \n  "+perfumes[4]+" \n  "+perfumes[5]+ " \n  "+perfumes[6]+ " \n  "+perfumes[7]+ " \n  "+perfumes[8]+ " \n  "+perfumes[9]+ "\n  "+perfumes[10]+ " \n  "+perfumes[11]+ " \n  "+perfumes[12]+ " \n  "+perfumes[13]+ " \n  "+perfumes[14]);
	System.out.println("--------------------------------------");
	for (String fruit : fruits){
		System.out.println(fruit);
	}
	//System.out.println(" The Fruites Available in DMart : \n "  +fruits[0]+ "  \n "+fruits[1]+ "  \n "+fruits[2]+ " \n  "+fruits[3]+ " \n  "+fruits[4]+" \n  "+fruits[5]+ " \n  "+fruits[6]+ " \n  "+fruits[7]+ " \n  "+fruits[8]+ " \n  "+fruits[9]+ "\n  "+fruits[10]+ " \n  "+fruits[11]+ " \n  "+fruits[12]+ " \n  "+fruits[13]+ " \n  "+fruits[14]);
	System.out.println("--------------------------------------");
	for (String snak : snaks){
		System.out.println(snak);
	}
  //  System.out.println(" The Snaks Available in DMart : \n "+ snaks[0]+ "  \n "+snaks[1]+ "  \n "+snaks[2]+ " \n  "+snaks[3]+ " \n  "+snaks[4]+" \n  "+snaks[5]+ " \n  "+snaks[6]+ " \n  "+snaks[7]+ " \n  "+snaks[8]+ " \n  "+snaks[9]+ "\n  "+snaks[10]+ " \n  "+snaks[11]+ " \n  "+snaks[12]+ " \n  "+snaks[13]+ " \n  "+snaks[14]);
	System.out.println("--------------------------------------");
	for (String choco : chocolates){
		System.out.println(choco);
	}
	//System.out.println(" The Chocolates Available in DMart : \n "+ chocolates[0]+ "  \n "+chocolates[1]+ "  \n "+chocolates[2]+ " \n  "+chocolates[3]+ " \n  "+chocolates[4]+" \n  "+chocolates[5]+ " \n  "+chocolates[6]+ " \n  "+chocolates[7]+ " \n  "+chocolates[8]+ " \n  "+chocolates[9]+ "\n  "+chocolates[10]+ " \n  "+chocolates[11]+ " \n  "+chocolates[12]+ " \n  "+chocolates[13]+ " \n  "+chocolates[14]);
	System.out.println("--------------------------------------");
	for (String sweet : sweets){
		System.out.println(sweet);
	}
	//System.out.println(" The Sweets Available in DMart : \n "+ sweets[0]+ "  \n "+sweets[1]+ "  \n "+sweets[2]+ " \n  "+sweets[3]+ " \n  "+sweets[4]+" \n  "+sweets[5]+ " \n  "+sweets[6]+ " \n  "+sweets[7]+ " \n  "+sweets[8]+ " \n  "+sweets[9]+ "\n  "+sweets[10]+ " \n  "+sweets[11]+ " \n  "+sweets[12]+ " \n  "+sweets[13]+ " \n  "+sweets[14]);
	System.out.println("--------------------------------------");
	for (String cosmotic : cosmetics){
		System.out.println(cosmotic);
	}
	//System.out.println(" The Cosmetics Available in DMart : \n "+cosmetics[0]+ "  \n "+cosmetics[1]+ "  \n "+cosmetics[2]+ " \n  "+cosmetics[3]+ " \n  "+cosmetics[4]+" \n  "+cosmetics[5]+ " \n  "+cosmetics[6]+ " \n  "+cosmetics[7]+ " \n  "+cosmetics[8]+ " \n  "+cosmetics[9]+ "\n  "+cosmetics[10]+ " \n  "+cosmetics[11]+ " \n  "+cosmetics[12]+ " \n  "+cosmetics[13]+ " \n  "+cosmetics[14]);
	System.out.println("--------------------------------------");
	for (String alcohol : alcohols){
		System.out.println(alcohol);
	}
	//System.out.println(" The Alcohols Available in DMart : \n "+alcohols[0]+ "  \n "+alcohols[1]+ "  \n "+alcohols[2]+ " \n  "+alcohols[3]+ " \n  "+alcohols[4]+" \n  "+alcohols[5]+ " \n  "+alcohols[6]+ " \n  "+alcohols[7]+ " \n  "+alcohols[8]+ " \n  "+alcohols[9]+ "\n  "+alcohols[10]+ " \n  "+alcohols[11]+ " \n  "+alcohols[12]+ " \n  "+alcohols[13]+ " \n  "+alcohols[14]);
	System.out.println("--------------------------------------");
	for (String biscuit : biscuits){
		System.out.println(biscuit);
	}
	//System.out.println(" The Biscuits Available in DMart : \n "+biscuits[0]+ "  \n "+biscuits[1]+ "  \n "+biscuits[2]+ " \n  "+biscuits[3]+ " \n  "+biscuits[4]+" \n  "+biscuits[5]+ " \n  "+biscuits[6]+ " \n  "+biscuits[7]+ " \n  "+biscuits[8]+ " \n  "+biscuits[9]+ "\n  "+biscuits[10]+ " \n  "+biscuits[11]+ " \n  "+biscuits[12]+ " \n  "+biscuits[13]+ " \n  "+biscuits[14]);
    System.out.println("--------------------------------------");
	for (String cooldrink : coolDrinks){
		System.out.println(cooldrink);
	}
	//System.out.println(" The CoolDrinks Available in DMart : \n "+coolDrinks[0]+ "  \n "+coolDrinks[1]+ "  \n "+coolDrinks[2]+ " \n  "+coolDrinks[3]+ " \n  "+coolDrinks[4]+" \n  "+coolDrinks[5]+ " \n  "+coolDrinks[6]+ " \n  "+coolDrinks[7]+ " \n  "+coolDrinks[8]+ " \n  "+coolDrinks[9]+ "\n  "+coolDrinks[10]+ " \n  "+coolDrinks[11]+ " \n  "+coolDrinks[12]+ " \n  "+coolDrinks[13]+ " \n  "+coolDrinks[14]);
    System.out.println("--------------------------------------");
	for (String icecreame : iceCreame){
		System.out.println(icecreame);
	}
	//System.out.println(" The Ice Cream Available in DMart : \n "+iceCreame[0]+ "  \n "+iceCreame[1]+ "  \n "+iceCreame[2]+ " \n  "+iceCreame[3]+ " \n  "+iceCreame[4]+" \n  "+iceCreame[5]+ " \n  "+iceCreame[6]+ " \n  "+iceCreame[7]+ " \n  "+iceCreame[8]+ " \n  "+coolDrinks[9]+ "\n  "+iceCreame[10]+ " \n  "+iceCreame[11]+ " \n  "+iceCreame[12]+ " \n  "+iceCreame[13]+ " \n  "+iceCreame[14]);
    System.out.println("--------------------------------------");
	for (String foot : footware){
		System.out.println(foot);
	}
	//System.out.println(" The Footware Available in DMart : \n "+footware[0]+ "  \n "+footware[1]+ "  \n "+footware[2]+ " \n  "+footware[3]+ " \n  "+footware[4]+" \n  "+footware[5]+ " \n  "+footware[6]+ " \n  "+footware[7]+ " \n  "+footware[8]+ " \n  "+footware[9]+ "\n  "+footware[10]+ " \n  "+footware[11]+ " \n  "+footware[12]+ " \n  "+footware[13]+ " \n  "+footware[14]);
    System.out.println("--------------------------------------");
	for (String cloth : clothes){
		System.out.println(cloth);
	}
	//System.out.println(" The Clothes Available in DMart : \n "+clothes[0]+ "  \n "+clothes[1]+ "  \n "+clothes[2]+ " \n  "+clothes[3]+ " \n  "+clothes[4]+" \n  "+clothes[5]+ " \n  "+clothes[6]+ " \n  "+clothes[7]+ " \n  "+clothes[8]+ " \n  "+clothes[9]+ "\n  "+clothes[10]+ " \n  "+clothes[11]+ " \n  "+clothes[12]+ " \n  "+clothes[13]+ " \n  "+clothes[14]);
	System.out.println("--------------------------------------");
	for (String milk : milkProduct){
		System.out.println(milk);
	}
	//System.out.println(" The milkProduct Available in DMart : \n "+milkProduct[0]+ "  \n "+milkProduct[1]+ "  \n "+milkProduct[2]+ " \n  "+milkProduct[3]+ " \n  "+milkProduct[4]+" \n  "+milkProduct[5]+ " \n  "+milkProduct[6]+ " \n  "+milkProduct[7]+ " \n  "+milkProduct[8]+ " \n  "+milkProduct[9]);
	System.out.println("--------------------------------------");
	for (String home : homeAppliances){
		System.out.println(home);
	}
	//System.out.println(" The HomeAppliances Available in DMart : \n "+homeAppliances[0]+ "  \n "+homeAppliances[1]+ "  \n "+homeAppliances[2]+ " \n  "+homeAppliances[3]+ " \n  "+homeAppliances[4]+" \n  "+homeAppliances[5]+ " \n  "+homeAppliances[6]+ " \n  "+homeAppliances[7]+ " \n  "+homeAppliances[8]+ " \n  "+homeAppliances[9]+ "\n  "+homeAppliances[10]+ " \n  "+homeAppliances[11]);


	}
	}
