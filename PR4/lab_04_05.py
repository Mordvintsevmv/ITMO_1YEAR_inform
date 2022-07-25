class Person:
    def __init__(self, firstname, lastname, age):
        self.firstname = firstname
        self.lastname = lastname
        self.age = age

    def dispay(self):
        print('Имя : ',self.firstname)
        print('Фамилия : ',self.lastname)
        print('Возраст : ',self.age)

class Student(Person):
    studentID = 1

    def __init__(self, firstname, lastname, age, recordBook):
        Person.__init__(self, firstname, lastname, age)
        self.recordBook = recordBook
        self.stid = Student.studentID
        Student.studentID += 1

    def display(self):
        print('ID Студента : ', self.stid)
        print('Имя : ', self.firstname)
        print('Фамилия : ', self.lastname)
        print('Возраст : ', self.age)
        print('5 = ', self.recordBook[0])
        print('4 = ', self.recordBook[1])
        print('3 = ', self.recordBook[2])
        print('2 = ', self.recordBook[3])
        print('\n')

class Professor(Person):
    professorID = 1

    def __init__(self, firstname, lastname, age, degree):
        Person.__init__(self, firstname, lastname, age)
        self.prid = Professor.professorID
        self.degree = degree
        Professor.professorID += 1

    def display(self):
        print('ID Профессора: ', self.prid)
        print('Имя : ', self.firstname)
        print('Фамилия : ', self.lastname)
        print('Возраст : ', self.age)
        print('Науная степень : ', self.degree)
        print('\n')

s1 = Student('Зубенко', 'Михаил', 47, [90,1,2,666])
s2 = Student('Кама', 'Пуля', 67, [0,1,2,88888])
s3 = Student('Сосед', 'Справа', 17, [5,12,32,1])

s1.display()
s2.display()
s3.display()

p1 = Professor('Йода', 'Обыкновенный', 600, 'Гранд-мастер Ордена джедаев')
p2 = Professor('Павел', 'Дуров', 30, 'Магитср мемов')
p3 = Professor('Маг', 'Истр', 7, 'Просто магистр')

p1.display()
p2.display()
p3.display()