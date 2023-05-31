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

%¿Cuáles son los menús que ofrece el restaurante?
%¿Cuáles son los menús que tienen Consomé en las entradas?
%¿Cuáles son los menús que no contienen flan como postre?

%Las siguientes clausulas corresponden al programa "menú" de un restaurante. 
%El restaurante ofrece menús completos compuestos por una entrada, un plato principal y un postre.
%El plato principal puede ser carne o pescado.

menuOfrecido(Entrada,Principal,Postre):-
    entrada(Entrada), 
    (carne(Principal);
    pescado(Principal)),
    postre(Postre).

menu_consome(X,Y,Z):-
    X== consomé,
    menuOfrecido(X,Y,Z).


noFlan(X,Y,Z):-
    menuOfrecido(X,Y,Z),
    Z \== flan.

%Ejercicio 2
%Completar el programa "menú" de manera que una comida esté formada también por la elección de una bebida, 
%a elegir entre vino, cerveza o agua mineral.

bebida(vino).
bebida(cerveza).
bebida(agua_mineral).

menuConBebida(Entrada,Principal,Postre,Bebida):-
    menuOfrecido(Entrada,Principal,Postre),
    bebida(Bebida).