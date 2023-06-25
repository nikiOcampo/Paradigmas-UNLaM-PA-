--Escribir una función que calcule el factorial de un número.
factorial :: Int -> Int
factorial 0 = 1
factorial 1 = 1
factorial x = x * factorial(x-1)

main=print (factorial 5)