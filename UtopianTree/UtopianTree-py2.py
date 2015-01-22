#!/usr/bin/python
################################################
# UtopianTree.py (python 2 solution)
# By David Shuckerow (djs0017@auburn.edu)
# 8/28/2014
# 
# Problem: Utopian Tree
# https://www.hackerrank.com/challenges/utopian-tree
#
# Find the height of a tree that:
#   Doubles in height during the first season
#   Grows by 1 meter during the second season
#################################################

t = int(raw_input())
for i in range(t):
    n = int(raw_input())
    height = 1
    for j in range(1,n+1):
        if j % 2 == 0:
            height += 1
        else:
            height *= 2
    print height