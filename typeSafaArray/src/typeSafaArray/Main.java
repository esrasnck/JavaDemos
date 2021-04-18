package typeSafaArray;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> sehirler = new ArrayList<String>();
		sehirler.add("Ankara");
		sehirler.add("Istanbul");
		sehirler.add("İzmir");
		sehirler.remove("İzmir");
		sehirler.add("Aydin");
		
		Collections.sort(sehirler);
		for(String sehir:sehirler) {
			System.out.println(sehir);
		}
		
		
	}

}
