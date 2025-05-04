#include <stdio.h>
#include <string.h>

#define N 1000
#define start 500

typedef struct str {
    char tape[N];
    int head;
    int status;
} Tmashine;

void initTM(Tmashine *TM) {
    memset(TM->tape, ' ', N);
    TM->status = 0;

    int index = start;
    char sym = 0;
    printf("input numb (<x>-<y>) \n> ");
    while (sym != '\n') {
        sym = getchar();
        if (sym == '\n') {
            break;
        }
        TM->tape[index++] = sym;
    }

    TM->head = index;
}

void print(Tmashine *TM) {
    for (int i = 10; i > 0; i-- ) {
        printf("%c", TM->tape[start-i]);
    }
    for (int i = 0; i < 10; i++ ) {
        printf("%c", TM->tape[start+i]);
    }

    printf(" - state: %d\n", TM->status);
}


int main() {
    Tmashine TM;
    char *str = "123456789", current;
    initTM(&TM);
    

    while (TM.status != -1) {
        print(&TM);
        current = TM.tape[TM.head];
        
        switch (TM.status) {
            case 1:  // обработка числа справа b
                if (current == '-') {
                    TM.status = 5;
                    TM.head++;
                } else if (strchr(str, current)) {
                    TM.tape[TM.head]--;
                    TM.status = 2;
                    TM.head--;
                } else if (current == '0') {
                    TM.tape[TM.head] = '9';
                    TM.head--;
                }
                break;
            
            case 2: // переход к левому числу a
                if (current = ' ') {
                    TM.status = 5;
                    TM.head++;
                } else if (current == '-') {
                    TM.status = 3;
                    TM.head--;
                } else if (strchr(str, current)) {
                    TM.head--;
                }
                break;
            
            case 3: // обработка левого числа a
                if (current = ' ') {
                    TM.status = 5;
                    TM.head++;
                }
            case 4: // возврат к правому числу b
            case 5: // заверешние
            case 6:
 

    }
    return 0;

}