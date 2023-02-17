package one;

import java.util.Arrays;

public class javaday6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] a = new int[3][4];
//		a= [
//		 [11,22,33,44,]
//		 [55,66,77,88]
//		 [77,88,99,66]
//		 	 ]
		// program1
		int [][] a1= {
				{1,2,3},
				{4,5,6,7},
				{8}
		};
		
		System.out.println(a1[0][2]);
		System.out.println(a1[1][3]);
		System.out.println(a1[2][0]);
		
		for (int i=0; i <a1.length; i++) {
			//System.out.println(i);
            //System.out.println(a1[i].length);
			int [] r=a1[i];
			for (int j =0; j < r.length;j++) {
				System.out.println(r[j]);
			}
			
		//program 2
			int [][] numbers = {
					{-1,-2,-3},
					{-11, -22, -33},
					{-44,-55,-66}
					};
		for(int k = 0; k < numbers.length; k++){
			//System.out.println(k);
			//System.out.println(numbers[k]);
			//System.out.println(Arrays.toString(numbers[i]));
		int rows [] = numbers[i];
		for (int l =0; l < rows.length; l++) {
			System.out.println(l);
		}
		
		//Program 3
		int numbersb []= {11,22,33};
		
		for (int m :numbersb) {
			System.out.println(m);
		}
		
		//multiple dimensions array
		int numbersc [][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		for (int[] n:numbersc) {
			//System.out.println(n);
			System.out.println(Arrays.toString(n));
		}
		
		//Program4
		int numbersd [][]= {
				
				{88,888,8888},
				{99,999,9999},
				{66,666,6666}
			};
		
		
		for(int[]row:numbersd) {
            //System.out.println(row);
            //System.out.println(Arrays.toString(row));
            
            for (int col:row){
            	System.out.println(col);
            	
            }
          
            
		}
		
		//Program
		//t1 =[a,b]
		// a = [a1,a2]
		// b = [b1,b2]
		// a1 = [a1a,a1b,a1c]
		// a2 = [a2a,a2b,a2c]
		// b1 = [b1a,b1b,b1c]
		// b2 = [b2a,b2b,b2c]
	//program 	
		int [][][] t1 = {
				{
					{11,22,33},
					{44,55,66}
				},
				{
					{77,88,99},
					{33,44,99}
				}
				
		};
		System.out.println(t1[0][0][1]);
		System.out.println(t1[1][1][1]);
		System.out.println(t1[1][0][1]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
