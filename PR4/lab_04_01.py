# -*- coding: utf-8 -*-

import time


class Ticket:

    def __init__(self, date, name, deadline):
        self.createDate = date
        self.owner = name
        self.deadline = deadline

    def __del__(self):
        print('Delete Ticket : ', time.asctime(self.createDate))

    def display(self):
        print('Ticket : ')
        print('createDate : ', time.asctime(self.createDate))
        print('Owner : ', self.owner)
        print('Deadline : ', time.asctime(self.deadline))


# Создание объектов класса

ticket1 = Ticket(time.localtime(), 'PAra RApa', time.strptime('13.12.2000', '%d.%m.%Y'))

# Вызов

ticket1.display()
print('\n')

# Получение значения атрибута
print('Owner : ', ticket1.owner)
print('Owner (getattr) : ', getattr(ticket1, 'owner'))

# Проверка наличия атрибута
print('hasattr : ', hasattr(ticket1, 'owner'))
setattr(ticket1, 'owner', 'Pupa Lupa')  # Установка значения атрибута
print('Owner (setattr) : ', ticket1.owner)

delattr(ticket1, 'owner')  # Удаление значения атрибута
print('delattr : ', hasattr(ticket1, 'owner'))
del ticket1  # Удаление объекта
# print(ticket1)


'''
    Самостоятельная работа
'''

# Задание 4
print(' '.join((time.strftime('%d.%b.%Y.%X', time.localtime())).split('.')))
print('\n')

# Задание 5
print('time : ', ' '.join((time.strftime('%x.%X', time.localtime())).split('.')))
