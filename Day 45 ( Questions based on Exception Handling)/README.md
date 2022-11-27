### Sample Input 

3 5
2 4
0 0
-1 -2
-1 3

### Sample Output 

243
16
java.lang.Exception: n and p should not be zero.
java.lang.Exception: n or p should not be negative.
java.lang.Exception: n or p should not be negative.

### Explanation 

In the first two cases, both  and  are postive. So, the power function returns the answer correctly.
In the third case, both  and  are zero. So, the exception, "n and p should not be zero.", is printed.
In the last two cases, at least one out of  and  is negative. So, the exception, "n or p should not be negative.", is printed for these two cases.
