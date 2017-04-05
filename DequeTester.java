//Donia Tung
//APCS2 pd1
//Hw29 - Stress is the Best
//2017-04-04


public class DequeTester{

    public static void main (String[]args){
	DLLDeque test1 = new DLLDeque();
	//Testing isEmpty(), size(), contains() of empty deque
	System.out.println(test1.isEmpty()); //true
	System.out.println(test1.size());//0
	//System.out.println(test1.contains(0)); //NullPointerException
	//Test peekFirst() and peekLast() for an empty list
	System.out.println(test1.peekFirst());//null
	System.out.println(test1.peekLast()); //null
	//Testing the add functions
	test1.addFirst(1);
	test1.addFirst(2);
	test1.addLast(60);
	//Test isEmpty(), size(), contains() for a not empty list
	System.out.println(test1.isEmpty()); //false
	System.out.println(test1.size()); //3
	//System.out.println(test1.contains(1)); // true;
	//System.out.println(test1.contains(5)); //false;
	//System.out.println(test1.contains("hi hello")); //ClassCastException
	//Test peekFirst() and peekLast() for a not empty list
	System.out.println(test1.peekFirst());//2
	System.out.println(test1.peekLast()); //60
	test1.removeFirst();
	System.out.println(test1.isEmpty()); //false
	System.out.println(test1.size()); //2

    }




}
