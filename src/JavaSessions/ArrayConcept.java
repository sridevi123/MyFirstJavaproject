package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {
		//int  Arrays
		// two major limitations
		//1. static arrays size is fixed. to overcome this, we use ArrayList(Dynamic array) or collection.
		//2.it can only store similar types of values to over come this we use arraylist or object static arrays
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
System.out.println(i[2]);
System.out.println(i.length);
for(int k=0;k<i.length;k++) {
	System.out.println(k);
}
//2. double array
double d[] = new double[2];
d[0] = 12.44;
d[1] = 100;
System.out.println(d[0]+d[1]);
// 3. char array
//char c[] = new char[3];
//4. string array
String s[] = new String[3];
s[0] = "Arun";
s[1] = "kapil";
s[2] = "Bhagya";
for(int j=0;j<s.length;j++) {
	System.out.println(s[j]);
}
//5. Boolean array
//boolean b[] = new boolean[2];
//6. object array
Object ob[] = new Object[5];
ob[0] = "Tom";
ob[1] = 25;
ob[2] = 12.33;
ob[3] = 'm';
ob[4] = true;
for(int l=0;l<ob.length;l++) {
System.out.println(ob[l]);

	}
// for each

}
	}

