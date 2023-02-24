package prac;

public class day13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//just a constructor 
		// Human b= new Humen ();
		// int csa= a.Add();
		//sysout(csa);
		
		
		//constructor with parameter  
		
		Bank nabin= new Bank(2000, 134567, "aastha", "savings");
		Bank trishara= new Bank(1000, 2345599, "yuba", "current");
		
		System.out.println(nabin.bal);
		System.out.println(nabin.accNo);
		System.out.println(nabin.accName);
		System.out.println(nabin.type);
		System.out.println(nabin.country);
		System.out.println(nabin.transactions);        //???
		
		
		System.out.println(trishara.bal);
		System.out.println(trishara.accNo);
		System.out.println(trishara.accName);
		System.out.println(trishara.country);
		System.out.println(trishara.type);
		
		int updatedBal = nabin.Savings(500);       // this is adding to the savings acoount 
		System.out.println(updatedBal);
		
		int updatedbal1= trishara.current(100);       // supposed to subtract from the current balance or trishara 
		System.out.println(updatedbal1);
		
		int updatedbal2= nabin.Savings(100);
		System.out.println(updatedbal2);
		
		int updatedbal3= trishara.current(200);
		System.out.println(updatedbal3);
		
		int updatedbal4= nabin.Savings(10);
		System.out.println(updatedbal4);
		
		System.out.println(updatedBal);
		System.out.println(updatedbal1);
		System.out.println(updatedbal2);
		System.out.println(updatedbal3);
		System.out.println(updatedbal4);         //most of the trasaction
		
		
		
		student lily= new student("lily", "0989", 15);
		student anisha= new student("anisha", "9998", 20);
		
		System.out.println(lily.names);
		System.out.println(lily.age);
		System.out.println(lily.studentid);
		
		System.out.println(anisha.age);
		System.out.println(anisha.names);
		System.out.println(anisha.studentid);
		
		String [] class1= {"lily", "anisha"};
		student behavior [] = {anisha, lily};
		
		for(int i=0; i<behavior.length;i++) {
			System.out.println(behavior[i].age);
			System.out.println(behavior[i].names);
			System.out.println(behavior[i].studentid);
		}
		for(student s: behavior) {
			System.out.println(s.names);
			System.out.println(s.studentid);
			System.out.println(s.age);
		}
		
		human marium = new human("marium", "brown", "mexican", 52, 120);
		human apil= new human("apil", "brown", "nepali", 57, 160);
		human adam= new human("adam", "white", "white", 58, 150);
		human abdou= new human("abdou", "black", "african", 59, 165);
		
		System.out.println(marium.color);
		System.out.println(apil.height);
		System.out.println(adam.ethnicity);
		System.out.println(abdou.weight);
			
		String [] human = {"marium", "apil", "adam", "abdou"};
		human one [] = {abdou, adam, apil, marium};
		
		for(int i=0; i<one.length;i++) {
			System.out.println(one[i].color);
			System.out.println(one[i].ethnicity);
			System.out.println(one[i].names);
			System.out.println(one[i].height);
			System.out.println(one[i].weight);
		}
		for(human two : one) {
			System.out.println(two.color);
			System.out.println(two.names);
			System.out.println(two.ethnicity);
			System.out.println(two.height);
			System.out.println(two.weight);
		}
		
		
		
	
		
		
		
		
	}

}

         class Bank {
        	 
        	 int bal;
        	 int accNo;
        	 String accName; 
        	 String type;
        	 String country;
        	 int transactions [];
        	 
        	 
        	 public Bank(int bal, int accNo, String accName, String type) {
        		 this.bal= bal;
        		 this.accNo= accNo;
        		this.accName= accName;
        		this.type= type;
        		this.country= "Nepal";
        		this.transactions= new int [5];
        		
        		
        		}
        	 public int Savings (int amount) {
        		 this.bal= this.bal+amount;
        		 System.out.println("interest rate shound be 5%");
        		 return this.bal;
        	 }
        	 
        	 public int current (int amount) {
        		 if(this.bal > amount) {
        			 this.bal = this.bal - amount;
        			 return this.bal;
        			 
        		 }
        		 else {
        			 System.out.println("interest rate should be 10%");
        			 return this.bal;
        		 }
        	 }
        	 
        	 
         }
         
         class student {
        	 String names;
        	 String studentid;
        	 int age;
        	 
        	public student(String nam, String id, int ag) {
        		this.names= nam;
        		this.studentid= id;
        		this.age= ag;
        	}
        	
        	
        		 
        	 
         }
         
         class human{
        	 String names;
        	 String color;
        	 String ethnicity;
        	 int height;
        	 int weight; 
        	 
        	 public human(String nam, String col, String ethi, int hei, int wei) {
        		 this.names= nam;
        		 this.color= col;
        		 this.ethnicity= ethi;
        		 this.height= hei;
        		 this.weight= wei;
        	 }
       
        	 public void displayhuman () {
        		 System.out.println(this.names+this.ethnicity+this.color+this.height+this.weight);
        	 }
        	 
        	
         }
         
         
      