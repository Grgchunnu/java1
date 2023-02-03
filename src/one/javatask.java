package one;

public class javatask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
///vehicle type and object
		String color="Red";
		 Vehicle Red = new Vehicle("Red",3457);
				
		System.out.println("Vehicle.color");
		System.out.println("Vehicle.regNo");
		Red.start();
		Red.stop();
		
	
		
	}
	    }
		
	//vehicles type and objects of it

		class Vehicle{
			//properties
			String color;
			int regNo;
			public Vehicle(String color,int regNo) {
				this.color=color;
				this.regNo=regNo;
			}
			
			
			//method
			//start() and stop()
			public void start() {
				System.out.println("ready to go");}
			  public void stop() {
					System.out.println("ready to stop");
				}

		
		
		
	}


