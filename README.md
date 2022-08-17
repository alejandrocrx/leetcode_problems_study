# Google OA Examples

### GoogleQuestion.java

You are given an array A representing heights of students. All the students are asked to stand in rows. The students arrive by one, sequentially (as their heights appear in A). For the i-th student, if there is a row in which all the students are taller than A[i], the student will stand in one of such rows. If there is no such row, the student will create a new row. Your task is to find the minimum number of rows created.

Write a function that, given a non-empty array A containing N integers, denoting the heights of the students, returns the minimum number of rows created.

For example, given A = [5, 4, 3, 6, 1], the function should return 2.

Students will arrive in sequential order from A[0] to A[N−1]. So, the first student will have height = 5, the second student will have height = 4, and so on.

For the first student, there is no row, so the student will create a new row.

Row1 = [5]

For the second student, all the students in Row1 have height greater than 4. So, the student will stand in Row1.

Row1 = [5, 4]

Similarly, for the third student, all the students in Row1 have height greater than 3. So, the student will stand in Row1.

Row1 = [5, 4, 3]

For the fourth student, there is no row in which all the students have height greater than 6. So, the student will create a new row.

Row1 = [5, 4, 3]

Row2 = [6]

For the fifth student, all the students in Row1 and Row2 have height greater than 1. So, the student can stand in either of the two rows.

Row1 = [5, 4, 3, 1]

Row2 = [6]

Since two rows are created, the function should return 2.

Assume that:

N is an integer within the range [1..1,000]

each element of array A is an integer within the range [1..10,000]

In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment

### Minimum Domin Rotations for Equal Row

### Minimum Number of Chairs

### Minimum Absolute Sum Google.java

# Arrays (Sliding Window, Kadane's Algorithm, Two-pointers)

### 739. Daily Temperatures

Traversing array from the left using a Stack.

### 75. Sort Colors \*

Arrays using two pointers.

### 88. Merge Sorted Array

Arrays using two pointers.

### 238. Product of Array Except Self

Similar to Kadane's algorithm, arrays prefix product array and suffix product array.

### 3. Longest Substring Without Repeating Characters \*

Sliding Window using HashSet to store characters.

### 209. Minimum Size Subarray Sum \*

Sliding Window.

### 152. Maximum Product Subarray

Using kadane's algorithm O(n), time O(1) space, we keep track of the maximum product subarray and we traverse the array from left to right and right to left.

# DFS

### 130. Surrounded Regions

Using depth-first search, we go through first and last column and also first and last row to check for O's and change them for _'s. After that, we go through each cell in the 2D array and check if there is an O or an _.

### 46. Permutations

Using depth-first search, we add each combination and at the end, we remove the last item in the list.

### 17. Letter Combinations of a Phone Number

We do depth-first search for every digit in the string. We recursively call dfs for every index + 1 and when the base case is reached, we delete the character of the last at stringbuilder.

### 200. Number of Islands

We do depth-first search for each '1' that we find, we go up, down, left and right looking for more 1's. When we find a 1, we set it equal to '0' to mark it as found.

# Dynamic Programming

### 62. Unique Paths

Using dynamic programming, we initialize a 2d array and fill the array with its base cases.

### 70. Climbing Stairs

Using dynamic programming, similar to the fibonacci sequence, we initialize an array of size n+1 with base cases dp[0] = 1 and dp[1] = 1.
