-- Implementar una función que obtenga los elementos en posiciones pares de una lista.
-- Ejemplo: pares [1,2,3,4,5] = [1,3,5]
--          pares [5,4,3,2,1] = [5,3,1]

pares :: [a] -> [a]
pares [] = []
pares [x] =[x]
pares (x:y:xs)= x : pares xs

main= print (pares [1,2,3,4,5])