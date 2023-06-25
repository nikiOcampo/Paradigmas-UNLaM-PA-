%Dado el listado de vendedores y ventas semestrales se desea obtener el listado 
%anual de comisiones. Las comisiones se liquidan de la siguiente manera:

% 20% del total vendido en el año para aquellos vendedores que hayan tenido ventas 
%en ambos semestres y cada una de ellas supera los $ 20000.
% 10% del total vendido en el año para aquellos vendedores que hayan tenido ventas
%en ambos semestres, pero no superan los $ 20000 en alguno de estos.
% 5% del total vendido para los vendedores que no registran ventas en algún semestre
%Se dispone de los siguientes datos:

ventas1erSem(milos, 10000).
ventas1erSem(lautaro, 12000).
ventas1erSem(fede, 15000).
ventas1erSem(franco, 30000).
ventas1erSem(facundo, 8000).
ventas1erSem(lucas, 2500).
ventas1erSem(maria, 2100).
ventas1erSem(monica, 5000).


ventas2doSem(milos, 15000).
ventas2doSem(lautaro, 5000).
ventas2doSem(facundo, 15000).
ventas2doSem(maria, 10000).
ventas2doSem(monica, 15000).

%Nota: No todos los vendedores venden en ambos semestres, todos los importes son mayores
%que cero. En caso de no registrarse ventas en algún semestre, no figura la regla 
%correspondiente para ese vendedor.

descuento20(Vendedor, ImporteFinal):-
    ventas1erSem(Vendedor,Importe1),
    ventas2doSem(Vendedor,Importe2),
    (Importe1+Importe2) >= 20000,
    ImporteFinal is (Importe1+Importe2)*1.2.

descuento10(Vendedor, ImporteFinal):-
    ventas1erSem(Vendedor,Importe1),
    ventas2doSem(Vendedor,Importe2),
    (Importe1+Importe2) < 20000,
    ImporteFinal is (Importe1+Importe2)*1.1.

descuento5(Vendedor,ImporteFinal):-
    ((ventas1erSem(Vendedor,Importe);
    ventas2doSem(Vendedor,Importe))),
    \+descuento20(Vendedor,_), \+descuento10(Vendedor,_),
    ImporteFinal is Importe*1.05.

comisionesLiquidadas(Vendedor,Importe):-
    descuento20(Vendedor,Importe);
    descuento10(Vendedor,Importe);
    descuento5(Vendedor,Importe).