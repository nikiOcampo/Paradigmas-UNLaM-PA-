-- Definir una función que encuentre el elemento mínimo en una lista.

menor x y = if x<y
  then x
  else y


minimo :: [Int] -> Int
minimo [x] = x 
minimo (x:xs) = menor x (minimo(xs))

main= print (minimo [10,2,3])