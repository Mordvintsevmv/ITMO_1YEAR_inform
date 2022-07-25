# -*- coding: utf-8 -*-

'''
    Кортежи
'''

#Создание кортежа

a1 = tuple()
a2 = 1, 2, 3, 'abc'
a3 = (1, 2, 3, 'abc')
print('Tuple a1 =  ', a1)
print('Tuple a2 = ', a2)
print('Tuple a3 = ', a3)

#Создвние кортежа из других структур данных
l = [1, 2, 3, 'abc'] #Из списка
a4 = tuple(l)
print('Tuple a4 from list l = ', a4)

a5 = tuple('Hello, World!') #Из строки
print('Tuple a5 from string = ', a5)

#Вложенность кортежей
a6 = a2, a3
print('Tuple a6 formed from a2 and a3 = ', a6)

#Объединение кортежей
a7 = a2 + a3
print('Tuple a7 by combining a2 and a3 = ', a7)

#Доступ к элементам кортежей
print('a6[0] : ', a6[0])
print('a6[0][3] : ', a6[0][3])
#a6[0][3] = 'cba'
'''
    Задание 2:
    a6[0][3] = 'cba' 
    Программа выдаст ошибку, так как tuple является неизменяемым типом данных
'''
print('\n\n')

#Задание 3
k1 = tuple(input('Введите Вашу дату рожения через пробел : ').split())
k2 = tuple(input('Введите Вашу фамилию, имя и отчество через пробел : ').split())
k3 = k1 + k2
print(k3,'\n')

#Задание 4
k4 = k1, k2
print('k4 = ', k4)
print('k4[1][1] = ', k4[1][1])


