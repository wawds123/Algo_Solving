#include <stdio.h>
#include <string.h>

int main(int argc, const char * argv[]) {
    char str[1000][81];
    int str_pos[1000];
    
    int value, i, j;
    scanf("%d", &value);
    for (i = 0; i < value; i++) {
        scanf("%d", &str_pos[i]);
        scanf("%s", &str[i]);
    }
    
    for (i = 0; i < value; i++) {
        printf("%d ", i+1);
        for (j = 0; j < strlen(str[i]); j++) {
            if (j+1 != str_pos[i]) {
                    printf("%c", str[i][j]);
            }
        }
        printf("\n");
    }
    
    return 0;
}