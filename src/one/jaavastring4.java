package one;

public class jaavastring4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 0 1 2 3 4
		// a p p l e
		 String fruit = "apple";
		 int a=fruit.indexOf('p',2);
		 System.out.println(a);
		 
		 
		 int count =0;
		
		 for (int i = 0; i< fruit.length(); i++) {
			 if (fruit.charAt(i)=='p') {
				 System.out.println(i);
		count = count + 1;
			 }
		 }System.out.println(count);
		
		 
		// array
		 
		 int nums[] = new int [5];
		 nums[0]=99;
		 nums[1]=100;
		 nums[2]= 101;
		 nums[3]=102;
		 nums[4]=103;
		 // 0   1   2   3   4
		 // 99 100 101 102 103
		 
		 System.out.println(nums.length);
		 for (int i =0; i < nums.length;i++){
		 System.out.println(nums[i]);}
		 
		 
		
		 String cities[] = new String[3];
		 cities[0]="pune";
		 cities[1]= "banglore";
	     cities[2]="nagpur";
	     
	     
	    	for (int i=0; i<cities.length; i++) {
	    		//System.out.println(i);
	    		System.out.println(cities[i]);
	    	}	 
		 
		 // program 5
	    // 	              0   1  2  3  4  5  6
		int numbers [] = {11,22,33,44,55,66,77};
		System.out.println(numbers[1]);
		 
		 for (int i =0; i <numbers.length; i++) {
			 //System.out.println(i);
			 System.out.println(numbers[i]);
		 }
		 
		 //Program6
		 String fruits [] = {"apple","banana","grape","mango"};
		 for (int i =0; i < fruits.length; i++) {
			 //System.out.println(i);
			 System.out.println(fruits[i]);
		 }
		 char aa[] = {'a','p','p','l','e'};
			for (int i = 0; i< aa.length ; i ++) {
				//System.out.println(i);
				System.out.println(aa[i]);
			}	 
		 
		 // Program 7
		 String firstname = "chunnu";
		 char [] ch=firstname.toCharArray();
		 
		 for (int i = 0; i < ch.length; i++) {
		// System.out.println(i);
		 System.out.println(ch[i]);
 }
		
		//Program 8
		String e ="I am learning java";
		String e1[] = e.split(" ");
		//String e2[] = e.split("a");
		for(int i = 0; i < e1.length; i++) {
			System.out.println(e1[i]);
		} 
		
		
		
		
	}

}
