# Time Complexity and Space Complexity (TC & SC)

## What is Time Complexity? (TC)

**Time Complexity** is the **rate at which the time taken by an algorithm increases with respect to the input size.**

The actual execution time of a program depends on several factors:

* Machine specifications
* Programming language
* Compiler optimizations
* Operating System

### Example

Suppose the same program runs on two different machines:

* New Mac → **1 second**
* Old Windows PC → **2 seconds**

The actual execution time is different, but the **Time Complexity remains the same**.

**Time Complexity does not measure the actual time taken. It measures how the execution grows with respect to the input size.**

---

## Example

```java
for (int i = 1; i <= n; i++) {
    System.out.println("Raj");
}
```

The loop runs `n` times.

Approximately:

```text
i <= n       → n times (Initialization)
i <= n       → n times (Comparison)
print        → n times (Printing)
i++          → n times (Increment)
```

Total operations:

```text
≈ 4n
```

So technically:

```text
O(4n)
```

But we write:

```text
O(n)
```

because **constant factors are ignored in Big-O notation**.

---

## Rules of Big-O

```text
O(3n)       → O(n)

O(5n)       → O(n)

O(100n)     → O(n)

O(n + 10)   → O(n)

O(2n²)      → O(n²)

O(3n² + n)  → O(n²)
```

### Rule **Ignore constants and lower-order terms, and keep the dominant term.**

# What is Space Complexity? (SC)

**Space Complexity** is the **rate at which the extra memory required by an algorithm increases with respect to the input size.**

### Example

```cpp
int sum = 0;

for (int i = 1; i <= n; i++) {
    sum += i;
}
```

The algorithm uses only a fixed amount of extra memory:

```text
sum
i
```

The memory requirement does not increase when `n` increases.

Therefore:

```text
Space Complexity = O(1)
```

---

## Another Example

```java
int[] arr = new int[n];
```

An array of size `n` is created.

As `n` increases, the memory requirement also increases.

Therefore:

```text
Space Complexity = O(n)
```

---

# Time Complexity vs Space Complexity

| Complexity           | Meaning                                                           |
| -------------------- | ----------------------------------------------------------------- |
| **Time Complexity**  | Rate at which the number of operations increases with input size  |
| **Space Complexity** | Rate at which the extra memory required increases with input size |

### Quick Revision

**TC → Growth of operations**

**SC → Growth of extra memory**

**Big-O → Describes the growth rate of an algorithm**
