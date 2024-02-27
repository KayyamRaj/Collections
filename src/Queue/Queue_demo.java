package Queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class Queue_demo {
	public static void main(String[] args) {
		Queue q= new PriorityQueue();
		q.add(10);
		q.add(3);
		q.add(7);
		q.add(2);
		System.out.println(q);
	     q.poll();
		System.out.println(q);
		System.out.println(q.peek());
		PriorityBlockingQueue qp= new PriorityBlockingQueue();
		qp.add(11);
		qp.add(4);
		qp.add(3);
		
		
		qp.poll();
		System.out.println(qp);
		
		
		
		 

	}

}
