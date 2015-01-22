/******************************************************
 * UtopianTree.cpp
 * By David Shuckerow (djs0017@auburn.edu)
 * 9/4/2014
 * 
 * Problem: Utopian Tree
 * https://www.hackerrank.com/challenges/utopian-tree
 *
 * Find the height of a tree that:
 *  Doubles in height during the first season
 *  Grows by 1 meter during the second season
 ******************************************************/
#include <iostream>
using namespace std;

int height(int n) {
    // Start on the 1st growth cycle
    // Finish on (not before) the nth cycle.
    int hgt = 1;
    for (int i=1; i<=n; i++) {
        if (i%2==1) {
            hgt *= 2;
        } else {
            hgt++;
        }
    }
    return hgt;
}

int main() {
    // handle input
    int T;
    cin >> T;
    while (T--) {
        int n;
        cin >> n;
        cout << height(n) << endl;
    }
}
