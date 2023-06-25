%2-Codifique en prolog las reglas necesarias para obtener el término N en la serie de
% Fibonacci (sin, y con mejora)

fibonacci(0,0).
fibonacci(1,1).
fibonacci(N,R):-
    N>1,
    N1 is N-1,
    N2 is N - 2,
    fibonacci(N1,RA),
    fibonacci(N2,RAA),
    R is RA + RAA.

% con mejora
fib(0,0,0).
fib(1,1,0).
fib(N,R,RA):- %RA=R ANTERIOR
    N > 1,
    NA is N - 1,
    % NAA is N - 2,
    fib(NA, RA, RAA),
    % fibonacci(NAA,RAA,RAAA),
    R is RA + RAA.

fib(N,R):-
    fib(N,R,_).