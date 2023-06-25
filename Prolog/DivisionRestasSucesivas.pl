%Codifique en prolog las reglas necesarias para obtener la el cociente entre dos
%números a partir de restas sucesivas.

dividir(X,1,X):-!.
dividir(_,0,0):-!.
dividir(X,X,1):-!.
dividir(X,Y,0):-
    X<Y,!.
dividir(X,Y,R):-
    X>=Y,
    X1 is X-Y,
    dividir(X1,Y,RR),
    R is RR + 1.