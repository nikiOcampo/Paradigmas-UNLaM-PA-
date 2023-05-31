%Una agencia de viajes propone a sus clientes viajes de una o dos semanas a Roma, Londres o Túnez. 
%El catálogo de la agencia contiene, para cada destino, 
%el precio del transporte (con independencia de la duración) 
%y el precio de una semana de estancia que varía según el destino 
%y el nivel de comodidad elegidos: hotel, hostal o camping.
%
%
%Escribir el conjunto de declaraciones que describen este catálogo (se muestra a continuación).

ciudad(roma).
ciudad(londres).
ciudad(tunez).

estancia(hotel).
estancia(hostal).
estancia(camping).



transporte(roma,20). %CIUDAD Y PRECIO
transporte(londres,30).
transporte(tunez,10).

alojamiento(roma,hotel,50). % ciudad, comodidad, precioXSemana
alojamiento(roma,hostal,30).
alojamiento(roma,camping,10).
alojamiento(londres,hotel,60).
alojamiento(londres,hostal,40).
alojamiento(londres,camping,20).
alojamiento(tunez,hotel,40).
alojamiento(tunez,hostal,20).
alojamiento(tunez,camping,5).

%Expresar la relación viaje(C,S,H,P) que se interpreta por: 
%"el viaje a la ciudad C durante S semanas con estancia en H cuesta P pesos"

%viaje(C,S,H,P):-
    %alojamiento(C,H, precio),
	%transporte(C, precioTransporte),
	%ciudad(C),
	%S,
	%estancia(H),
	%(P*S + precioTransporte).

viaje(C,S,H,P):-
    transporte(C, P_transporte),
    alojamiento(C, H, P_alojamiento_por_semana),
    P is P_transporte + S * P_alojamiento_por_semana.
	%var(S), %si es una free variable
	%P is P_transporte + S * P_alojamiento_por_semana.
    %\var(S) si no es free variable
    %P is P_transporte + S * P_alojamiento_por_semana.
    

%Completar con viajeeconomico(C,S,H,P,Pmax) que expresa 
%que el costo P es menor que Pmax pesos.
viajeeconomico(C,S,H,Pmax):-
    viaje(C,S,H,P),
    P < Pmax.