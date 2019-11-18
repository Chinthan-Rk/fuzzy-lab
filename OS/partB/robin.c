#include <stdio.h>
#include <stdlib.h>

struct process
{
    int wt,tt,bt,rembt;
}p[10];

int main()
{
    printf("Enter the number of process : ");
    int pNum;
    scanf("%d",&pNum);

    for(int i=0;i<pNum;i++)
    {
        printf("Enter the burst time for process %d : ",i+1);
        scanf("%d",&p[i].bt);
        p[i].rembt = p[i].bt;
    }

    printf("Enter the time quantum : ");
    int tq;
    scanf("%d",&tq);


    int totalTT=0,totalWT=0,flag=0,time=0;

    while(!flag)
    {
        flag=1;

        for(int i=0;i<pNum;i++)
        {

            if(p[i].rembt>0)
            {
             flag=0;

            if(p[i].rembt>tq)
            {
                time = time +tq;
                p[i].rembt -= tq;
            }
            else
            {
                time = time + p[i].rembt;
                p[i].rembt = 0;
                p[i].tt = time;
                totalTT+=time;

                p[i].wt = p[i].tt - p[i].bt;
                totalWT += p[i].wt;

            }
            }
        }
    }

    printf("\nTotal Turnaround Time : %d",totalTT);
    printf("\nAverage Turnaround Time : %d",(totalTT/pNum));
    printf("\nTotal Waiting Time : %d",totalWT);
    printf("\nAverage Waiting Time : %d",(totalWT/pNum));

    return 0;
}
