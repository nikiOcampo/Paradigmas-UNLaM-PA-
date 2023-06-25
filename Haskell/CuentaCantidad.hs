-- Escribir una función que cuente la cantidad de elementos en una lista.
-- Ejemplo: cantidad [1,2,3] = 3
--          cantidad [5,4,3,2,1] = 5

cuentaCantidad :: [a] -> Int
cuentaCantidad [] = 0
cuentaCantidad [x]=1
cuentaCantidad (x:xs) =1 + cuentaCantidad(xs)

main= print (cuentaCantidad [1,2,3,4,5])
