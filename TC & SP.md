# Time Complexity (TC)

## What is Time Complexity?

Many beginners think **Time Complexity = Time Taken**, but this is **not true**.

The actual time taken by a program depends on many factors, such as:

* Machine specifications (CPU, RAM)
* Programming language
* Compiler optimizations
* Operating System

### Example

Suppose the same program runs on two different machines:

* 💻 New Mac: **1 second**
* 💻 Old Windows PC: **2 seconds**

Although the execution time is different, the **Time Complexity remains the same**.

> **Time Complexity does not measure the actual time taken.**

---

## Definition

**Time Complexity (TC) -> Time Complexity is rate at which the time taken with respect to input size.**

---

# Example

```java
for(i = 1; i <= n; i++) {
    Sout "Raj"
}
```

Technically the time complexity is **O(3n)** but we write **O(n)**.

### Why O(3n)

```
i <= n      - n time
cout "Raj"  - n time
i++         - n time
```

**Total operations ≈ 3n**

But we are not write like **O(3n)**, we are write like **O(n)** because we ignore constant.

---

## Rule of Big O

```
O(3n)   → O(n)
O(5n)   → O(n)
O(100n) → O(n)
O(n + 10) → O(n)
O(2n²)  → O(n²)
```
