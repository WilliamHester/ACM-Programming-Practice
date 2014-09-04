#!/usr/bin/python3
################################################
# ViveLaDifference.py (python 3 solution)
# By David Shuckerow (djs0017@auburn.edu)
# 9/3/2014
# 
# Problem: Vive La Difference (ACM SER 2011 Problem D)
# http://ser.cs.fit.edu/ser2011/problems/contest/SER2011%20Problem%20Set.pdf
# 
# Compute the number of steps it takes to reduce
# 	4 numbers down to 0 by subtracting in the following manner:
# 	a, b, c, d = |a-b|, |b-c|, |c-d|, |d-a|
#################################################

while True:
	a, b, c, d = map(int, input().split())
	if a == b == c == d == 0:
		break
	steps = 0
	while not (a == b == c == d):
		a, b, c, d = abs(a-b), abs(b-c), abs(c-d), abs(d-a)
		steps += 1
	print(steps)
