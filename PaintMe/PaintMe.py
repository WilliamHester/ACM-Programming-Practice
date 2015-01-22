#!/usr/bin/python3
################################################
# PaintMe.py (python 3)
# By David Shuckerow (djs0017@auburn.edu)
# 9/5/2014
# 
# Problem: Paint Me
# https://docs.google.com/file/d/0B5A-W35u8ilpQ0R6RzJSY1lKQ0U/edit
#
# Count the number of cans of paint it takes
#   to paint an apartment complex.
#################################################


while True:
    n, w, l, h, a, m = [int(e) for e in input().split()]
    if n == w == l == h == a == m == 0:
        break
    doorsAndWindows = []
    for i in range(m):
        doorsAndWindows.append([int(e) for e in input().split()])
    roomwl = w*l
    roomwh = w*h
    roomlh = l*h
    doorWindowArea = sum([l[0]*l[1] for l in doorsAndWindows])
    roomArea = roomwl + 2*roomwh + 2*roomlh - doorWindowArea
    totalArea = n*roomArea
    cans = totalArea//a
    if totalArea%a != 0:
        cans += 1
    print(cans)
