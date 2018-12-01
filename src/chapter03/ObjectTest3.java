package chapter03;

public class ObjectTest3 {
	public static void main(String[] args) {
		Rect r1 = new Rect(10, 20);
		System.out.println(r1);
		
		Rect r2 = new Rect(10, 20);
		System.out.println(r2.equals(r1));
		
		Rect r3 = new Rect(40, 5);
		System.out.println(r3.equals(r2));
		
;	}
}
