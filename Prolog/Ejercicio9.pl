%Basado en el ejemplo de paises.pl visto en clase, complete la base de conocimientos 
%pais_superficie(P,A) con todos los países de latinoamérica y codifique las reglas 
%prolog que permitan encontrar el país de mayor superficie.

paisSuperficie(argentina,1000000).
paisSuperficie(chile,20000).
paisSuperficie(bolivia,500000).
paisSuperficie(paraguay,150000).
paisSuperficie(brasil,3000000).

prodCartesiano(X,Y):-
    paisSuperficie(_,X),
    paisSuperficie(_,Y).

seleccion(X,Y):-
    prodCartesiano(X,Y),
    X<Y.

todosMenosMayor(X):-
    seleccion(X,_).

mayor(X):-
    paisSuperficie(_,X),
    \+todosMenosMayor(X).
