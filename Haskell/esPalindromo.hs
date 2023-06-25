
-- Implementar una función que verifique si una cadena de texto es un palíndromo.

esPalindromo :: String -> Bool
esPalindromo [] = True
esPalindromo [x] = True
esPalindromo (x:xs) = x == last xs && esPalindromo (init xs)

main=print (esPalindromo "anitalavalatina")
    