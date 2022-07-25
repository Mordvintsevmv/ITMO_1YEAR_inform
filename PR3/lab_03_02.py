# -*- coding: utf-8 -*-

'''
    Множества
'''
#Создание множества
b1 = set()
print('Set b1 = ', b1)
b2 = {'bear', 'fox', 'squirrel', 'woodpecker', 'woodpecker', 'wolf', 'hedgehog'}
print('Set b2 = ', b2)

#Создание множества из строки
b3 = set('abcdabcdefg')
print('Set b3 from string = ', b3)
print('\n')

'''
    Самостоятельная работа
'''

#Задание 6
s = 'Electricity is the set of physical phenomena associated with the presence of electric charge. Lightning is one of the most dramatic effects of electricity'
set1 = set(s)
print(set1)

#Задание 7
for elem in set1:
         if ((elem == 'e') or (elem == 'y') or (elem == 'u') or (elem == 'i') or (elem == 'o') or (elem == 'a')):
             print(elem, end=' ')
