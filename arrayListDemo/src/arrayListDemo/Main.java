package arrayListDemo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		int [] sayilar1 = new int [] {1,2,3};
		
		sayilar1 = new int [4];
		
		System.out.println(sayilar1[0]);
		
		ArrayList sayilar =new ArrayList();
		sayilar.add(1);
		sayilar.add(10);
		sayilar.add("Ankara"); // obje alır

		sayilar.set(0,"istanbul");

		//System.out.println(sayilar.size());
		System.out.println(sayilar.get(0));
}
}