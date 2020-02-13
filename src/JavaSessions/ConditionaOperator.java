package JavaSessions;

public class ConditionaOperator {

	public static void main(String[] args) {
		/* int a = 10;
		 int b = 20;
		 if(a>b) {
			 System.out.println("a is grater thab b");
		 }
		 else {
			 System.out.println("b is greater than a");
		 }
	

int total = 200;
if(total<200) {
	total = total + 10;
	System.out.println(total);
}
if(total>=200) {
	total = total + 20;
	System.out.println(total);
}
	}


}*/

//ladder if else if
		
	/*String  browser = "Chrome";
	if(browser.equalsIgnoreCase("Chrome")) {
		System.out.println(" launch the browser chrome");
	}
	else if(browser.equals("IE")) {
		System.out.println("launch IE browser");
	}
	else if(browser.equals("Safari")) {
		System.out.println("launch safari browser");
	}
	else {
		System.out.println("browser not available");
	}
	}*/
		
	//nested if
	/*String  browser = "Chrome";
	if(browser.equalsIgnoreCase("Chrome")) {
		System.out.println(" launch the browser chrome");
	}
	else if(browser.equals("IE")) {
		System.out.println("launch IE browser");
	}
	else if(browser.equals("Safari")) {
		System.out.println("launch safari browser");
	}
	else {
		System.out.println("browser not available");
	}
	}
}*/
		//switch case
		String browsername = "Chrome";
		switch (browsername) {
		case "Chrome":
			System.out.println(" launch the browser Chrome");
			
			break;
		case "IE":
		System.out.println(" launch the browser Chrome");
		case "Safari":
		System.out.println("Launch safari");
		

		default:
			System.out.println("Launch the correct browser");
			break;
		}
	}
}
	
