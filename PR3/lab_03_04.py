'''
    Словари
'''

d1 = {
    'day' : 13,
    'month' : 12,
    'year' : 2018,
}

d2 = dict(bananas = 3, apples = 5, oranges = 2, bag = 'basket')
d3 = dict([('street','Kronverksky pr.'), ('house', 49)])
d4 = dict.fromkeys(['1','2'],3)
print('Dict d1 = ', d1)
print('Dict d2 by dict() = ', d2)
print('Dict d3 by dict([]) = ', d3)
print('Dict d4 by fromkeys = ', d4)
print('\n')

'''
    Самостоятельная работа
'''
#Задание 12
startDict1 = {
    'ready' : 3,
    'set' : 2,
    'go' : 1
}

startDict2 = dict(ready = 3, set = 2, go =1)

startDict3 = dict([('ready',3),('set',2),('go',1)])

print('startDict1 = {};\nstartDict2 = {};\nstartDict3 = {}.\n'.format(startDict1,startDict2,startDict3))

#Задание 13
dict1 = dict.fromkeys(['key1','key2'],input('Введите что-нибудь : '))
print(dict1)