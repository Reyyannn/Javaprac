package prac;

public class day12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		perfumes rosey= new perfumes ("rosey", "lotus", "flowey");
		perfumes muah= new perfumes ("muah", "kis", "love");
		perfumes sakira= new perfumes ("shakira", "roundy", "joy");
		
		System.out.println(rosey.names);
		System.out.println(muah.smell);
		System.out.println(sakira.types);
		
		System.out.println(rosey.smell);
		System.out.println(rosey.types);
		System.out.println(muah.types);
		System.out.println(muah.names);
		System.out.println(sakira.names);
		System.out.println(sakira.smell);
		
		sakira.types= "oouu lala";
		sakira.Displaynames();                  // doing a change
		
		System.out.println(sakira.types);
		
		String perfumes []= {"rosey", "muah", "loveyy", "woah"};         //have to write this in order for everything to come
		perfumes scents []= {muah, rosey, sakira};
		
		for(int i=0; i<scents.length;i++) {
			System.out.println(scents[i].names);
			System.out.println(scents[i].types);
			System.out.println(scents[i].smell);          //everything comes in total 
		}
		for(perfumes abc: scents) {                      //for each loop 
			System.out.println(abc.names);
			System.out.println(abc.types);
			System.out.println(abc.smell);
		}
		
		
	}

}
           class perfumes {
        	   String names;
        	   String types;
        	   String smell;
        	   
        public perfumes (String nam, String typ, String sme) {
        	this.names= nam;
        	this.types= typ;
        	this.smell= sme;
        	
        	
        }
        public void Displaynames() {
        	System.out.println(this.names+this.smell);
        }
           }
           
