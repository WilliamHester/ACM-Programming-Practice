/******************************************************
 * ChocolateFeast.cpp
 * By David Shuckerow (djs0017@auburn.edu)
 * 9/4/2014
 *
 * Problem: Chocolate Feast
 * https://www.hackerrank.com/challenges/chocolate-feast
 *
 * Count the number of chocolates that Bob can get
 *   considering he gets free chocolates for
 *   turning in wrappers.
 ******************************************************/
#include <iostream>
using namespace std;

int countChocolates(int n, int c, int m) {
    int chocolates = n/c;
    int wrappers = chocolates;
    while (wrappers >= m) {
        wrappers += 1;
        chocolates += 1;
        wrappers -= m;
    }
    return chocolates;
}

int main() {
    int t,n,c,m;
    cin>>t;
    while(t--){
        cin>>n>>c>>m;
        // Compute answer
        cout<<countChocolates(n, c, m)<<endl;
    }
    return 0;
}
