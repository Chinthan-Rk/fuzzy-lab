%{
	#include<stdio.h>
	#include<stdlib.h>
	int vow=0,cons=0;
%}
%%
[aeiouAEIOU] {vow++;}
[a-zA-Z] {cons++;}
[^a-zA-Z] {}
%%
void main()
{
	printf("Enter a string :\n");
	yylex();
	printf("Count of vowels : %d\nCount of Consonants : %d\n",vow,cons);
}
int yywrap()
{
	return 1;
}
