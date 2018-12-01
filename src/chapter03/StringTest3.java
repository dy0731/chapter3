package chapter03;

public class StringTest3 {

	public static void main(String[] args) {
		String s = "aBcABCabcAbC";
		
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("abc"));
		System.out.println(s.indexOf("abc", 3));
		System.out.println(s.substring( 3 ));
		System.out.println(s.substring( 3, 5 ));
		
		
		String s2 = "   ab cd    ";
		String s3 = "efg,hijk,lmno,pq";
		
		String s4 = s2.concat(s3);
		System.out.println(s4);
		System.out.println("---"+s2.trim()+"---");
		System.out.println("---"+s2.replaceAll(" ", "")+"---");
		
		String[] tokens = s3.split(":");
		for(String str : tokens) {
			System.out.println( str );
		}
		
		StringBuffer sb = new StringBuffer("");
		sb.append("Hello ");
		sb.append("World ");
		sb.append("Java ");
		
		//String str = 
		//	"Hello " + "World " + "Java " + 1000;
		String str = 
			new StringBuffer("Hello ").
			append("World ").
			append("Java ").
			append(1000).
			toString();
		
		// 주의: + 연산자로 문자열을 더할 때
		String str2 = "";
		StringBuffer sb2 = new StringBuffer("");
		for(int i = 0; i < 10000000; i++) {
			//str2 = str2 + i;
			sb2.append(i);
		}
		
		// format
		String name = "둘리";
		int score = 100;
		
		System.out.println(name + "님의 점수는 " + score + "입니다.");
		String str3 = String.format("%s님의 점수는 %d입니다.", name, score);
		System.out.println(str3);
	}

}
