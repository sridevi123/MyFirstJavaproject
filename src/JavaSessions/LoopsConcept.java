package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		/*//1.While loop 
		// Generate numbers 1 to 10
		int i = 1;//initialization
		while(i<=10) {//conditional
			System.out.println(i);
		i++;//incremental
		}
		System.out.println("------");

		//Generate numbers reverse order 10 to 1
	int p = 10;//initialization
	while(p>=0) {//conditional
		System.out.println(p);
		p--;//decremantal
	}
	System.out.println("------");
// for loop:
	// Generate the numbers 1 to 10
	for(int j=0; j<=10; j++) {
		System.out.println(j);
	}
	System.out.println("------");*/
	// Generate odd numbers 1,3,5,7,9
	//method 1:
	/*for(int odd=1;odd<=10;odd = odd+2) {
		System.out.println(odd);
	}
	System.out.println("------");*/
	//method 2:
	for(int odd=1;odd<=10;odd++) {
		System.out.println(odd);
		odd++;
	}
	System.out.println("------");
	//Generate even numbers 2,4,6,8,10
	for(int even=2;even<=10;even = even+2) {//initializing,condition,increment.
		System.out.println(even);
	}
		
}
}

