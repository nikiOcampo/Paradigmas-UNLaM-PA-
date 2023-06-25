%Define un predicado mcm(X,Y,M) que signifique "M es el mínimo común múltiplo de X e Y"

% Predicado para calcular el MCM de dos números
mcm(A, B, MCM) :-
    mcm(A, B, A, B, MCM).

% Caso base: Si los dos números son iguales, el MCM es ese número
mcm(_, _, Num, Num, Num).

% Caso recursivo: Si el primer número es menor que el segundo, se incrementa en 
% el valor del primer número
mcm(A, B, Num1, Num2, MCM) :-
    Num1 < Num2,
    NumNuevo is Num1 + A,
    mcm(A, B, NumNuevo, Num2, MCM).

% Caso recursivo: Si el segundo número es menor que el primero,
% se incrementa en el valor del segundo número
mcm(A, B, Num1, Num2, MCM) :-
    Num2 < Num1,
    NumNuevo is Num2 + B,
    mcm(A, B, Num1, NumNuevo, MCM).