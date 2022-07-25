# -*- coding: utf-8 -*-

'''
    Циклы
'''

#while
print('Числа < 10 (while): ')
i = 0
while (i < 10):
    print(i, end = ' ')
    i += 1
print('\n')

#for
print('Числа < 10 (for): ')
for i in range(0,10):
    print(i,end = ' ')
else:
    print('\nСледующее число 10\n')

#break
sum = 0
for i in range(0,100):
    if i > 10:
        print('Мы дошли до конца! Сумма = ', sum)
        break
    sum += i

#continue
i = 0
while i <= 15:
    if i % 3 == 0:
        i += 1
        continue
    print(i, end = ' ')
    i += 1
print('\n')

#pass
print('Напечатаем числа ещё раз! ')
for i in range(0,10):
    pass
    print(i, end = ' ')

print('\n\n')

#Самостоятельная работа


#Задание 5

for i in range(0,500):
    print(i, end = ' ') if (i % 7 == 0) else 0
else:
    print('Все числа были выведены!')

print('\n\n')

i = 0
while (i < 500):
    print(i, end = ' ') if (i % 7 == 0) else 0
    i += 1
else:
    print('Все числа были выведены!')

print('\n\n')
#Задание 6

for i in range(0,500):
    print(i, end = ' ') if (i % 7 == 0)and(i % 14 != 0) else 0
    if (i == 300): break
else:
    print('Все числа были выведены!')

print('\n\n')

i = 0
while (i < 500):
    print(i, end = ' ') if (i % 7 == 0)and(i % 14 != 0) else 0
    i += 1
    if (i == 300): break
else:
    print('Все числа были выведены!')

print('\n\n')

#Задание 7

for i in range(1,5):
    for j in range(1,5):
        print(i, end = '    ') if (i == j) else print(0, end = '    ')
    print('\n')

print('\n\n')

i = 1
j = 1
while (i < 5):
    while (j < 5):
        print(i, end='    ') if (i == j) else print(0, end='    ')
        j += 1
    j = 1
    i += 1
    print('\n')
print('\n\n')

