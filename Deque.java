public interface Deque<T>{

    //adds a value to the front of the deque
    public void addFirst ( T val );
    
    //adds a value to the end of the deque
    public void addLast ( T val );

    //removes a value from the front of the deque
    public T removeFirst ();

    //removes a value from the end of the deque
    public T removeLast ();

    //returns the value of the first node of the deque
    public T peekFirst();

    //returns the value of the last node of the deque
    public T peekLast();

    //returns the size of the deque
    public int size();

    /******************Not from API*******************/
    /**inherited from interface java.util.Collection**/

    //checks if the deque is empty
    public boolean isEmpty();

    
}
