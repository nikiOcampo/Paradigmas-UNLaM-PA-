%Se dispone de un listado con los resultados de los parciales de los
%alumnos del curso de Paradigmas de Programación, organizado de la siguiente manera:
%Se dispone de las notas de ambos parciales para todos los alumnos.

parcial1(ana,7).
parcial1(juan,4).
parcial1(julio, 10).
parcial1(maria, 10).
parcial1(lucas,5).
parcial1(facu,8).
parcial1(milos, 2).
parcial1(mateo, 10).

parcial2(ana,9).
parcial2(juan,8).
parcial2(julio, 10).
parcial2(maria, 2).
parcial2(lucas,5).
parcial2(facu,8).
parcial2(milos, 4).
parcial2(mateo, 9).


%Se desea obtener:
%1. a. El listado de los alumnos que promocionan la materia
%b. El mismo listado pero esta vez incluyendo la nota final (promedio de los dos parciales)
%para cada uno 
%

promocionado(X):-
    parcial1(X,Nota1),
    parcial2(X,Nota2),
    Nota1>=7, Nota2>=7.
promocionadoConNota(X,Nota):-
    promocionado(X),
    parcial1(X,Nota1),
    parcial2(X,Nota2),
    Nota is (Nota1+Nota2)/2.


%2. El listado de los alumnos que recursan la materia.
recursa(X):-
    parcial1(X,Nota1),
    parcial2(X,Nota2),
   	(Nota1<4;Nota2<4).

%3. El listado de los alumnos que obtendrán la cursada.
%

cursada(X):-
    parcial1(X,Nota1),
    parcial2(X,Nota2),
   	((Nota1>=4,Nota1<7),(Nota2>=4,Nota2<7)).

cursada2(X):-
    parcial1(X,_),
    \+promocionadoConNota(X,_),
    \+recursa(X).


%4. A fin de entregar la medalla al mérito, encontrar de aquellos que promocionan (1b),
%el o los alumnos con mayor nota final (nombre y nota) 

prodCartesiano(X,Y):-
    promocionadoConNota(_,X),
    promocionadoConNota(_,Y).

seleccion(X,Y):-
    prodCartesiano(X,Y),
    X<Y.

proyeccion(X):- %todos menos el maximo
    seleccion(X,_).
 
restaSubconjuntos(X):- %maximo
    promocionadoConNota(_,X),
    \+proyeccion(X).

%
%5. Ahora se desea obtener cuales fueron las dos notas más altas,
%considerando simplemente a la nota como el promedio de la nota de parcial1 y parcial2. 
%Solo interesan los números. Un tip es pensar la resolución en dos etapas, 
%la más alta, y después la más alta de lo restante


prodCartesiano2(X,Y):-
    proyeccion(X),
    proyeccion(Y).

seleccion2(X,Y):-
    prodCartesiano2(X,Y),
    X<Y.

proyeccion2(X):-
    seleccion2(X,_).

restaSubconjuntos2(X):-
    promocionadoConNota(_,X),
    \+proyeccion2(X).
