package equality2;

import java.util.HashSet;

public class Hashzz {

	public static void main(String[] args) {
		
		HashSet <Record> cars = new HashSet <Record>();
		
		cars.add(new Record("Josiah", 21, "Muyenga"));
		cars.add(new Record("Kim", 24, "Muyenga"));
		cars.add(new Record("Josiah", 20, "Munyonyo"));
		
		System.out.println(cars.size());
		
		
		
		

	}

}
