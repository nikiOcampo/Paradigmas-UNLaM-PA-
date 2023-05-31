%Hechos
%animal(perro). %perro --> atom
%animal(gato).
%animal(elefante).
%todo lo escrito con mayuscula es una variable
%Animales --> variable
%ejercicio0:
limita(argentina,brasil).
limita(argentina,uruguay).
limita(argentina,paraguay).
limita(argentina,bolivia).
limita(argentina,chile).
limita(chile,peru).
limita(bolivia,peru).
limita(bolivia,brasil).
limita(bolivia,paraguay).
limita(paraguay,brasil).
limita(brasil,uruguay).
limita(brasil,peru).
limita(brasil,colombia).
limita(brasil,venezuela).
limita(brasil,guyana).

%Predicados de control
% , and
% ; or
% \+ not

%Comparaciones
% == da verdadero si ambos terminos son iguales
% \== da falso si ambos terminos son iguales
% @< menor
% @> mayor

%NUMERO Y ARITMETICA

%comparaciones aritmeticas
% >
% >=
% <
% =<
% =:= evalua y compara las expresiones
% =\= evalua y comapra las expresiones negativamente
% is unifica luego de evaluar (X is 2+2-- X=4)

%Unificaciones
% = unifica dos valores
% \= unifica dos valores y les agregar un not
% 

% Operaciones aritmeticas
% +
% -
% *
% /

% Operaciones aritmeticas unarias
% +
% -
%
%


%Reglas
limita_con(Pais1,Pais2):-
    limita(Pais1,Pais2);
    limita(Pais2,Pais1).

translimita_con(P1,P2):- %tbm se pude agregar PIntermedio aca si necesitamos ver esa variable
    limita_con(P1,PIntermedio),
    limita_con(PIntermedio,P2),
    \+limita_con(P1,P2),
    P1 \== P2.