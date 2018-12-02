package collection;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		
		s.push("둘리");
		s.push("마이콜");
		s.push("고길동");
		
		while(s.isEmpty() == false) {
			String value = s.pop();
			System.out.println(value);
		}
		
		//s.pop(); //비어있는 경우, StackException 발생

		s.push("둘리");
		s.push("마이콜");
		s.push("고길동");
		
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());
		
	}

}
