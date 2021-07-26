#include <cstdio>
#include <cstdlib>
#include <iostream>
#include <vector>

using namespace std;

int validCharge(int value) { return (value > 20) ? 20 : value; }

int ctt(int n, int k, int level, int charge, int t[], int c[], int memo[][21]) {
  if (level == n)
    return 0;

  if (memo[level][charge] == 0) {
    if (charge < k) {
      memo[level][charge] =
          t[level] +
          ctt(n, k, level + 1, validCharge(charge + c[level]), t, c, memo);
    } else {
      memo[level][charge] =
          min(t[level] + ctt(n, k, level + 1, validCharge(charge + c[level]), t,
                             c, memo),
              ctt(n, k, level + 1, 0, t, c, memo));
    }
  }

  return memo[level][charge];
}

int main(void) {
  freopen("input.txt", "r", stdin);
  freopen("output.txt", "w", stdout);
  int n, k;
  cin >> n >> k;
  int t[n];
  int c[n];
  int memo[n][21] = {{0}};

  for (int &x : t) {
    cin >> x;
  }

  for (int &x : c) {
    cin >> x;
  }

  cout << ctt(n, k, 0, 0, t, c, memo);
  return 0;
}
