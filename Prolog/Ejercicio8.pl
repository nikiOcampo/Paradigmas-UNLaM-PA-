%Modificar el programa del Ejercicio 01 (menú) para poder consultar cual es el
%menú completo que tiene menor cantidad de calorías (agregando las calorias como
%parte de la información de los hechos)

entrada(gazpacho,100).
entrada(consomé,230).

carne(filete_de_cerdo,500).
carne(pollo_asado,400).

pescado(trucha,300).
pescado(bacalao,600).

postre(flan,400).
postre(helado,800).
postre(pastel,900).

bebida(vino,350).
bebida(cerveza,700).
bebida(agua,0).


todosLosMenus(Entrada,Ppal,Postre,Calorias):-
    entrada(Entrada,CE),
    (carne(Ppal,CPP); pescado(Ppal,CPP)),
    postre(Postre,CP),
    Calorias is CE+CPP+CP.

prodCartesiano(X,Y):-
    todosLosMenus(_,_,_,X),
    todosLosMenus(_,_,_,Y).

seleccion(X,Y):-
    prodCartesiano(X,Y),
    X>Y.

%proyeccion
todosMenosMinimo(X):-
	seleccion(X,_).

minimo(X):-
    todosLosMenus(_,_,_,X),
    \+todosMenosMinimo(X).