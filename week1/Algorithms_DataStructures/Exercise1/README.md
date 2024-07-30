#### Time Complexity
- **Add Operation**: `O(1)` on average, as HashMap provides constant-time insertion.
- **Update Operation**: `O(1)` on average, since updating a value in HashMap is equivalent to adding a new entry.
- **Delete Operation**: `O(1)` on average, because HashMap provides constant-time deletion.

#### Optimization
- **Use of HashMap**: By using a HashMap, we can store products based on their unique product ID, which allows for efficient retrieval and modification of products.
- **Error Handling**: We have added checks to ensure that the product exists before updating or deleting it, which helps prevent errors.
