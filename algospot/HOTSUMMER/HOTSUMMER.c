#include <stdio.h>

int main(int argc, const char * argv[]) {
    int T = 0, W = 0, i, j;
    int MAX;
    int A[10];
    scanf("%d", &T);
    
    for (i = 0; i < T; i++) {
        scanf("%d", &W);
        MAX = 0;
        for (j = 0; j < 9; j++) {
            scanf("%d", &A[i]);
            MAX += A[i];
        }
        if (MAX > W) {
            printf("NO\n");
        } else {
            printf("YES\n");
        }
    }
    
    return 0;
}