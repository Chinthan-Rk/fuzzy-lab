%{
#include<stdio.h>
%}
%token ID TYPE SC NL COMMA
%%
start:TYPE varlist SC NL {printf("valid\n");return 0;}
;
varlist:varlist COMMA ID|ID;
%%
void yyerror(const char *str){printf("error");}
int yywrap(){return 0;}
int main(){
printf("Enter statement :\n");
yyparse();} 
