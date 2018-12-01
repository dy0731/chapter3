package chapter03;

public class ObjectTest {

	public static void main(String[] args) {
		Point p = new Point(10, 20);
		
		System.out.println(p.getClass()); // reflection
		System.out.println(p.hashCode()); // reference value x
		                                  // address x
		                                  // address 기반의 해싱값(int)
		System.out.println(p);
		System.out.println(p.toString());
		// getClass() + "@" + hashCode();
		
		
	}

}
