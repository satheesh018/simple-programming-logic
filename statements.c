#include<stdio.h>
int main()
{
int y=0,x=0,z=0;
y=y+1;
z=x+y;
x=x+1;
printf("%d %d %d \n",x,y,z);
// above program interms of increment and decrement
int a=0,b=0,c=0;
c= (a++) + (++b);
printf("%d %d %d",a,b,c);

    return 0;
}