#include <stdio.h>
#include <stdlib.h>

struct process
{
    int pid ,tt,bt,wt;
}p[10];

int main()
{
    printf("\nEnter the number of process : ");
    int pidN;
    int totalTT=0,waitingT=0;

    scanf("%d",&pidN);

    for(int i=0;i<pidN;i++)
   {
       printf("\nEnter the burst time of process %d : ",i+1);
       scanf("%d",&p[i].bt);
   }



   p[0].wt=0;
   p[0].tt=p[0].bt;


   for(int i=1;i<pidN;i++)
   {
       p[i].wt=p[i-1].tt;
       p[i].tt=p[i].wt+p[i].bt;


   }

   for(int i=0;i<pidN;i++)
   {
        printf("%d\t%d\t%d\n",p[i].bt,p[i].wt,p[i].tt);
        totalTT = totalTT + p[i].tt;
        waitingT = waitingT + p[i].wt;
   }

   printf("Total turnaround time : %d\n",totalTT);
   printf("Total waiting time : %d\n",waitingT);

   totalTT /=pidN;
   waitingT/=pidN;

   printf("Average turnaround time : %d\n",totalTT);
   printf("Average waiting time : %d\n",waitingT);

    return 0;
}
