#include <stdio.h>

int ref[100],n,frame[10],nf,free;

int check(int page)
{
    int i;
    for(i = 0; i < nf; i++)
        if( frame[i] == page)
            return i;
    return -1;
}

int find(int p)
{
    int i,j,max=-1,pos;

    if(free)
    {
        pos = nf - free;
        free--;
        return pos;
    }

    for(i = 0; i < nf; i++)
    {
        for(j = p; j < n; j++)
        {
            if(ref[j] == frame[i])
            {
                if( j > max )
                {
                    max = j;
                    pos = i;
                }
                break;
            }
            if(j == n - 1)
                return i;
        }

    }
    return pos;
}


int main()
{
    int i,j,pf=0;

    printf("Enter length of reference string: ");
    scanf("%d",&n);
    printf("Enter reference string: ");
    for(i = 0; i < n; i++)
        scanf("%d",&ref[i]);

    printf("Enter no. of frames: ");
    scanf("%d",&nf);
    free = nf;
    for(i = 0; i < nf; i++)
        frame[i] = -1;
    int pos,flag;
    for(i = 0; i < n; i++)
    {
        flag = 0;
        if(check(ref[i]) < 0)
        {
            pos = find(i);
            frame[pos] = ref[i];
            pf++;
            flag = 1;
        }


    }

    printf("Total page faults: %d\n",pf);
}
