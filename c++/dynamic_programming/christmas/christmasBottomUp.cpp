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

int main() {
  freopen("input.txt", "r", stdin);
  freopen("output.txt", "w", stdout);

  assert(2 == scanf("%d%d", &N, &B));
  for (i = 0; i < N; i++)
    assert(1 == scanf("%d", &V[i]));

  vector<vector<int>> memo(i, vector<int>(i, 0));

  int result = 0;

  for (int k = 0; k < i; k++) {
    if (k == 0)
      memo[k][0] = V[k];
    for (int j = k + 1; j < i; j++) {
      for (int y = j; y < i; y++) {
        if (memo[k][j] == 0) {
          memo[k][j] = memo[k][j - 1] + V[y];
        } else {
          memo[k][j] = (min(memo[k][j - 1] + V[y], memo[k][j]) > B
                            ? min(memo[k][j - 1] + V[y], memo[k][j])
                            : memo[k][j]);
        }

        if (result < B) {
          result = max(memo[k][j], result);
        } else if (memo[k][j] >= B && result >= memo[k][j]) {
          result = memo[k][j];
          break;
        }
      }
    }
  }

  printf("%d\n", result);
  return 0;
}