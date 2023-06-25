division x 0 = 0
division x 1 = x
division x y = if x<y
  then 0
  else 1 + division (x-y) y

main = print(division 7 2)