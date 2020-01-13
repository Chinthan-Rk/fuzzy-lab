%{
	#include<stdio.h>
	int is_simple=1;
%}
compound [ \t\n]([Aa][Nn][Dd]|[Oo][Rr]|[Bb][Uu][Tt])[ \t\n]
%%
{compound} {is_simple=0;}
. {}


%%
void main()
{
	printf("Enter a sentence : \n");
	yylex();
	if(is_simple==1)
		printf("Sentence is simple.\n");
	else
		printf("Sentence is compound.\n");
}
int yywrap()
{
	return 1;
}
