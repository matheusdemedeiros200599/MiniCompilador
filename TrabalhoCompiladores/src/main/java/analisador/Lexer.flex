//Importacoes

package analisador;
import static analisador.Token.*;

//Definicoes
%%
%public
%class Lexer
%type Token
L = [a-zA-Z_]
//D = [0-9]
D = [0-9]+ ("." [0-9]+)?
BRANCO= [ \t\r\n]
%{
public String lexema;
%}
%%

//Regras lexicas
{BRANCO} {/*Ignore*/}
"//".* {/*Ignore*/}
"<-" {return ATRIBUICAO;}
"=" {return COMPARACAO;}
"+" {return SOMA;}
"*" {return MULTIPLICACAO;}
"-" {return SUBTRACAO;}
"/" {return DIVISAO;}
"(" {return ABRE_PARENTESIS;}
")" {return FECHA_PARENTESIS;}
"[" {return ABRE_COLCHETES;}
"]" {return FECHA_COLCHETES;}
".." {return INTERVALO_VETOR;}
"\"" {return ASPAS;}
"," {return VIRGULA;}
":" {return TIPO;}
">" {return MAIOR;}
"<" {return MENOR;}
"<=" {return MENOR_IGUAL;}
">=" {return MAIOR_IGUAL;}

//Palavras reservadas do VisualG

"aleatorio" {return ALEATORIO;}
"algoritmo" {return ALGORITMO;}
"arquivo" {return ARQUIVO;}
"ate" {return ATE;}
"caractere" {return CARACTERE;}
"caso" {return CASO;}
"cronometro" {return CRONOMETRO;}
"debug" {return DEBUG;}
"e" {return E;}
"eco" {return ECO;}
"enquanto" {return ENQUANTO;}
"entao" {return ENTAO;}
"escolha" {return ESCOLHA;}
"escreva" {return ESCREVA;}
"escreval" {return ESCREVAL;}
"faca" {return FACA;}
"falso" {return FALSO;}
"fimalgoritmo" {return FIMALGORITMO;}
"fimenquanto" {return FIMENQUANTO;}
"fimescolha" {return FIMESCOLHA;}
"fimfuncao" {return FIMFUNCAO;}
"fimpara" {return FIMPARA;}
"fimprocedimento" {return FIMPROCEDIMENTO;}
"fimrepita" {return FIMREPITA;}
"fimse" {return FIMSE;}
"funcao" {return FUNCAO;}
"inicio" {return INICIO;}
"int" {return INT;}
"inteiro" {return INTEIRO;}
"interrompa" {return INTERROMPA;}
"leia" {return LEIA;}
"limpatela" {return LIMPATELA;}
"logico" {return LOGICO;}
"mod" {return MOD;}
"nao" {return NAO;}
"ou" {return OU;}
"outrocaso" {return OUTROCASO;}
"para" {return PARA;}
"passo" {return PASSO;}
"pausa" {return PAUSA;}
"real" {return REAL;}
"procedimento" {return PROCEDIMENTO;}
"repita" {return REPITA;}
"retorne" {return RETORNE;}
"se" {return SE;}
"senao" {return SENAO;}
"timer" {return TIMER;}
"var" {return VAR;}
"vetor" {return VETOR;}
"verdadeiro" {return VERDADEIRO;}
"Xou" {return XOU;}
"de" {return DE;}


{L}({L}|{D})* {lexema=yytext(); return ID;}
//("(-"{D}")")|{D}+ {lexema=yytext(); return NUM_INTEIRO;}
("-"{D})| ("+"{D})| {D} {lexema=yytext(); return NUM;}
