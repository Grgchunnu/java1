package one;

public class JAVASTRING1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating a string
		//program 1
		String subject = "I am learning selenium";
		String subject2 = "I am learning python";
		String subject3 = "I am learning java";
		System.out.println(subject);
	    System.out.println(subject2);
	    System.out.println(subject3);
	       
	    
	    
	    //string + integer ===> string
	    //Integer + Integer ===> Integer
	    //Integer + string ===> String
	    //String + string ===> string
	    
	    
	    //Program 2
	    System.out.println("hello"+2);
	    System.out.println(3+2);
        System.out.println(3+"3");
        System.out.println("3"+"3");
        
        
        //program3
        //length() of string
        String greet = "I am learning java";
        int a1 = greet.length();
        System.out.println(a1);
        System.out.println(greet.length());
        
        int x1= 90;
        System.out.println(x1);
        System.out.println("x1");
	
		//program4
        String first = "python";
        String second = "Learning";
        System.out.println(first+second);
        
        //Program5
        String three = "I am learning ";
        String four = "java !";
        String five = three.concat(four);
        System.out.println(five);
        
        
        //Program6
        String city = new String ("pune");
      System.out.println(city);
      
      
      //Program7
      String city1 = "centreville";
      String cityU = city1.toUpperCase();
      System.out.println(cityU);
      
      
      String city2 = "Chantilly";
      String cityL = city2.toLowerCase();
      System.out.println(cityL);
      
      String city3 = "manasas";
      System.out.println(city3.length());
      
      String country = "Nepal";
      int q2 = country.toUpperCase().toLowerCase().length();
      System.out.println(q2);
      

    		 
        
        
        
        
        
        
        
        
        
        
        
        
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
