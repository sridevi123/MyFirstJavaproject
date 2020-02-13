package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList<Object> ar = new ArrayList<Object>();
		System.out.println(ar.size());
		ar.add(100);//0
		ar.add(200);//1
		System.out.println(ar.size());
		ar.add(300);//2
		ar.add(400);//3
		System.out.println(ar.size());
		System.out.println(ar.get(0));
		System.out.println(ar.get(3));
		//System.out.println(ar.get(4));// java.lang.IndexOutOfBoundsException:
		
		ar.add(12.33);//4
		ar.add('m');//5
		ar.add("Text");//6
		System.out.println(ar.get(4));//7
		ar.remove(4);
		System.out.println("Value is :"+ ar.get(4));
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		//for each
		for(Object a : ar) {
			System.out.println(a);
		}
		//Lambda for each
		ar.forEach((p)->System.out.println(p));
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(100);
		marks.forEach((j)->System.out.println(j));
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Naveen");
		names.add("Sourav");
		names.add("Kapil");
		
		for(Object r : names) {
			System.out.println(r);
		}
		//names.forEach((k)->System.out.println(k));
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

	}

}
