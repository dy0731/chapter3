package chapter03;

public class StringTest {

	public static void main(String[] args) {
		// c:\temp
		String s = "c:\\temp";
		// "Hello"
		String s1 = "\"Hello\""; 
		
		System.out.println(s);
		System.out.println(s1);
		
		// \t -> tab
		// \n -> new line
		// \r => carrige return
		System.out.print("Hello\tWorld\r\n");
		System.out.print("Hello\tWorld\n");
		
		
		char c = '\'';
		System.out.println(c);
	}

}
