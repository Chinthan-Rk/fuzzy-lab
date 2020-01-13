%{
	#include<stdio.h>
	#include<stdlib.h>
	int pi=0,ni=0,pf=0,nf=0;
%}
%%
[+]?[0-9]+ {pi++;}
[-][0-9]+ {ni++;}
[+]?[0-9]+\.[0-9]+ {pf++;}
[-][0-9]+\.[0-9]+ {nf++;}
[\n] {}
%%
void main(int argc, char* argv[])
{
	if(argc!=2)
	{
		printf("Invalic arguments! Input filename missing.\n");
		exit(0);
	}
	yyin=fopen(argv[1],"r");
	yylex();
	printf("Positive integers : %d\nNegative integers : %d\n",pi,ni);
	printf("Positive fractions : %d\nNegative fraction : %d\n",pf,nf);
}
int yywrap()
{
	return 1;
}
