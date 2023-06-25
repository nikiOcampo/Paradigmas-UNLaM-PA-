%Las siguientes clausulas corresponden al programa "menú" de un restaurante. 
%El restaurante ofrece menús completos compuestos por una entrada, 
%un plato principal y un postre. El plato principal puede ser carne o pescado.

entrada(paella).
entrada(gazpacho).
entrada(consomé).

carne(filete_de_cerdo).
carne(pollo_asado).

pescado(trucha).
pescado(bacalao).

postre(flan).
postre(helado).
postre(pastel).

bebida(vino).
bebida(cerveza).
bebida(agua).


%Implementar las reglas necesarias para formular las siguientes consultas en Prolog:

%¿Cuáles son los menús que ofrece el restaurante?
%¿Cuáles son los menús que tienen Consomé en las entradas?
%¿Cuáles son los menús que no contienen flan como postre?

menuOfrecido(Entrada,Ppal,Postre):-
    entrada(Entrada),
    (carne(Ppal); pescado(Ppal)),
    postre(Postre).


menu_consome(Y,Z):-
    X=consomé,
    menuOfrecido(X,Y,Z).

menuNoFlan(X,Y,Z):-
    menuOfrecido(X,Y,Z),
    Z\==flan.

menuConBebida(X,Y,Z,W):-
    menuOfrecido(X,Y,Z),
    bebida(W).



################ejercicio7##########################

%menuOfrecido(E,PP,P), !.  %TRAE UNICAMENTE LA PRIMERA COMBINACION
%menuOfrecido(E,PP,P), pescado(PP), !.% TRAE UNICAMENTE LA PRIMERA COMBINACION PERO CON PESCADO
%menu(E,PP,P), !, pescado(PP).