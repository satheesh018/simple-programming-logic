#include<stdio.h>
int main()
{
    int a=12,b=34;
    a+=b-=a;
    printf("%d %d",a,b);
    return 0;
}