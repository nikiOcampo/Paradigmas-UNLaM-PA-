-- Implementar una función que obtenga el producto de todos los elementos de una lista.


producto [] = 1
producto (x:xs) = x * producto (xs)

main= print(producto [1,2,3,5,4])