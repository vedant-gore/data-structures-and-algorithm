############################
DSA PRACTICE CODES
############################
FOR BINARY SEARCH:
Both mid = start + (end-start)/2 and mid = (end+start)/2 are used to calculate the middle index in a binary search algorithm. They are mathematically equivalent, but there is a subtle difference in terms of programming:
mid = (end+start)/2: This is the straightforward way to calculate the midpoint. However, it can potentially lead to an integer overflow if start and end are both very large numbers. This is because the sum end+start could exceed the maximum limit for integers.
mid = start + (end-start)/2: This version avoids the risk of integer overflow. It first calculates the difference between end and start, divides it by 2, and then adds the result to start. This way, the sum end+start is never actually computed, so it can’t overflow.
So, in practice, it’s safer to use mid = start + (end-start)/2 to avoid potential integer overflow issues, especially when dealing with large arrays or ranges. This is why you’ll often see this version used in production code. It’s a small detail, but it can help prevent bugs in your programs.