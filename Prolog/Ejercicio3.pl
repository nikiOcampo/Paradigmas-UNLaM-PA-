%El árbol genealógico siguiente se describe con el programa Prolog:

hombre(pedro) .
hombre(manuel) .
hombre(arturo) .
mujer(maría).
padre(pedro, manuel).
padre(pedro, arturo).
padre(pedro, maría) .
%A partir de estas afirmaciones, formular las reglas generales de:

%niño(X,Y) % expresa que X es hijo o hija de Y.
%hijo(X,Y) % expresa que X es un hijo varón de Y.
%hija(x,y) % expresa que X es una hija de Y.
%hermano-o-hermana(X,Y) % expresa que X es hermano o hermana de Y.
%hermano(X,Y) % expresa que X es un hermano de Y.
%hermana(X,Y) % expresa que X es una hermana de Y.


niño(X,Y):-
    padre(Y,X).

hijo(X,Y):-
    niño(X,Y),
    hombre(X).

hija(X,Y):-
    niño(X,Y),
    mujer(X).

hermanoOhermana(X,Y):-
    niño(X,Z),
    niño(Y,Z),
    X \== Z.

hermano(X,Y):-
    niño(Y,Z),
    hijo(X,Z),
    Y \== X.

hermana(X,Y):-
    niño(Y,Z),
    hija(X,Z),
    Y \== X.