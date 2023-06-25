-- Escribir una función que obtenga el enésimo número de la secuencia de Fibonacci.

fibonacci :: Int -> Int
fibonacci 0 = 0
fibonacci 1 = 1
fibonacci n = fibonacci (n-2) + fibonacci (n-1)