# Java Collection Framework
**Collection:** 

Any group of individual objects which are represented as a single unit object is known as the **Collection** of the object.

**Framework:**

A **Framework** is set of classes and interfaces which provides a ready-made architecture.
## Collection Framework

**Collection Framework** is java API which provides architecture to store and manipulate group of objects.

### List Interface
#### Five Different Methods:
1. `add(E e)` - Adds an element to the list.
2. `get(int index)` - Retrieves the element at the specified index.
3. `remove(int index)` - Removes the element at the specified index.
4. `set(int index, E element)` - Replaces the element at the specified index.
5. `size()` - Returns the number of elements in the list.

#### Implementation Classes:
- `ArrayList`
- `LinkedList`
- `Vector`
- `Stack`

### ArrayList vs LinkedList
| Feature         | ArrayList                 | LinkedList               |
|---------------|-------------------------|-------------------------|
| Data Structure | Dynamic array            | Doubly linked list      |
| Performance    | Faster random access     | Faster insertion/deletion |
| Memory Usage  | Less overhead            | More overhead due to node storage |
| Iteration Speed | Faster due to contiguous memory | Slower due to pointer traversal |

### ArrayList vs Vector
| Feature          | ArrayList        | Vector         |
|----------------|----------------|---------------|
| Synchronization | Not synchronized | Synchronized  |
| Performance     | Faster (no synchronization overhead) | Slower (due to synchronization) |
| Growth Rate     | Increases by 50% | Doubles in size |

### Stack vs Queue
| Feature       | Stack (LIFO)       | Queue (FIFO)       |
|--------------|-----------------|-----------------|
| Order        | Last In, First Out | First In, First Out |
| Methods      | `push()`, `pop()`  | `add()`, `remove()` |
| Use Case     | Backtracking, Recursion | Task scheduling, Print jobs |

### Set Interface
#### Five Different Methods:
1. `add(E e)` - Adds an element to the set if it's not already present.
2. `remove(Object o)` - Removes the specified element from the set.
3. `contains(Object o)` - Checks if the set contains the specified element.
4. `size()` - Returns the number of elements in the set.
5. `iterator()` - Returns an iterator over the elements in the set.

#### Implementation Classes:
- `HashSet`
- `LinkedHashSet`
- `TreeSet`

### HashSet vs LinkedHashSet vs TreeSet
| Feature          | HashSet         | LinkedHashSet  | TreeSet        |
|----------------|----------------|---------------|---------------|
| Ordering      | No order        | Insertion order maintained | Sorted order |
| Performance   | Fastest (O(1) average time for operations) | Slightly slower than HashSet | Slowest (O(log n) operations) |
| Null Allowed? | Yes (one)       | Yes (one)     | No (null not allowed) |

### Understanding Hashing and Collision
#### Hashing:
- A technique to map data to a fixed-size table using a hash function.
- Helps in quick lookups, insertions, and deletions.

#### Collision Handling Techniques:
1. **Chaining** - Uses a linked list to store multiple values at the same hash index.
2. **Open Addressing** - Searches for the next available slot using:
   - **Linear Probing**: Checks the next slot sequentially.
   - **Quadratic Probing**: Uses a quadratic function to find the next available slot.
   - **Double Hashing**: Uses a second hash function to determine the next slot.

- Proper selection of hash functions and collision handling techniques ensures efficient performance in hash-based data structures.
