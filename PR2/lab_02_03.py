# -*- coding: utf-8 -*-

'''
    Списки
'''

a = [1,2,3,4,5]
print('a[0]: ', a[0])
print('List a[0:5]: ', a[0:5])
print('List a[:]: ', a[:])
print('List a: ', a)
print('List a[1:5]: ', a[1:])
print('List a[0:4]: ', a[:4])
print('Длина list a = ', len(a))

print('\nList a (by index): ')
#Получение элементов списка в цикле (1)
for i in range(0,len(a)):
    print(a[i], end=" ")

print('\nList a (by elements): ')
