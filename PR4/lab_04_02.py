# -*- coding: utf-8 -*-

class Worker:
    'doc class Worker'
    count = 0

    def __init__(self,name, surname):
        self.name = name
        self.surname = surname
        Worker.count += 1

    def display(self):
        print('Worker : ', end = '')
        print('{} {}'.format(self.name,self.surname))



w1 = Worker('Pupa', 'Lupaglazovich')
print('w1.count : ', w1.count)
w2 = Worker('Lupa', 'Pupaglazovich')
print('w2.count : ', w2.count)
print('w1.count : ', w1.count)

print('Worker.count : {0} \n'.format(Worker.count))
print('Worker.__name__ : ', Worker.__name__)
print('Worker.__dict__ : ', Worker.__dict__)
print('Worker.__doc__ : ', Worker.__doc__)
print('Worker.__bases__ : ', Worker.__bases__)

'''
    Самостоятельная работа
'''

#Задание 7


class Animals:

    count = 0

    def __init__(self,name,age):
        self.name = name
        self.age = age
        Animals.count += 1
        self.count = Animals.count


    def display(self):
        print('Animal id : ', self.count)
        print('Name : ',self.name)
        print('Age : ', self.age)
        print('\n')

a1 = Animals('Клоп',666)
a2 = Animals('Клещ',13)
a3 = Animals('Бубенчик',-7)

a1.display()
a2.display()
a3.display()