#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("Enter the buffer size : ");
    int bufferSize;
    scanf("%d",&bufferSize);
    int buffer[bufferSize];
    int in=0,out=0,item=0;
    int choice;
    do
    {
        printf("1.Produce\n2.Consume\n3.Exit\nEnter your choice : ");

        scanf("%d",&choice);



        switch(choice)
        {
        case 1:
                if(item == bufferSize)
                    printf("Buffer is full !");
                else
                {
                    item++;
                    printf("Enter value : ");
                    int val;
                    scanf("%d",&val);
                    buffer[in] = val;
                    in = (in+1)%bufferSize;
                }
                break;
        case 2:
                if(item == 0)
                    printf("The buffer is empty !");
                else
                {
                    int val = buffer[out];
                    printf("Consumed value : %d",val);
                    out = (out+1)%bufferSize;
                    item--;
                }
                break;


        }


    }while(choice!=3);

    return 0;
}
