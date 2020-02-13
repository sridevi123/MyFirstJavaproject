package JavaSessions;

public class DataTypes {

	public static void main(String[] args) {
		//Data types : primitive data types : does not need objects for declaration 
		//it will directly store in the memory
		// Numeric data types Byte, Short, int, long ... inger family
		//1. Byte
		// size : 1 Byte = 8 bits
		// Range: -128 to 127
		Byte b = 10;
	     b = 20;
	     Byte b1 = 25;
	     Byte b2 = 75;
		System.out.println(b+ b1+ b2);
		
		//2.Short
		//Size : Short = 2Bytes = 16 Bits
		//Range : -32768 to 32767
		Short s = 20;
		System.out.println(s);
		//3. int
		//size : 4Bytes = 32 bits
		//Range: very big not needed
		int i = -10;
		int j = 350;
		int k = -420;
		System.out.println(i+j+k);
		//4. long
		//size : 8 Bytes = 64 bits
		// range : not needed
		long l = 1200000;
		long distance = 12345678;
		System.out.println(l +" "+distance );
		//floating family
		//5. float  4Bytes = 32bits
		float f1 = 12.33f;
		float f2 = (float)14.55;
		System.out.println(f1+f2);
		//6. double
		//size : 8Bytes = 64 bits
		double d1 = 12.33;
		double d2 = -19.55;
		System.out.println(d1+d2);
		//7. Character 2bytes = 16bits
		char c1 ='a';
		char c2 = '9';
		System.out.println(c1+c2);
		//8. Boolean ~1bit
		boolean h1 = true;
		boolean h2 = false;
		System.out.println(h1);
		System.out.println(h2);
		

		
		
		
		
	

	}

}
