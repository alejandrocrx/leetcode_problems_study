# Arrays (Sliding Window, Kadane's Algorithm)

### 75. Sort Colors *

Arrays using two pointers.

### 3. Longest Substring Without Repeating Characters *

Sliding Window using HashSet to store characters.

### 209. Minimum Size Subarray Sum *

Sliding Window.

### 152. Maximum Product Subarray

Using kadane's algorithm O(n), time O(1) space, we keep track of the maximum product subarray and we traverse the array from left to right and right to left.

# DFS

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

