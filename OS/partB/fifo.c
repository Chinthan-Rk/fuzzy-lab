#include <stdio.h>
#include <stdlib.h>

int main()
{
    int pageNum,ref[30],frame[10],frameSize,pointer=0,totalMiss=0,found=0;

    printf("Enter the number of pages : ");
    scanf("%d",&pageNum);

    printf("Enter the reference string : ");
    for(int i=0;i<pageNum;i++)
        scanf("%d",&ref[i]);

    printf("Enter the frame size : ");
    scanf("%d",&frameSize);

    for(int i=0;i<frameSize;i++) // initialize frame with -1
        frame[i]=-1;

    for(int i=0;i<pageNum;i++)
    {
        found=0;
        for(int j=0;j<frameSize;j++)
        {
            if(ref[i]==frame[j])
            {
                found=1;
                break;
            }
        }

        if(!found)
        {
            frame[pointer]=ref[i];
            pointer = (pointer+1)%frameSize;
            totalMiss++;
        }
    }

    printf("Number of page faults : %d",totalMiss);


    return 0;
}
