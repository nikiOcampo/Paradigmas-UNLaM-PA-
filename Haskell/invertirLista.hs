--Implementar una función que invierta una lista.
invertir :: [a] -> [a]
invertir [] = []
invertir (x:xs) = invertir xs ++ [x]

main= print(invertir [1,2,3,4,5])