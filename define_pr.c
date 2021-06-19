#include<stdio.h>
#define max 2
enum bird{sparrow=max+1,parrot=sparrow+max};
int main()
{
    enum bird b=parrot;
    printf("%d",b);
    return 0;
}