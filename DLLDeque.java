/*****************************************************
 * class DLLQueue
 * uses singly-linked nodes to implement a QUEUE
 * (a collection with FIFO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 * 
 *  Linkages oriented against queue flow to facilitate 
 *  O(1) en/dequeue.
 * 
 *            N <- N <- ... <- N <- N
 *      _end -^                     ^- _front
 *
 ******************************************************/

//import java.util.NoSuchElementException;
//import java.lang.RuntimeException;

public class DLLQueue<T>// implements Deque<T> 
{
    private DLLNode<T> _front, _end;

    // default constructor creates an empty queue
    public DLLQueue()
	{ 
	    _front = _end = null;
	}

    // means of adding a thing to the collection
    public void enqueue( T enQVal ) 
    {
	//special case: when enqueuing to an empty list, 
	//make _front && _end point to same node
	if ( isEmpty() ) {
	    _front = _end = new DLLNode<T>( enQVal, null );
	}
	else {
	    // Q: Why is this a bad idea:
	    //    _end = new LLNode<T>( enQVal, null );
	    _end.setNext( new DLLNode<T>( enQVal, null ) );
	    _end = _end.getNext();
	}
    }//O(1)


    // means of removing a thing from the collection
    // remove and return thing at front of queue
    // assume _queue ! empty
    public T dequeue() 
    { 
	T foo = _front.getValue();
	_front = _front.getNext();
	//check for emptiness
	if ( _front == null )
	    _end = null;
	return foo;
    }//O(1)


    // means of peeking at thing next in line for removal
    public T peekFront() 
    {
	return _front.getValue();
    }//O(1)


    public boolean isEmpty() 
    {
	return _front == null; 
    }//O(1)


    // print each node, separated by spaces
    public String toString() 
    { 
	String foo = "";
	DLLNode<T> tmp = _front;
	while ( tmp != null ) {
	    foo += tmp.getValue() + " ";
	    tmp = tmp.getNext();
	}
	return foo;
    }//O(n)

    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
    public static void main( String[] args ) 
    {
	Queue<String> DLLDequelJ = new DLLDeque<String>();

	System.out.println("\nnow enqueuing thrice..."); 
	LLQueuelJ.enqueue("James");
	LLQueuelJ.enqueue("Todd");
	LLQueuelJ.enqueue("Smith");

	System.out.println("\nnow testing toString()..."); 
	System.out.println( DLLDequelJ ); //for testing toString()...

	System.out.println("\nnow dequeuing thrice..."); 
	System.out.println( DLLDequelJ.dequeue() );
	System.out.println( DLLDequelJ.dequeue() );
	System.out.println( DLLDequelJ.dequeue() );

	System.out.println("\nDequeuing from empty queue should yield error..."); 
	System.out.println( DLLDequelJ.dequeue() );
	
	  

    }//end main
    ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
    
}//end class DLLQueue
