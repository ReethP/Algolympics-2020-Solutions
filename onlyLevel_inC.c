#include <stdio.h>
#include <stdlib.h>

int main() {
	int numOfCases = 0, i = 0;
	scanf("%d", &numOfCases);
	int *answers;
	answers = (int *) malloc(sizeof(int) * numOfCases);

	for (i = 0; i < numOfCases; ++i) {
		int success = 1;
		long long int integer, base;
		scanf("%lli %lli", &integer, &base);
		long long int first = 1+(((integer*1)-1)%(base-1));
		for (long long int j = 2; j < base; j++) {
			long long int droot = 1+(((integer*j)-1)%(base-1));
			// printf("%lli\n", droot);
			if (droot == first) {
				success = 0;
				break;
			}
		}
		if (success) answers[i] = 1;
		else answers[i] = 0;
	}

	for (int j = 0; j < numOfCases; j++) {
		// printf("j%d = %d\n", j,answers[j]);
		if (answers[j] == 1) {
			printf("COOL\n");
		} else {
			printf("NOT COOL\n");
		}
	}
	return 0;
}