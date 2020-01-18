#include<stdio.h>
#include<stdlib.h>

int main(){
	int rows,cols,cases;
	scanf("%d",&cases);
	int outputs[cases];
	for(int i=0;i<cases;i++){
		scanf("%d %d",&rows,&cols);
		rows = rows-1;
		char **array = (char**)malloc(sizeof(char*)*(rows));
		for(int k = 0;k<rows;k++){
			array[k] = (char*)malloc(sizeof(char)*(cols));
		}

		for(int k = 0;k<rows;k++){
			char string[cols];
			scanf("%s",string);
			for(int l =0;l<cols;l++){
				array[k][l] = string[l];
			}
		}

		int targets = 0;
		for(int c = 0;c<cols;c++){
			for(int r = rows-1;r>-1;r--){
				if(array[r][c] == '#') break;
				else if(array[r][c] == 'X') targets = targets+1;
				else continue;
			}
		}
		outputs[i] = targets;
	}

	for(int i=0;i<cases;i++){
		printf("%d\n",outputs[i]);
	}
}