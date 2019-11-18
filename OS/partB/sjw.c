#include<stdlib.h>
#include<stdio.h>

struct process
{

    int tt,bt,wt;
}p[10],q;


int main()
{
    printf("Enter the number of process : ");
    int pidN;
    scanf("%d",&pidN);

    for(int i=0;i<pidN;i++)
    {

        printf("\nEnter the burst time of process %d : ",i+1);
        scanf("%d",&p[i].bt);
    }

    for( int i=0;i<pidN;i++)
    {

        for(int j=0;j<pidN - i - 1;j++)
        {

            if(p[j].bt > p[j+1].bt)
            {
                q.bt = p[j].bt;
                p[j].bt = p[j+1].bt;
                p[j+1].bt = q.bt;
            }
        }
    }

    p[0].wt = 0;
    p[0].tt = p[0].bt;

    int totalT = p[0].tt;
    int waitingT = p[0].wt;



    for( int i=1;i<pidN;i++)
    {

        p[i].wt = p[i-1].tt;
        p[i].tt = p[i].bt + p[i].wt;

        totalT+= p[i].tt;
        waitingT+= p[i].wt;
    }

    printf("\nTotal Turnaround Time : %d ",totalT);
    printf("\nAverage Turnaround Time : %d",(totalT/pidN));

    printf("\nTotal Waiting Time : %d",waitingT);
    printf("\nAverage Waiting Time : %d",(waitingT/pidN));




    return 0;
}
