Description
Problem Statement

Gaffur is a class teacher in school. He is calculating the attendance score of one student in the below way:

He will make a string of only characters('0', '1', '2').
He appends '2' to the string if the student is present for that day.
He appends '1' to the string if the student is absent with permission for that day.
He appends '0' to the string if the student is absent without permission for that day.
You are asked to find the total number of ways the string can be formed for a student for n days.

Input Format

The first and only line will be the integer n.
Constraints

(1 <= n <= 10^5)
Output Format

Output the answer to the problem by taking modulo with 1e9 + 7.
Evaluation Parameters

Sample Input
2
Sample Output
9
Explanation
﻿Six different strings are:

00

01

02

10

11

12

20

21

22


