#include<stdio.h>
#include<stdlib.h>

int pNum,rNum,max[20][20],allocated[20][20],need[20][20],available[20],sequence[20];
int work[20],finish[20],z=0;


int checkNeed(int a)
{
    for(int i=0;i<rNum;i++)
    {
        if(need[a][i]>available[i])
            return -1;
    }
    return 1;
}


void input()
{
    printf("Enter the number of process : ");
    scanf("%d",&pNum);

    printf("Enter the number of resources : ");
    scanf("%d",&rNum);

    printf("Enter the allocated matrix \n");
    for( int i=0;i<pNum;i++)
    {
        for(int j=0;j<rNum;j++)
            scanf("%d",&allocated[i][j]);
    }

    printf("Enter the max matrix :\n ");
    for( int i=0;i<pNum;i++)
    {
        for(int j=0;j<rNum;j++)
            scanf("%d",&max[i][j]);
    }

    printf("Enter the resource matrix\n ");
    for(int i=0;i<rNum;i++)
    {
         scanf("%d",&available[i]);
         work[i]=-1;
    }

    for( int i=0;i<pNum;i++)
    {
        for(int j=0;j<rNum;j++)
            need[i][j]=max[i][j] - allocated[i][j];
    }

    for(int i=0;i<pNum;i++)
        finish[i]=0;
}

void method()
{
    int i=0,pCheck,flag;

    while(1)
    {
        if(finish[i]==0)
        {
            pCheck=checkNeed(i);
            if(pCheck!=-1)
            {
                finish[i]=1;
                sequence[z++]=i;
                for(int j=0;j<rNum;j++)
                    available[j]+=allocated[i][j];
            }
        }
        i++;

        if(i==pNum)
        {
            flag=0;
            for(int i=0;i<rNum;i++)
                if(available[i]!=work[i])
                flag=1;
            for(int i=0;i<rNum;i++)
                work[i]=available[i];
            if(flag)
                i=0;
            else
                break;

        }
    }
}


void display()
{
    int flag=0;
    for(int i=0;i<pNum;i++)
        {
            if(finish[i]==0)
                flag=1;
        }

    if(flag==0)
    {
        printf("State safe ");
        for(int i=0;i<pNum;i++)
            printf("P%d  ",sequence[i]);
    }

}


int main()
{

    for(int i=0;i<20;i++)
        for(int j=0;j<20;j++)
    {
        allocated[i][j]=0;
        max[i][j]=0;
        available[i]=0;
        need[i][j]=0;
        finish[i]=0;
        sequence[i]=0;
        work[i]=0;

    }
    input();
    method();
    display();

    return 0;
}
