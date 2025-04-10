#include <stdio.h>


int main()
{
  float PI=3.14159,*p1,*p2;
  p1=p2=&PI;
  printf("По адресу p1=%p хранится *p1=%g\n",p1,*p1);
  printf("По адресу p2=%p хранится *p2=%g\n",p2,*p2);
  return 0;
}

/*
1. Не хватает включения заголовочного файла <stdio.h> 
2. Также нужно добавить return ; для правильной работы функции.
*/

/*
Сначала объявляется и определяется переменная типа float PI,
затем объявляются указатели на тип float p1, p2.
Далее идет присваивание указателям p1, p2 адреса PI.

printf() выводит данные.
 */