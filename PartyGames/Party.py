#!/usr/bin/python3
while True:
	n = int(input())
	if n == 0:
		break
	names = sorted([input().strip() for i in range(n)])
	#print(n)
	n1 = names[n//2-1]
	n2 = names[n//2]
	output = ''
	for i in range(len(n1)):
		c1 = ord(n1[i])
		Z = ord('Z')

		if c1 < Z and i < len(n1)-1:
			c1 += 1
		c = chr(c1)
		if output+c >= n1 and output+c < n2:
			output += c
			break
		else:
			output += n1[i]
	print(output)