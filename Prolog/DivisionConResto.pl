%Idem 6, pero que permita obtener el cociente y el resto. Definir la relación mcd(X,Y,Z) 
%que se verifique si Z es el máximo común divisor entre X e Y. Por ejemplo:

%mcd(10,15,X).
%> X = 5

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
