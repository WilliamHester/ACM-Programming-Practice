#!/usr/bin/python3
import math

cities = []
wires = []

def kruskal(n, cities, wires):
	colors = list(range(n))
	differentColors = n
	wires = sorted(wires, key=lambda x: x[2])
	distance = 0
	for e in wires:
		start, end, d = e
		if colors[start] != colors[end]:
			distance += d
			differentColors -= 1
			newCol = min(colors[start], colors[end])
			oldCol = max(colors[start], colors[end])
			for i in range(n):
				if colors[i] == oldCol:
					colors[i] = newCol
		if differentColors == 1:
			return distance, "Worked"
	return distance, "Failed"


def dist(i, j):
	x1, y1 = cities[i]
	x2, y2 = cities[j]
	return math.sqrt((x2-x1)**2 + (y2-y1)**2)

while True:
	n = int(input())
	if n == 0:
		break
	cities = []
	wires = []
	for i in range(n):
		x, y = map(int, input().split())
		cities.append((x, y))
		for j in range(i):
			wires.append( (i, j, dist(i,j)) )
	answer = kruskal(n, cities, wires)
	print("{:.2f}".format(answer[0]))
