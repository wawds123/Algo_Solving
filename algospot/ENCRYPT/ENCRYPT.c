#include <stdio.h>
#include <string.h>



int main() {
	char str1[10][101];
	int i, j;

	int value = 0;
	char str[100] = "";
	scanf("%d", &value);
	
	for (i = 0; i < value; i++) {
		scanf("%s", &str1[i]);
	}

	for (i = 0; i < value; i++) {
		for (j = 0; j < strlen(str1[i]); j+=2) {
			printf("%c", str1[i][j]);
		}
		for (j = 1; j < strlen(str1[i]); j+=2) {
			printf("%c", str1[i][j]);
		}
		printf("\n");
	}
	return 0;
}