--Definir una función que determine si un número es par o impar.

parOimpar x = if even x
  then "par"
  else "impar"


main=print (parOimpar 10)