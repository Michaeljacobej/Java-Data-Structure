import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class DataStructure {
    //ARRAY
    public void array() {
        double[] myList = { 1.9, 2.9, 3.4, 3.5 };

        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }

        // Summing all elements
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }

        System.out.println("Total is " + total);

        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max)
                max = myList[i];
        }

        System.out.println("Max is " + max);
    }
    
    // ArrayList
    public void arrayList() {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(10, 20, 30, 40, 50));

        System.out.println("Element at index 0:" + numbers.get(0));
        System.out.println("Element at index 2:" + numbers.get(2));
        System.out.println("Element at index 4:" + numbers.get(4));

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of ArrayList elements:" + sum);

        numbers.set(2, 35);
        System.out.println("Updated element at index 2:" + numbers.get(2));

        System.out.println("Elements in the ArrayList:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
    
    public void linkedList() {
        // Create a LinkedList to store integers  
        LinkedList<Integer> linkedList1 = new LinkedList<>();

        // Add elements to the LinkedList  
        linkedList1.add(10);
        linkedList1.add(20);
        linkedList1.add(30);
        linkedList1.add(40);
        linkedList1.add(50);

        // Print the LinkedList  
        System.out.println("LinkedList:" + linkedList1);

        // Remove an element from the LinkedList  
        linkedList1.removeFirst();
        System.out.println("LinkedList after removing first element:" + linkedList1);

        // Check if an element exists in the LinkedList  
        boolean containsElement = linkedList1.contains(30);
        System.out.println("LinkedList contains element 30?" + containsElement);

        // Get the first and last elements of the LinkedList  
        int firstElement = linkedList1.getFirst();
        int lastElement = linkedList1.getLast();
        System.out.println("First element:" + firstElement);
        System.out.println("Last element:" + lastElement);

        // Clear the LinkedList  
        linkedList1.clear();
        System.out.println("LinkedList after clearing:" + linkedList1);
    }
    
    public void hashMap() {
        // Create a HashMap to store String keys and Integer values  
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs to the HashMap  
        hashMap.put("John", 25);
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 35);

        //Access and print values based on keys  
        System.out.println("Age of John:" + hashMap.get("John"));
        System.out.println("Age of Alice:" + hashMap.get("Alice"));

        // Check if a key exists in the HashMap  
        System.out.println("Is Bob present?" + hashMap.containsKey("Bob"));

        // Update the value associated with a key  
        hashMap.put("Alice", 32);

        // Remove a key-value pair from the HashMap  
        hashMap.remove("John");

        // Print all key-value pairs in the HashMap  
        System.out.println("Key-Value pairs in the HashMap:");
        for (String key : hashMap.keySet()) {
            System.out.println(key + ":" + hashMap.get(key));
        }

        // Check the size of the HashMap  
        System.out.println("Size of the HashMap:" + hashMap.size());
    }
    
    public void hashSet() {
        // Create a HashSet  
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet  
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");
        set.add("Mango");

        // Print the HashSet  
        System.out.println("HashSet:" + set);

        // Check if an element exists  
        System.out.println("Contains 'Apple':" + set.contains("Apple"));

        // Remove an element  
        set.remove("Banana");

        // Print the updated HashSet  
        System.out.println("Updated HashSet:" + set);

        // Get the size of the HashSet  
        System.out.println("Size of HashSet:" + set.size());

        // Clear the HashSet  
        set.clear();

        // Check if the HashSet is empty  
        System.out.println("Is HashSet empty?" + set.isEmpty());

    }
    
    public void treeMap() {
        // Create a TreeMap  
        TreeMap<String, Integer> scores = new TreeMap<>();

        // Insert key-value pairs into the TreeMap  
        scores.put("Alice", 90);
        scores.put("Bob", 80);
        scores.put("Charlie", 95);
        scores.put("David", 87);
        scores.put("Eve", 92);

        //Access and print values from the TreeMap  
        System.out.println("Score of Alice:" + scores.get("Alice"));
        System.out.println("Score of Charlie:" + scores.get("Charlie"));
        System.out.println("Score of David:" + scores.get("David"));

        // Update a value in the TreeMap  
        scores.put("Bob", 85);

        // Remove a key-value pair from the TreeMap  
        scores.remove("Eve");

        // Iterate through the TreeMap using a for-each loop  
        System.out.println("Scores in the TreeMap:");
        for (String name : scores.keySet()) {
            int score = scores.get(name);
            System.out.println(name + ":" + score);
        }
    }
    
    public void treeSet() {
         // Create a TreeSet  
        TreeSet<Integer> numbers=new TreeSet<>();  
  
        // Add elements to the TreeSet  
        numbers.add(5);  
        numbers.add(2);  
        numbers.add(8);  
        numbers.add(1);  
        numbers.add(4);  
  
        // Print the TreeSet  
        System.out.println("Elements in the TreeSet:"+numbers);  
  
        // Check if an element exists  
        System.out.println("Does TreeSet contain 4?"+numbers.contains(4));  
  
        // Remove an element  
        numbers.remove(2);  
  
        // Print the TreeSet after removal  
        System.out.println("Elements in the TreeSet after removal:"+numbers);  
  
        // Get the size of the TreeSet  
        System.out.println("Size of the TreeSet:"+numbers.size());  
  
        // Get the first and last element  
        System.out.println("First element:"+numbers.first());  
        System.out.println("Last element:"+numbers.last());  
  
        // Iterate over the TreeSet  
        System.out.println("Iterating over the TreeSet:");  
        for (int number:numbers)   
        {  
            System.out.println(number);  
        }  
    }

    public void stack() {
        // Create a stack  
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack  
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Print the top element of the stack  
        System.out.println("Top element:" + stack.peek());

        // Pop elements from the stack  
        int poppedElement = stack.pop();
        System.out.println("Popped element:" + poppedElement);

        // Check if the stack is empty  
        System.out.println("Is stack empty?" + stack.isEmpty());

        // Get the size of the stack  
        System.out.println("Stack size:" + stack.size());

        // Iterate over the stack  
        System.out.println("Stack elements:");
        for (Integer element : stack) {
            System.out.println(element);
        }
    }
    
    public void queue(){
      // Create a Queue to store integers  
        Queue<Integer> queue=new LinkedList<>();  
  
        // Enqueue elements to the Queue  
        queue.offer(10);  
        queue.offer(20);  
        queue.offer(30);  
        queue.offer(40);  
        queue.offer(50);  
  
        //Access and print the front element of the Queue  
        System.out.println("Front element:"+queue.peek());  
  
        // Dequeue elements from the Queue and print them  
        while (!queue.isEmpty())   
        {  
            int element=queue.poll();  
            System.out.println("Dequeued element:"+element);  
        }  
    }


    public static void main(String[] args) {
        
 
     }

}
