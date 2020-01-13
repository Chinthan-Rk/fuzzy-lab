%{ 
	#include<stdio.h>
	int id=0;
%}
%%
[_a-zA-Z][a-z_A-Z0-9]* {id++; printf("%s\n",yytext);}
.+ {}
[\n] {}
%%
void main(int argc, char* argv[])
{
	if(argc!=2)
	{
		printf("Invalid arguments.! ");
		exit(0);
	}
	yyin=fopen(argv[1],"r");
	yylex();
	printf("\nNumber of identifiers : %d\n",id);
}
int yywrap()
{
	return 1;
}
