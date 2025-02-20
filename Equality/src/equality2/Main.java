package equality2;

public class Main {

	public static void main(String[] args) {
		
		Record rec = new Record("Josh", 18, "Bunga");
		Record cord = new Record("John", 18, "Bunga");
		
		System.out.println(rec.equals(cord));
		
		System.out.println(rec.getClass());
		
		System.out.println(rec.hashCode());
		
		System.out.println(cord.hashCode());
	}

}
