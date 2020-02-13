package JavaSessions;

public class StringConcat {

	public static void main(String[] args) {
		//String 
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		
	String X = "Test";
	String Y = "Automation";
	System.out.println(X+Y);
	System.out.println(a+b+X+Y);
	System.out.println(X+Y+a+b);
	System.out.println(X+Y+(a+b));
	char c1 = 'a';//ASCII value of a = 97 and b = 98
	char c2 = 'b';
	System.out.println(c1+c2);
	//Ascii valu range 
	// a to z 97 to 122
	//A to Z 65 to 90
	//0 to 9 48 to 57
	
	String title = "Google";
	System.out.println("Tiltle of the page is ===>"+ title);
	System.out.print("Naveen");
	System.out.println("selenium");
	System.out.println("Farian");
	System.out.print("selenium"+ "\n");// \n = new line
	System.out.println("QTP"+"\t"+"cypress");// \t is tab space
	System.err.println("some error is there in the system");
	}

	
}
