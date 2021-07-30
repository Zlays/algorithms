/*
 * This template is valid both in C and in C++,
 * so you can expand it with code from both languages.
 */

#include <algorithm>
#include <cassert>
#include <cstdio>
#include <vector>
using namespace std;

// constraints
#define MAXN 10000

// input data
int N, B, i;
int V[MAXN];

vector<vector<int>> memo(4100, vector<int>(101, 0));
int result = 0;

int chrismas(int sum, int x) {

  if ((x == i || sum >= B)) {
    if (result < B)
      result = (result == 0) ? sum : max(result, sum);
    if (sum >= B && sum < result)
      result = sum;
    return sum;
  }
  if (memo[sum][x] == 0)
    memo[sum][x] = (result < B)
                       ? max(chrismas(sum + V[x], x + 1), chrismas(sum, x + 1))
                       : min(result, min(chrismas(sum + V[x], x + 1),
                                         chrismas(sum, x + 1)));

  return memo[sum][x];
}

int main() {
  freopen("input.txt", "r", stdin);
  freopen("output.txt", "w", stdout);

  assert(2 == scanf("%d%d", &N, &B));
  for (i = 0; i < N; i++)
    assert(1 == scanf("%d", &V[i]));

  chrismas(0, 0);
  printf("%d\n", result);
  return 0;
}
