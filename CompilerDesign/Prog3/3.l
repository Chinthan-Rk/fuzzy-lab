%{
	#include<stdio.h>
	#include<stdlib.h>
	int cc=0,wc=0,lc=0,sc=0;
%}
word [^ \t\n\.:]
blank [ ]
newline [\n]
%%
{word}+ {wc++; cc=cc+yyleng;}
{blank} {sc++;}
{newline} {lc++;}
%%
void main(int argc, char **argv)
{
	if(argc!=2)
	{
		printf("Invalid argumnets! Input filename missing.\n");
		exit(0);
	}
	yyin=fopen(argv[1],"r");
	yylex();
	printf("Lines : %d\tWords : %d\tCharacters : %d\t\tSpaces : %d\n",lc,wc,cc,sc);
}
int yywrap()
{
	return 1;
}
