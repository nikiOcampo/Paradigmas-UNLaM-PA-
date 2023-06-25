--Definir una función maximoDeTres que devuelve el máximo de sus argumentos enteros
maximoDeDos x y = max x y

maximoDeTres x y z = if maximoDeDos x y == x
  then maximoDeDos x z
  else maximoDeDos y z

main= print (maximoDeTres 41 6 72)