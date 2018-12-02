package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		
		q.offer("둘리");
		q.offer("마이콜");
		q.offer("고길동");
		
		while(q.isEmpty() == false) {
			String value = q.poll();
			System.out.println(value);
		}
		
		// 비어있는 경우 null를 리턴한다.
		System.out.println("-->" + q.poll());
		
		q.offer("둘리");
		q.offer("마이콜");
		q.offer("고길동");

		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.poll());
		
	}

}
