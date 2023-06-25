-- Definir una función que calcule el máximo común divisor de dos números.
-- Ejemplo: mcd 10 5 = 5
--          mcd 5 3 = 1

mcd :: Int->Int->Int
mcd x 1 = 1
mcd 1 x = 1
mcd x 0 = x
mcd x y = mcd y (mod x y)

main = print (mcd 5 3)