%Codifique en prolog las reglas necesarias para obtener la potencia N de un numero X
%aplicando multiplicaciones sucesivas.

potencia(_,0,1):-!.
potencia(A,1,A):-!.
potencia(1,_,1):-!.
potencia(N,E,R):-
    E2 is E -1,
    potencia(N,E2,RR),
    R is N * RR.