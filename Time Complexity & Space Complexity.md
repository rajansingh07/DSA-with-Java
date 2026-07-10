# Time Complexity and Space Complexity (SC)

## What is Time Complexity? (TC)

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
    sout "Raj"
}
```
                    
Technically the time complexity is **O(3n)** but we write **O(n)**.

### Why O(3n)

```
i <= n      - n time
sout "Raj"  - n time
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

## What is Space Complexity? (SC)

Many beginners think **Space Complexity = Memory Used**, but this is **not completely true**.

> **Space Complexity tells us how the memory usage grows as the input size (N) increases.**

---

## Definition

**Space Complexity (SC) -> Space Complexity is the rate at which the extra memory required grows with respect to the input size.**

---

## Example

```cpp
int sum = 0;

for (int i = 1; i <= n; i++) {
    sum += i;
}
```

The program only uses two extra variables:

* `sum`
* `i`

The amount of extra memory does not change even if `n` becomes very large.

**Space Complexity = O(1)**

---

## Another Example

```java
int arr[n];
```

Here, an array of size `n` is created.

As `n` increases, the memory required also increases.

**Space Complexity = O(n)**

---

## Key Points

* Space Complexity measures **extra memory used** by an algorithm.
* It is based on the **input size (N)**.
* Constant extra memory → **O(1)**
* Memory that grows with `N` → **O(n)**
