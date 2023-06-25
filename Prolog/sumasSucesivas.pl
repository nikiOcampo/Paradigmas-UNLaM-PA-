%4-Codifique en prolog las reglas necesarias para obtener el producto de dos numeros X e Y,
% aplicando sumas sucesivas.

multiplicar(1,X,X):-!.
multiplicar(0,_,0):-!.
multiplicar(X,1,X):-!.
multiplicar(_,0,0):-!.
multiplicar(X,Y,R):-
    X>1,Y>1,
    X2 is X-1,
    multiplicar(X2,Y,RR),
    R is Y+RR.