### Example 1

- Example 2 – O(n), linear time algorithms
```java
for (int i = 0; i < a.length; i++) {

    System.out.println(a[i]);

}
```
Time will grow linearly with the size of the given array and it is denoted as O(n). In linear time we cannot say exactly how much time this means.

### Example 2

- Fibonacci
```java
  int fibonacci(int k) {
  if (k <= 1) {
  return k;
  }
  return fibonacci(k - 2) + fibonacci(k - 1);
  }
```
The time complexity is O(2^n). This is because the depth of
the general tree is equal to k and also almost every node has
two children. This is made clear if the method is represented
as a binary tree. The Big-O is O(branches^depth), and thus
O(2^k) or O(2^n).

### Example 3
- Example 3 – O(n), dropping the constants
```java
for (int i = 0; i < a.length; i++) {

    System.out.println("Current element:");

    System.out.println(a[i]);

    System.out.println("Current element + 1:");

    System.out.println(a[i] + 1);

}
```
We have four lines of code in a loop but Big O here is O(n) because in Big O we drop constants. We would still have the same runtime even if we added more instructions to the loop.