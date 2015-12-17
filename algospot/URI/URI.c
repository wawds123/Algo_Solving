#include <stdio.h>
#include <string.h>

int main(int argc, const char * argv[]) {
    int value, i, j;
    char url[100][81];
    
    scanf("%d", &value);
    
    for (i = 0; i < value; i++) {
        scanf("%s", &url[i]);
    }
    
    for (i = 0; i < value; i++) {
        for(j = 0; j < strlen(url[i]); j++) {
            if (url[i][j] == '%' && url[i][j + 1] == '2') {
                switch(url[i][j + 2]) {
                    case '0':
                        printf(" ");
                        break;
                    case '1':
                        printf("!");
                        break;
                    case '4':
                        printf("$");
                        break;
                    case '5':
                        printf("%%");
                        break;
                    case '8':
                        printf("(");
                        break;
                    case '9':
                        printf(")");
                        break;
                    case 'a':
                        printf("*");
                        break;
                }
                j += 2;
            } else {
                printf("%c", url[i][j]);
            }
        }
        printf("\n");
    }
    return 0;
}