grammar SmallBasic;

s : comandos* 
    | funcion*;

comandos : condicional
    | para
    | mientras
    | interna
    | declaracion
    | llamado
    | goto
    | etiqueta ;

condicional: TKN_IF '(' expr ')' TKN_THEN comandos* sinosi sino TKN_ENDIF;
sinosi : TKN_ELSEIF '(' expr ')' TKN_THEN comandos* sinosi | ;
sino : TKN_ELSE comandos* | ;

para : TKN_FOR declaracion TKN_TO expr step comandos* TKN_ENDFOR;
step : TKN_STEP arit | ;

mientras : TKN_WHILE '(' expr ')' comandos* TKN_ENDWHILE;

funcion : TKN_SUB ID comandos* TKN_ENDSUB;

declaracion : id '=' expr;

id : ID ('['expr ']')*;

llamado : ID '(' ')';

interna : PR '.' ID '(' parametros ')';

parametros : expr parametros2 | ;
parametros2 : ',' parametros | ;

etiqueta : ID ':';
goto : TKN_GOTO ID;

expr : expr 'Or' expr2 
    | expr2;
expr2 : expr2 'And' expr3 | expr3;
expr3 : arit RELOP arit | arit;
arit : arit OPSUM arit2 | arit2;
arit2 : arit2 OPMUL arit3 | arit3;
arit3 : TKN_MINUS arit4 | arit4;
arit4 : TEXT |  NUM 
    | VERDADERO 
    | FALSO 
    | id
    | interna 
    | '(' expr ')' ;

COMENTARIO : '\''(~[\n])* -> skip;
ESP : [ \t\r\n]+ -> skip ;



PR : TKN_ARRAY 
    | TKN_TEXTWINDOW
    | TKN_PROGRAM
    | TKN_STACK ;

RELOP : '<'
    | '>'
    | '<>'
    | '='
    | '<='
    | '>=' ;
OPSUM : '+' | '-';
OPMUL : '*' | '/';

TKN_FOR : 'For';
TKN_TO : 'To';
TKN_STEP : 'Step';
TKN_ENDFOR : 'EndFor';
TKN_WHILE : 'While';
TKN_ENDWHILE : 'EndWhile';
TKN_IF : 'If';
TKN_THEN : 'Then';
TKN_ELSE : 'Else';
TKN_ELSEIF : 'ElseIf';
TKN_ENDIF : 'EndIf';
TKN_SUB : 'Sub';
TKN_ENDSUB : 'EndSub';
TKN_GOTO : 'Goto';
TKN_ARRAY : 'Array';
TKN_TEXTWINDOW : 'TextWindow';
TKN_PROGRAM : 'Program';
TKN_STACK: 'Stack';
TKN_MINUS : '-';
ID : [a-zA-ZÑñÁÉÍÓÚáéíóúÜüÇç]([a-zA-ZÑñÁÉÍÓÚáéíóúÜüÇç_0-9]*);
VERDADERO : '"'([Tt][Rr][Uu][Ee])'"';
FALSO : '"'([Ff][Aa][Ll][Ss][Ee])'"';
NUM : [0-9]+('.'[0-9]*)?;
//{"52tkn_number", L"[0-9]+"},
TEXT: '"'(~["']*)'"';