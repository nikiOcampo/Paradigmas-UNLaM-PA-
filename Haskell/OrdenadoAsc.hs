--Definir una función que determine si una lista está ordenada de forma ascendente.

ordenada :: [Int] -> Bool
ordenada [] = True
ordenada [x] = True
ordenada (x:y:xs) = x <= y && ordenada (y:xs)


main = print (ordenada [1,2,3,4,2])