The list of data structures in java listed below

1.  Arrays
2.  Arraylist
3.  LinkedList
4.  Stack
5.  Queue
6.  HashMap
7.  HashSet
8.  TreeSet
9.  TreeMap
10. Graph
11. Tree

    1. Arrays is a basic and often used data structure in the context of java data structure

      a. Advantages

        - Data Organization Arrays Provides a structured way to store and organize elements improving data management
        - Random Access Elemnt can be accessed directly using their index , allowing for efficient retrieval and modification
        - fixed size arrays have a predetermined size enabling efficient memory location
        - memory efficient arrays optimize memory usage by sorting elements in continugous regious
        - compability arrays are widely supported in java , making them compability with various framework and tools
      
      b. Disadvantages:
        - fixed size arrays cannot be dynamically rezised , requiring recreation for size changes
        - memory wastage unused element in larger arrays can lead to memory wastage
        - Insertion and Deletion Overhead Inserting or Deleting elements in the middle of an array requires shifting subsequent element resulting in inefficiency
        - Lack of flexibility Arrays have rigid data types and cannot accomodate different data kinds without additional arrays or data structure
      
      c. Function
        - Creating Array Declare and initialises an array with specific size using the array type and the new keyword
        - Accesing Elements use the index to access individual elements in the array
        - modifying element Update the value of an element by assigning a new value to specifix index of an array
        - finding length use the length attribute to determine the arrays length
        - iterating through array use loop to go through each element in the array execure

    2.  ArrayList in java dynamix data structure that allows for the storage and manipulation element

      a. Advantages

        - Dynamic Size Unlike Array , ArrayList can dynamically grow or shrink in size as element are added or remove
        - Easy element manipulation , Array list offer method to add remove and modify element any position within the list
        - Random Access Array list support random access to element using their index enabling quick retrieval and modification of element at specific position within the list
        - Compability with java collection framework Array List implement the List interface , making them compatible with other collection classes in the java collection framework
        
      b. Disadvantages
        - Higher Memory Overhead ArrayList require additional memory to maintain their internal structure , resulting in higher memory overhead compared to arrays
        - slower insertion and deletion inserting or deleting element in the middle of an arrayList requires shifting element which can be time consuming for large list
        - Limited Performance for search searching for an element in an unsorted arraylist requires iterating over the element until a match is found
        - No primitive type support arraylist can only store object and do not directly support primitive data types like int or char
        
      c. function
        - creating an arrayList
        - adding element
        - accesing element
        - modifying element
        - finding size
        - removing element
        - iterating through the array list

    3. LinkedList is a linear data structure in whic elements are stored in separate objects called nodes

      a. Advantages
        - dynamic size linkedList can grow or shink dynamically making it suitable for varying or unknown data sizes
        - efficient insertion and deletion : inserting or deleting elements within a linkedList is efficient as it does not requeire shifting elements
        - No Contiguous Memory Requiremnet: LinkedList doesnt need contiguous memory allocation making it flexible and suitable for unpredicable memoryy situatuins
        - Easy modification : LinkedList allows easy modification of elements by changing refernece pointers enabling efficient manipulation
          
      b. Disadvantages
        - Slower Random Access : LinkedList has slower random access it requeires traversing the list to access elements by index
        - increased memory overhead: LinkedList requires additional memory for references and nodes increasing memory overhead compared to arrays
        - inefficient search LinkedList has slower search operations , requiring sequential iteration to find specific elements

      c. Functions  
        - Creating a LinkedList
        - Adding Elements
        - Accessing Elements
        - Modifying Elements
        - Removing Elements
    
    4. HashMap is data structure in java that provides a way to store and retrieve key value pairs
      
      a. Advantages
        - Efficient Retrieval: Hash Map provides fast retrieval of values based on keys with constant time complexity
        - Flexible Key Value Pairing: HashMap allows any non null object as a key enabling custom defined keys for storing and retrieving data
        - Dynamic Size: Hashmap can dynamically grow or shrink in size to handle varying amounts of data
        - Compatibility with java collection framework: Hashmap implements the Map interface, allowing seamless integration with other Collection classes
        
      b. Disadvantages
        - Lack of ordering: Hashmap does not preserve the order of element
        - Increased memory overhead: Hashmap requires aditional memory for hash codes and internal structure compared to simpler data structure
        - Slower iteration: iterating over a hashmap can be slower compared to arrays or list due to traversing the underlying hash table
             
      c. Funtion
        - put(key , value): inserts the specified key value pair into the HashMap
        - get(key): retrieves the value associated with the specified key
        - containsKey(key): Check if the hasmap contains the specified key
        - containsVaalue(value):Check if the hashmap contains the specified value
        - remove(key):removes the key value pair associated with the specified key from the HashMap
        - size(): Returns the number of key value pairs in the hashmap
        - isEmpty : checkIf the hashmap if empty
        - keySet: returns a set containing all the keys in the hashmap
        - values: returs a collection containing all the values in the hashmap
        - clear: removes all the key value pairs from the hashmap
    
    5. HashSet : is a data structure in java that implements the set interface and sttores elements in a hash table
      
      a. Advantages:
        - Fast Elemet lookup: Hashset provides fast lookup operations making it efficient to check if an element exist in the set
        - No duplicate elements: HashSet automatically handles duplicate elements and ensures that element is unique
        - Integration with java collection framework: Hashset implements the set interface making it compatible with other collection classes in the java collectioframework
            
      b. Disadvantages:
        - No guaranteed order: HashSet does not maintain the order of elements
        - No indexing: HashSet does not provide direct indexing or positional access to elements
        - Higher memory overhead: hashset requires additional memory to store hash values and maintain the hash table structure
              
      c. Features:
        - Stores unique elements: HashSet does not allow duplicate elements
        - Uses hash-based lookup: hashset uses the hash value of each element to determine its storage location, providing efficient element retrieval
        - Unordered collection: the elements in a hashset are not stored in a specific order
        
      6. TreeSet : is an implementation of the sortedGet interface in java that uses a self balancing binary search tree called a red black tree to store elements in sorted order

      a. Advantages

        - Sorted Order: treeset automatically maintains the elements in a sorted order based on their natural ordering or a custom comparator
        - No duplicate elements: treeSet does not allow duplicate elements
        - Efficient Operations: Treeset provides efficient operations like insertion deletion and searching
        - Navigable Set Operations: Treeset provides additional navigational methods such as higher lower ceiling and floor
              
      b. Disdvantages
        - overhead treeset requires additional memory to store the internal data structure
        - Slower insertion and removal: insertion and removal operations in treeset involve maintaining the sorted order of elements
        - limited cutomization treeset is primarily designed for natural ordering or a single custom comparator

      C. Function

        - Add(element) : adds an element to the treeset while maintaining the sorted order
        - remove(element): removes the specified element from the treeset
        - contains(element): check if the treeset contains the specified element
        - size():return the number of elements in the treeset
        - first(): return the first(lowest) element in the treeset
        - last(): returns the last(highesst) element in the treeset
        - higher(element): returns the least element un the treeset that is strictly greater
        - lower(element):returns the greates element in the treeSet

      7. TreeMap: is a class in java that implements the map interface and provides a sorted key value mapping

      a. Advantages

        - Sorted Ordering : Treemap maintains the keys in sorted order , which allows for efficient searching , retrieval and range based operations
        - Key Value Mapping: Treemap stores key value pairs enabling efficient lookup and retrieval of values based on the associated keys
        - Red Black Tree Implementation: Treemap uses a balanced binary search tree (red black tree) internally
        - Support for custom comparators: TreeMap allows the use of custom comparatos to define the sorting order of the keys
              
      b. Disadvantages
        - Memory Overhead: Treemap requires additional memory to store the internal tree structure and associated objects
        - Slower Insertion and Deletion: Insertion and deletion operation in Treemap have a time complexity of Olog n
        - Limited performance for unsorted Data: treemap performs efficiently for sorted data
              
      c. Functions

        - put(key,value) : insert a key value pair into the treeMap
        - get(key): Retrieves the value associated with the specified key
        - containsKey(key): Checks if the treemap contains a specific key
        - remove(key):removes the keyvalue pair associated with the specified key
        - size(): returns the n umber of keyvalue pairs in the treemap
        - keySet(): returns a set of all keys in the treemap
        - values(): returns a collection of all values in the treemap
        - entrySet(): returns a set of keyvalue pairs in the treemap

      8. Tree: is widely used data structure in computer science that represents a hierarchical structure

      a. Advantages

        - Hierarchical Structure: Trees provide a natural way to represent hierarchical relationships
        - Efficient Search: Binary search trees enable efficient searching with a time complexity of O
        - Fast Insertion and Deletion: Tree data structures offer efficient insertion and deletion operations
        - Ordered iteration: in order traversal of a binary search tree gives elements in a sorted order
              
      b. Disadvantages
        - High Memory Overhead: Trees require additional memory to store node references or pointers
        - Complex implementation: implementing and maintaning a tree data structure can be more complex compared to other data structure like arrays or lists
        - limited operations: some tree variants , like binary search trees do not support efficient operation
              
      c. Functions

        - Insertion add a new node to the tree
        - Deletion remove a node from the tree
        - Search find specific node or element in the tree
        - Transversal: Traverse the tree in different orders
        - Height/Depth: Calculate the heigh or depth of the tree
        - Balance: Ensure the tree remains balanced to maintain efficient operations

    9. Stacks: the last in first out principle dictates that the element that was most recently inserted is also the element that is removed first

      a. Advantages:

        - Simplicity: stacks are easy to understand and implement
        - Efficiency: Insertion and deletion operations have a time complexity
        - Function call management: Stacks efficiently manage function calls and variable storage
        - Undo/Redo functionality: Stacks enable undo and redo operations in applications
              
      b. Disadvantages:
        - Limited Access: access to elements is restricted to the top of the stack
        - Size restrictions: stacks may have size limitation depending on the implementation
        - Not suitable for all scenarios: Stacks are specific to LIFO behavior and may not be appropriate in other case
            
      c. Feature of a stack

        - LIFO behavior: the last element pushed onto the stack is the first one to be popped out
        - Limited Access: Stacks typically provide restricted access to elements
        - Dynamic size: Stacks can be implemented using arrays or linked list

    10. Queue: is a linear data structure in java that follows the first in first out(FIFO) principle


      a. Advantages
        - FIFO Behavior: Elements are processed in the order of their insertion
        - Efficitient Insertion and Removal: Adding and removing elements from a queue is fast
        - Synchronization: java provides synchronized queue implementations
        - Standarized Interface: The queue interface in java offers a common set of method

      b. Disadvantages
        - No Random Access : Queus do not support direct Access to elements in the middle
        - Limited Size: Some queue implementations have a fixed size or capacity
        - Inefficient Search: Searching for an element in a queue requires dequeuing until a match is found

      c. Features:

        - Enqueue: Adding an element to the rear of the queue
        - Dequeue: Removing an element from the front of the queue
        - Peek: Retrieve the element at the front of the queue without removing it
        - Size: Determining the number of elements in the queue
        - Empty CheckK Checking if the queue is empty

      11. Graph: are data structure that represent a collection of interconnected nodes or vertices

        a. Advantages
        - Versatility : graphs can represent a wide range of real world scenarios
        - Relationship Representation: Graphs provide a natural way to represent relationship
        - Efficient Search and Transversal: Graph algorithm like breadth-first search and depth first search
        - Modeling Complec Relationship: Graphs can modl complex relationship

        b. Disadvantages
        - Space Complexity: Graphs can consume a significant amount of memory
        - The complexity of Operations: Certain graph operations such as finding the shortest path
        - Difficulty in Maintanance : Modifying or updating a graph can be more complex
