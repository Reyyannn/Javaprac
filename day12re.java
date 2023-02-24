package prac;

public class day12re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 FlavorA strawberry = new FlavorA ("strawberry", "flower", 1);
		 FlavorA chocolate= new FlavorA ("chocolate", "wood", 2);
		 FlavorA rasberry= new FlavorA ("rasberry", "rose", 4);
		 
		 System.out.println(strawberry.taste);
		 System.out.println(chocolate.taste);
		 System.out.println(rasberry.taste);
		 
		 System.out.println(rasberry.smell);
		 System.out.println(strawberry.many);
		
		 strawberry.many= 3;
		 strawberry.displayFlavorA();           //this changes the quantity of whichever you put 
		 
		 String [] names= {"floweryy", "woody", "roseyy"};
		 FlavorA perfume[] = {strawberry, chocolate, rasberry};
		 
		 for(int i=0; i<perfume.length;i++) {
			 System.out.println(perfume[i].taste);        // strawberry, flower, 3
			 System.out.println(perfume[i].smell);        // chocolate, wood, 2
			 System.out.println(perfume[i].many);         // rasberry, rose, 4
		 }
		 for(FlavorA dd: perfume) {
			 System.out.println(dd.taste);
			 System.out.println(dd.smell);
			 System.out.println(dd.many);
		 }
		 //-------------------------------------------------------------------------->
		 
		 cars mercedes= new cars ("mercedes", "black", 1999);
		 cars bmw= new cars ("bmw", "pink", 1010);
		 cars mazda= new cars ("mazda", "light blue", 3389);
		 
		System.out.println(mercedes.types);       
		System.out.println(mercedes.names);
		System.out.println(bmw.names);
		System.out.println(bmw.types);
		System.out.println(mazda.names); 
		System.out.println(mazda.types);
		
		String [] names1= {"black", "pink", "lightblue"};
		cars gadi []= {mercedes, bmw, mazda};
		
		for(int i=0; i<gadi.length;i++) {
			System.out.println(gadi[i].names);
			System.out.println(gadi[i].types);
			System.out.println(gadi[i].number);         // result would be coming in everything 
		}
		//for each loop
		for(cars k: gadi) {
			System.out.println(k.types);
			System.out.println(k.names);
			System.out.println(k.number);
		}
		
		
		
		
		
		
		
	}

}
           
         class cars {
        	 String types; 
        	 String names;
        	 int number;
       
        	 public cars (String nam, String typ, int num) {
        		 this.names = nam;
        		 this.types = typ;
        		 this.number = num;
        	 }
        	 public void displaycars () {
        		 System.out.println(this.names+this.types);
        	 }
        	 
         }

          

          class FlavorA {
        	  String taste;
        	  String smell;
        	  int many;
        	 public FlavorA (String tas, String sme, int man) {
        		 this.taste= tas;
        		 this.smell= sme;
        		 this.many= man;
        		     		 
        	 }
        	 public void displayFlavorA () {
        		 System.out.println(this.taste+this.smell);
        	 }
          }

          
          
          
          
          
          // constructer are with return but doesn't have any parameter like class human ();
          // can set up default value like this.country "nepal" and transaction value with array [2]
          // 
