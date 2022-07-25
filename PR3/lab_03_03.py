'''
    Операции над множествами
'''
b2 = {'bear', 'fox', 'squirrel', 'woodpecker', 'woodpecker', 'wolf', 'hedgehog'}
print('Check "bear" in b22 = ', 'bear' in b2)
b4 = set('12346135')
b5 = set('12367')
print('Set b4 : {0}, \nSet b5 : {1}'.format(b4,b5))

print('b4- b5 : ', b4 - b5) #присутствие в первом множестве, но не во втором
print('b4 difference b5 (b4-b5) : ', b4.difference(b5))
print('\n')

print('b4 | b5 : ', b4 | b5) #Присутствие хотя бы в одном множестве
print('b4 union b5 (b4 | b5) : ', b4.union(b5))
print('\n')

print('b4 & b5 : ', b4 & b5) #Присутствие в обоих множествах
print('b4 intersection b5 (b4 & b5) : ', b4.intersection(b5))
print('\n')

print('b4 ^ b5 : ', b4 ^ b5) #присутствие только в одном из множеств
print('b4 and b5 are disjoint : ', b4.isdisjoint(b5))
print('\n')

b4.update(b5) #Добавить элементы другого множества
print('Add b5 to b4 : ', b4)

b4.add('abc')
print('Add "abc" to b4 : ', b4)

b4.remove('5') #Удалить элемент
print('Remove element "5" form b4 : ', b4)

b4.clear() #Очистить множество
print('Clear b4 : ', b4)
print('\n')

'''
    Самостоятельная работа 
'''

#Задание 9
set1 = set('qetuwrt')
set2 = set('asfrewgq')

print('set1 - set2 = ', set1 - set2)
print('set1 | set2 = ', set1 | set2)
print('set1 & set2 = ', set1 & set2)
print('set1 ^ set2 = ', set1 ^ set2)

set1.update(set2)
set2.add('t')
set2.add('u')

print('\nПосле операций : ')
print('set1 - set2 = ', set1 - set2)
print('set1 | set2 = ', set1 | set2)
print('set1 & set2 = ', set1 & set2)
print('set1 ^ set2 = ', set1 ^ set2)

set3 = frozenset(set1)
#set3.remove('q')
'''
    Программа выдаст ошибку, так как frozenset является неизменяемым типом данных    
'''
