# Team De-BilliardStick (Ibnul Jahan, Haiyao Liu)

## Interface Method Selections
#### ```addFirst( T val );```  //adds a value to the front of the deque
 * The importance of this method is it gives the user an easy way to set a new beginning to the deque
#### ```addLast( T val );```  //adds a value to the back of the deque
  * The importance of this method is it gives the user an easy way to set a new ending to the deque
#### ```removeFirst();```  //removes a value from the front of the deque
  * The importance of this method is it gives the user an easy way to change the front value of the deque by removing it
#### ```removeLast();```   //removes a value from the end of the deque
 * The importance of this method is it gives the user an easy way to change the back value of the deque by removing it
#### ```peekFirst();```   //returns the value of the first node of the deque  
 * The importance of this method is it allows the user to see what they will be removing or adding on top of
#### ```peekLast();```   //returns the value of the last node of the deque  
 * The importance of this method is it allows the user to see what they will be removing or adding behind
#### ```size();```   //returns the size of the deque
 * The importance of this is it allows the user to track how much data they have
#### ```isEmpty();```   //checks if the deque is empty
 * The importance of this is it allows for edge cases in other methods to work
 
 In general, all these methods are common to deques, because they add the functionability that separate it from other data structures. Likewise, they must come in pairs so they can affect the front and the back of the deque. Being able to add, remove, and view data are necessary for nearly all data structures. Keeping track of size is not necessary, but it is very easy to maintain, as is isEmpty().

## Why a doubly linked node?
Since the word deque is short for double ended queue, the main point of it is to allow easy adding, removing, and viewing from both the first and last items. Using a doubly linked node allows for no worser case between doing any on these methods on the front or on the back. It turns all the methods into constant runtimes through its system of linkages, and through its usage of previous nodes. This builds off the flaws of both the ArrayList and the LLNode. The ArrayList allows the user to add and remove from the end with ease, but doing so from the front results in a linear runtime. The LLNode allows for easy removal from the front, and easy addition to the back, but makes removing from the back more difficult. The DLLNode allows all of the methods to run with ease.
TLDR: Constant Runtimes

## Post Critical Feedback Changes  [NEW!!]
First off thank you to Team Pirates- for giving us a Driver file to use, and for the constructive critiques.

Our main problems were comments that were less than descriptive, and a Deque that would not allow you to peek when empty. We fixed the former of these by adding comments (shocking, I know) and the latter by making a change in our constructor. The mistake we had previously made was we had initially set both the first and last nodes of our DLLNode Deque as null. This posed problems as a null object is not able to perform the methods we had written for a DLLNode. This was fixed by setting both the first and last nodes to new DLLNodes that pointed to null in both directions, and had a cargo value of 0.
A style problem we had was an inclusion of files in our repo with the tildas (~). This was as a result of a bad .gitignore on our behalf. Luckily for us, a member of Team Pirate fixed this issue on their fork, and we pulled in the solution. 


### Changes part 2
No one else has given us a DequeTester as of yet, so there is not much to put here. But you can bet that when we do get a Driver this area will be updated as soon as possible.
