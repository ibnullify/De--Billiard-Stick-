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

public class DLLDeque<T> implements Deque<T> 
{
    private DLLNode<T> _first, _last; //Constructor(value,previous,next)
    private int _size;
    // default constructor creates an empty queue
    public DLLDeque()
	{ 
	    _first = _last = new DLLNode<T>(null,null,null);
	    _size = 0;
	}

    /*****NEW INTERFACE METHODS*****/
    //adds a value to the beginning of the deque
    //if the deque was previously empty, sets both first and last to this new node
    //if not then it sets first to the new node
    public void addFirst (T val) {
	if (isEmpty()) {
	    _first = new DLLNode(val, null, null);
	    _last = _first;
	    _size++;
	    return;
	} else {
	    _first.setPrev(new DLLNode<T>(val, null, _first));
	    _first = _first.getPrev();
	    _size++;
	    return;
	}
    }

    //adds a value to the ending of the deque
    //if the deque was previously empty, sets both first and last to this new node
    //if not then it sets last to the new node
    public void addLast(T val) {
	if (isEmpty()) {
	    _last = new DLLNode(val, null, null);
	    _first = _last;
	    _size++;
	    return;
	} else {
	    _last.setNext(new DLLNode<T>(val, _last, null));
	    _last = _last.getNext();
	    _size++;
	    return;
	}
    }

    //removes a value from the beginning of the deque
    //if the deque is empty, it throws an exception
    //if not then it sets first to the following node
    public T removeFirst() {
        if (isEmpty()){
	    //throw exception when someone tries to remove from an empty queue
	    throw new IndexOutOfBoundsException("There is nothing to remove.");
	}
	T rtn = _first.getCargo();
	_first = _first.getNext();
	_first.setPrev(null); 
	_size--;
	return rtn;
    }
    
    //removes a value from the ending of the deque
    //if the deque is empty, it throws an exception
    //if not then it sets last to the previous node
    public T removeLast() {
        if (isEmpty()) {
	    //throw exception when someone tries to remove from an empty queue
	    throw new IndexOutOfBoundsException("There is nothing to remove.");
	}
	T rtn = _last.getCargo();
	_last = _last.getPrev();
	_last.setNext(null); 
	_size--;
	return rtn;
    }

    //returns the first value of the deque
    public T peekFirst() {
	return _first.getCargo();
    }

    //returns the last value of the deque
    public T peekLast() {
	return _last.getCargo();
    }

    //returns the size of the deque using a variable that is incremented when necessary throughout the class
    public int size() {
	return _size;
    }

    
    /*****NEW INTERFACE METHODS*****/
    

    /*********PREVIOUS METHODS***********^
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
    
    ^***************PREVIOUS METHODS************/


    /***********PREVIOUS METHODS TO BE USED******/

    //returns whether or not the size is 0
    public boolean isEmpty() 
    {
	return _size == 0; 
    }//O(1)


    // print each node, separated by spaces
    public String toString() 
    { 
	String foo = "";
	DLLNode<T> tmp = _first;
	while ( tmp != null ) {
	    foo += tmp.getCargo() + " ";
	    tmp = tmp.getNext();
	}
	return foo;
    }//O(n)
    /***********PREVIOUS METHODS TO BE USED******/

    
    public static void main( String[] args ) 
    {


	
	DLLDeque<String> DLLDequelJ = new DLLDeque<String>();
	
	System.out.println("\nsize");
	System.out.println(DLLDequelJ.size());

	System.out.println("\nnow enqueuing thrice..."); 
	DLLDequelJ.addFirst("James");
	DLLDequelJ.addFirst("Todd");
	DLLDequelJ.addFirst("Smith");
	System.out.println( DLLDequelJ ); //for testing toString()...
	System.out.println("\npeeking first");
	System.out.println(DLLDequelJ.peekFirst()); 
	System.out.println("\npeeking last"); 	
	System.out.println(DLLDequelJ.peekLast()); 

	System.out.println("\nnow enqueuing thrice..."); 
	DLLDequelJ.addLast("James");
	DLLDequelJ.addLast("Todd");
	DLLDequelJ.addLast("Smith");
	System.out.println( DLLDequelJ ); //for testing toString()...
	System.out.println("\npeeking first");
	System.out.println(DLLDequelJ.peekFirst()); 
	System.out.println("\npeeking last"); 	
	System.out.println(DLLDequelJ.peekLast()); 
	
	System.out.println("\nsize");
	System.out.println(DLLDequelJ.size());

	System.out.println("\nnow testing toString()..."); 
	System.out.println( DLLDequelJ ); //for testing toString()...


	System.out.println("\nnow dequeuing thrice..."); 
	System.out.println( DLLDequelJ.removeFirst() );
	System.out.println( DLLDequelJ.removeFirst() );
	System.out.println( DLLDequelJ.removeFirst() );
	
	System.out.println("\nnow testing toString()..."); 
	System.out.println( DLLDequelJ ); //for testing toString()...

	System.out.println("\nnow dequeuing thrice..."); 
	System.out.println( DLLDequelJ.removeLast() );
	System.out.println( DLLDequelJ.removeLast() );
	System.out.println( DLLDequelJ.removeLast() );
	
	System.out.println("\nsize");
	System.out.println(DLLDequelJ.size());

	System.out.println("\nDequeuing from empty queue should yield error..."); 
	System.out.println( DLLDequelJ.removeFirst() );
	/*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
	 ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

    }//end main
   
    
}//end class DLLQueue
