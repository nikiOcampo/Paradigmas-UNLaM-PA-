
-- Definir una función que elimine los duplicados de una lista

eliminarDuplicados [] = []
eliminarDuplicados [x] = [x]
eliminarDuplicados (x:xs) = if elem x xs 
  then eliminarDuplicados(xs)
  else x : eliminarDuplicados(xs)

main = print (eliminarDuplicados [1,2,3,1,2])