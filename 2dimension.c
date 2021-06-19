#include<stdio.h>
#include<string.h>
void main()
{
    int n;
    char a[15][15],temp[15];
    printf("enter a total no of names");
    scanf("%d",&n);
    printf("enter your names");
    for(int i=0;i<n;i++)
    {
        scanf("%s",&a[i]);
    }
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(strcmp(a[i],a[j]))
            {
                strcpy(temp,a[i]);
                strcpy(a[i],a[j]);
                strcpy(a[j],temp);
            }
        }
    }
    for(int i=0;i<n;i++)
    {
        printf("%s\t",a[i]);
    }

}