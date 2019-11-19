#include<stdio.h>

int rf[20],frame[10],frameSize,pageNum,first;

int check(int pos)
{
    for(int i=0;i<frameSize;i++)
    {
        if(rf[pos]==frame[i])
            return 1;
    }
    return -1;
}

int find(int a)
{
    int pos,min=100;
    if(first)
    {
        pos = frameSize - first;
        first--;
        return pos;
    }

    for(int i=0;i<frameSize;i++)
    {
        for(int j=a;j>=0;j--)
        {
            if(rf[j]==frame[i])
            {
                if(j<min)
                {
                    min=j;
                    pos=i;
                }
                break;
            }
        }
    }
    return pos;
}

int main()
{

    printf("Enter the number of pages : ");
    scanf("%d",&pageNum);

    printf("Enter the reference string : \n");

    for(int i=0;i<pageNum;i++)
        scanf("%d",&rf[i]);

    printf("Enter the frame size : ");
    scanf("%d",&frameSize);
    first=frameSize;

    for(int i=0;i<frameSize;i++)
    {
         frame[i]=-1;

    }

    int pageFault=0,pos;

    for(int i=0;i<pageNum;i++)
    {
        if(check(i)<0)
        {
            pos = find(i);
            frame[pos] = rf[i];
            pageFault++;
        }
    }

    printf("\nNumber of page faults : %d",pageFault);



    return 0;
}

