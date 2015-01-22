#!/usr/bin/python3
"""
nonogram.py
David Shuckerow (djs0017@auburn.edu)
9/23/14

Reverse Nonogram (2012 ICPC Division II)

Given a "nonogram" string, find the code that created it.
"""
while True:
	n = int(input())
	if n == 0:
		break
	board = []
	for i in range(n):
		board.append(input().strip())

	# Count horizontal
	for i in range(n):
		nums = []
		count = 0
		for j in range(n):
			c = board[i][j]
			if c == 'X':
				count += 1
			elif count != 0:
				nums.append(str(count))
				count = 0
		if count != 0 or len(nums) == 0:
			nums.append(str(count))
		print(' '.join(nums))
	# Count vertical

	for j in range(n):
		nums = []
		count = 0
		for i in range(n):
			c = board[i][j]
			if c == 'X':
				count += 1
			elif count != 0:
				nums.append(str(count))
				count = 0
		if count != 0 or len(nums) == 0:
			nums.append(str(count))
		print(' '.join(nums))
