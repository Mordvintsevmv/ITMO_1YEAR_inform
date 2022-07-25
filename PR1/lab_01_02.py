# -*- coding: utf-8 -*-
'''
    Логические операции
'''
f = True
g = False
print("f: ", f)
print('not f: ', not f)
print('f and g: ', f and g)
print('f or g: ', f or g)
print('f == g: ', f == g)
print('f != g: ', f != g)
print('\n')

h = 3
i = 5
print('h = ', h)
print('i = ', i)
print('h > i: ', h > i)
print('h < i: ', h < i)
print('h >= i: ', h>=i)
print('0 < h <= i: ', 0 < h <= i)
print('\n\n')

'''
    Побитовые операции
'''

j = 7
k = 20
print('j = %d; j in binary format: %s' % (j, bin(j)))
print('k = %d; K in binary format: %s' % (k, bin(k)))
print('j & k: %d; binary: %s' % (j & k, bin(j & k))) #Побитовое AND
print('j | k: %d; binary: %s' % (j | k, bin(j | k))) #Побитовое OR
print('j ^ k: %d; binary: %s' % (j ^ k, bin(j ^ k))) #Побитовое XOR
print('~k: %d; binary: %s' % (~k, bin(~k))) #Инверсия двоичного числа
print('k>>1: %d; binary: %s' % (k>>1, bin(k>>1))) #Сдвиг на один бит вправо
print('K<<1: %d; binary: %s' % (k<<1, bin(k<<1))) #Сдвиг на один бит влево
print('\n\n')

A = 73
B = 37
C = True
D = False

print('¬(C∧D) : ', not(C & D))
print('C∧D∨¬(C∧D) : ',C & D | (not(C & D)))
print('¬C∨D : ', not(C | D))

print('A<=B : ', A <= B)
print('A>B ∨ A==B : ',(A > B) | (A == B))
print('¬(A<B) : ', (A < B))


s = 154
p = 6
print('s: %d; \ns in binary: %s \n' % (s, bin(s)))
print('p: %d; \np in binary: %s \n' % (p, bin(p)))
s = s | p
print('s | p: %d; \ns | p in binary: %s \n' % (s, bin(s)))


s = s>>2
p = p>>2
print('s>>2: %d; \ns>>2 in binary: %s' % (s,bin(s)))
print('p>>2: %d; \np>>2 in binary: %s' % (p,bin(p)))
