package one;

public class day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//continue
		for (int a=0; a<=5; a++) {
			if (a==2)	{
				continue;
			}
			System.out.println(a);
		}
	
	
	//Break
	for (int i=5; i>=1; i--) {
		System.out.println(i);//5//4//3
		if (i==3) {
			break;
		}
	
	}
	
	
	//continue
	for (int a=0; a<=5; a++) {
		if (a==2||a==4)	{
			continue;
		}
		System.out.println(a);
	}
	
	
	//While loop//
	
	
	
	//initilization=>outside
	//while (condition){
	//statement
	//increment and decrement}
	
	int x=1; 
	while(x<=5) {
		System.out.println("hello");
		x++;
	}
	
	
	 int x1=2;
	 while(x1<=5) {
		 System.out.println(x1);
		 x1++;
	 }
	
	
	//print 5 to 1
	 int c=5;
	 while(c>=1) {
		 System.out.println(c);
		 c--;
	 }
	
	// table of 2
	 int c1=2;
	 while(c1<=20) {
		 System.out.println(c1);
		 c1=c1+2;
	 }
	 
	 //Break with while loop
	 int i=5;
	 while(i>=1) {
		 if (i==2) {
			 break;
		 }
		 System.out.println(i);
		 i--;
	 }
	 
	 int t=7;
	 while (t>=2) {
		 System.out.println(t);
		 if (t==4)
		 {break;
		 }
		 t--;
	 }
	 
	 //continue with while
	 
	 int z=1;
	 while(z<=5) {
		 if (z==2){
			 continue;
		 }
	 System.out.println(z);
	 z++;
	 }
	 
	
			 
			 
			 
		 
			 
			 
			 
			 
			}
	

}
