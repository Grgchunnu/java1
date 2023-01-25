package one;

public class day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day =5;
		switch(day) {
		case 1:
		System.out.println("Sunday");
	    case 2:
		System.out.println("Monday");
	    case 3:
        System.out.println("Tuesday");
	    case 4:
        System.out.println("Wednesday");
	    case 5:
	    System.out.println("Thursday");
	    case 6:
	    System.out.println("Friday");
	    case 7:
	    System.out.println("Saturday");
	    default:
	    	System.out.println("please input correct day");
		
	}

//break case
		switch(day) {
		case 1:
		System.out.println("Sunday");
		break;
	    case 2:
		System.out.println("Monday");
		break;
	    case 3:
        System.out.println("Tuesday");
        break;
	    case 4:
        System.out.println("Wednesday");
        break;
	    case 5:
	    System.out.println("Thursday");
	    break;
	    case 6:
	    System.out.println("Friday");
	    break;
	    case 7:
	    System.out.println("Saturday");
	    break;
	    default:
	    	System.out.println("please input correct day");
			
		}

        String city ="centreville";
        switch (city) {
        case "centreville":
        	System.out.println("Virginia");
        	break;
        case "dallas":
        	System.out.println("Texas");
        	break;
        case "Allentown":
        	System.out.println("Newyork");
        	break;
       	default:
       		System.out.println("incorrect city name");
        
        }







}

}
