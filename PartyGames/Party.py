#!/usr/bin/python3
'''
Solution to PartyGames
Dave Shuckerow (acm@auburn.edu)
9/24/2014

Given a list of names, find the shortest string that separates
	the list in two halves.

There's a special edge case in this problem that obeys the following logic:
For a given character in the string:
	if that character isn't the end of the string and it isn't Z
		try turning the character into the next character in the alphabet
		if the resulting string divides the list properly
			we found the shortest dividing string.
		otherwise, 
			add the current character as-is to the string
			move on to the next character.
'''
while True:
	n = int(input())
	if n == 0:
		break
	# Read all the names into a list.
	names = sorted([input().strip() for i in range(n)])
	# Find the two names in the middle of the list.
	n1 = names[n//2-1]
	n2 = names[n//2]
	output = ''
	for i in range(len(n1)):
		# Take the character at the given position
		# as its ASCII representation.
		c1 = ord(n1[i])
		Z = ord('Z')
		#---------------------EDGE CASE-------------------------
		if c1 < Z and i < len(n1)-1:
			c1 += 1
		c = chr(c1)
		if output+c >= n1 and output+c < n2:
			output += c
			break
		else:
			output += n1[i]
	print(output)