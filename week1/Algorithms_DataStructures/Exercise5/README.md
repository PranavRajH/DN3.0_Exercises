#### Time Complexity

- **Add Operation**: O(n) - Adding a task requires traversing the list to find the end, which takes linear time.
- **Search Operation**: O(n) - Searching for a task involves traversing the list, taking linear time.
- **Traverse Operation**: O(n) - Traversing the list to print all tasks takes linear time.
- **Delete Operation**: O(n) - Deleting a task requires searching for it first (O(n)) and then potentially adjusting pointers, taking linear time.

#### Advantages of Linked Lists Over Arrays for Dynamic Data

- **Dynamic Size**: Linked lists can grow and shrink dynamically without the need for resizing or reallocating memory.
- **Efficient Insertions/Deletions**: Insertions and deletions can be more efficient compared to arrays, especially when they occur at the beginning or middle of the list, as they do not require shifting elements.
- **Memory Utilization**: Linked lists do not require contiguous memory allocation, which can be advantageous when dealing with large datasets.

**Limitations of Linked Lists**:
- **Access Time**: Accessing elements by index is inefficient (O(n)) compared to arrays (O(1)).
- **Memory Overhead**: Each node requires additional memory for the reference to the next node, increasing overall memory usage.
  
In summary, linked lists are well-suited for applications where the size of the data structure changes frequently, and efficient insertions/deletions are required. Arrays are better for applications requiring fast random access and minimal memory overhead.