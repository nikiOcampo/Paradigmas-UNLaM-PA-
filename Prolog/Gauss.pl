%Codifique en prolog las reglas necesarias para obtener la potencia N de un numero X 
%aplicando multiplicaciones sucesivas.

multiplicar(_,0,0). 
multiplicar(A,1,A).
multiplicar(X,N,R):-
    N>1,
    N1 is N-1,
    multiplicar(X,N1,RR),
    R is X + RR.

%1-Codifique en prolog las reglas necesarias para obtener el término N en la serie de Gauss
gauss(0,0).
gauss(1,1).
gauss(N,R):-
	N>1,
    N1 is N-1,
    gauss(N1,RR),
    R is N+RR.