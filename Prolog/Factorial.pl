%3-Codifique en prolog las reglas necesarias para obtener el factorial de un número natural N.

factorial(0,0):-!.
factorial(1,1):-!.
factorial(N,R):-
   % N>1,
    N1 is N-1,
    factorial(N1,RR),
    R is N*RR.