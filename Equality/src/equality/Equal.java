package equality;

public class Equal {

	public static void main(String[] args) {
		int x = 5;
		int y = 5;
		System.out.println(x==y);
		
		Com com = new Com("John",22);
		Com fom = new Com("John",22);
		
		System.out.println(com.equals(fom));
		
		
		
		
		
		

	}

}
