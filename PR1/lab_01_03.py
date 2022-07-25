# -*- coding: utf-8 -*-
'''
    Форматированный ввод/вывод данных
'''
m = 10
pi = 3.1415927
print('m = ', m)
print('m = %d' % m)
print('%7d' % m)
print('pi = ', pi)
print('%.3f' % pi)
print('%10.4f\n' % pi)
print('m = {}, pi = {}'.format(m,pi))

ch = "A"
print('ch = %c' % ch)
s = "Hello"
print('s = %s' % s)
print('\n\n')


code = input("Enter your position number in group: ")
n1, n2 = input("Enter two numbers splitted by space: ").split()
d, m, y = input("Enter three numbers splitted by \'.\': ").split('.')
print("{} + {} = {}".format(n1,n2,float(n1)+float(n2)))
print("Your birthday is %s.%s.%s and you are %d in the group list" % (d,m,y,int(code)) )