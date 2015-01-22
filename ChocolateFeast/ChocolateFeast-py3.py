#!/usr/bin/python3
################################################
# ChocolateFeast-py3.py (python 3 solution)
# By David Shuckerow (djs0017@auburn.edu)
# 9/3/2014
# 
# Problem: Chocolate Feast
# https://www.hackerrank.com/challenges/chocolate-feast
#
# Count the number of chocolates that Bob can get
#   considering he gets free chocolates for
#   turning in wrappers.
#################################################
# Setup
T = int(input())
for i in range(T):
    N,C,M = [int(c) for c in str(input()).split()]
    answer = 0
    
    # How many chocolates can we buy?
    answer += N//C # Perform integer division
    wrappers = N//C # We get this many wrappers.
    
    # Cash in wrappers for free chocolates.
    while wrappers >= M:
        wrappers -= M
        answer += 1
        # Get one wrapper from the free chocolate
        wrappers += 1
        
    print(answer)