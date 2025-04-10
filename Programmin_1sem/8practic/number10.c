//10. Единицы выше и на главной диагонали


#include <stdio.h>
#include <malloc.h>

#define ROWS 5
#define COLS 5

int main()
{

    int **array;
    array = (int**) malloc(ROWS*sizeof(int*));

    for (int i = 0; i < ROWS; i++)
    {
        array[i] = (int*) malloc(COLS*sizeof(int));
        for (int j = 0; j < COLS; j++)
        {
            if (i <= j) {
                array[i][j] = 1;
            } else {
                array[i][j] = 0;
            }
            printf("\t%d", array[i][j]);
        }
        printf("\n");

    }

    free(array);
    return 0;
}