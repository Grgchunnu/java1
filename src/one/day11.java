package one;

public class day11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String fullname = "parisha";
        // create object of type string
        String a = fullname.toUpperCase();
        System.out.println(a);
        
        
        Human parisha = new Human("parisha",8);
        
 	System.out.println(parisha.age);
 	System.out.println(parisha.fullname);
 	parisha.walk();
 	parisha.talk();
	}

}

class Human{
	
// Properties or field
	String fullname;
	int age;
	//constructor to set property value
	public Human(String fullname,int age) {
		this .fullname=fullname;
		this.age=age;
		
	}
	
	//methods
	// Talk() and walk()
	public void talk() {
		System.out.println("I am talking");
	}
	public void walk() {
		System.out.println("I am walking ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}