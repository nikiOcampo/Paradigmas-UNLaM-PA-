%Una agencia matrimonial de los años '80 tiene un fichero de candidatos
%al matrimonio organizado según las declaraciones siguientes:

altura(alta).
altura(media).
altura(baja).

cabello(rubio).
cabello(castaño).
cabello(pelirrojo).
cabello(negro).

edad(joven).
edad(adulta).
edad(vieja).

musica(clasica).
musica(pop).
musica(jazz).

literatura(aventura).
literatura(ciencia-ficcion).
literatura(policiaca).

deporte(tenis).
deporte(natacion).
deporte(jogging).


hombre(N,A,C,E).
mujer(N,A,C,E).

%Donde N es el nombre de un hombre o una mujer, A su altura (alta, media, baja), 
%C el color de su cabello (rubio, castaño, pelirrojo, negro) y E su edad (joven,adulta,vieja).

gusta(N,M,L,S).

%Que indica que a la persona N le gusta el género de música M (clásica, pop, jazz),
%el género de literatura L (aventura, ciencia-ficción, policíaca), 
%y practica el deporte S (tenis, natación, jogging).

busca(N,A,C,E).

%Que expresa que la persona N busca una pareja de altura A, con cabello color C y edad E.

%Se considera que dos personas x e y de sexos diferentes son adecuadas si x conviene a y e
%y conviene a x. Se dice que x conviene a y si x conviene físicamente a y 
%(la altura, edad y color de cabello de y son los que busca x) y si, además,
%los gustos de x e y en música, literatura y deporte coinciden.

sonConvenientes(X,Y):-
    ((hombre(X,A,C,E),mujer(Y,A2,C2,E2));
    (mujer(X,A,C,E),hombre(Y,A2,C2,E2))),
    busca(X,A2,C2,E2),
    gusta(X,M,L,S),
    gusta(Y,M,L,S).