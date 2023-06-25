-- Implementar una función que calcule la suma de los dígitos de un número entero.
sumaDigitos 0 = 0
sumaDigitos x = mod x 10 + sumaDigitos( div x 10)

main = print (sumaDigitos 12345)