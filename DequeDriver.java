/*
Bayan Berri
APCS2 pd4
HW29--Stress is the Best
2017-04-05
 */
public class DequeDriver{
    public static void main( String[] args){
	DLLDeque<String> tester= new DLLDeque<String>();
	
	tester.addFirst("a");
	System.out.println("updated deque:");
	System.out.println(tester);

	tester.addFirst("b");
	System.out.println("updated deque:");
	System.out.println(tester);

	tester.addFirst("c");
	System.out.println("updated deque:");
	System.out.println(tester);
	
	tester.addLast("l1");
	System.out.println("updated deque:");
	System.out.println(tester);

	tester.addLast("l2");
	System.out.println("updated deque:");
	System.out.println(tester);

	tester.addLast("l3");
	System.out.println("updated deque:");
	System.out.println(tester);

	System.out.println("testing toString() now:");
	System.out.println(tester);

	System.out.println("testing removeLast() now:");
	System.out.println(tester.removeLast());

	System.out.println("testing toString() now:");
	System.out.println(tester);

	System.out.println("testing removeFirst() now:");
	System.out.println(tester.removeFirst());
	System.out.println("updated deque:");
	System.out.println(tester);
	
	System.out.println("testing peekFirst() now:");
	System.out.println(tester.peekFirst());
	System.out.println("peek doesn't update the deque::");
	System.out.println(tester);
	
	System.out.println("testing peekLast() now:");
	System.out.println(tester.peekLast());
	/*-----------------------------------------
	----------------------------------*/
    }
}
