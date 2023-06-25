%Definir la relación mcd(X,Y,Z) que se verifique si Z es el máximo común divisor entre X e Y.

dividirConResto(X,1,X,0):-!.
dividirConResto(_,0,0,0):-!.
dividirConResto(X,X,1,0):-!.

dividirConResto(X,Y,0,X):-
    X<Y.
dividirConResto(X,Y,R,Resto):-
    X>=Y,
    X1 is X-Y,
    dividirConResto(X1,Y,RR,NR),
    R is RR + 1,
    Resto is NR.


mcd(X,X,X):-!.
mcd(_,1,1):-!.
mcd(1,_,1):-!.
mcd(X,0,X):-!.
mcd(X,Y,Z):-
   dividirConResto(X,Y,_,RESTO),
   Z1 is RESTO,
   mcd(Y,Z1,Z).
   
%mcd(X, Y, Result) :- 
%    X > Y, % Caso recursivo 1: X es mayor que Y
%    X1 is X - Y,
%    mcd(X1, Y, Result).
    
%mcd(X, Y, Result) :- 
%    X < Y, % Caso recursivo 2: X es menor que Y
 %   mcd(Y, X, Result).