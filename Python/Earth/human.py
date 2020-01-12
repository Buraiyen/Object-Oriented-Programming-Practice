class Human:

    # Constructor
    def __init__(self, name, age, heightInInches, eyeColor):
        self.name = name
        self.age = age
        self.heightInInches = heightInInches
        self.eyeColor = eyeColor

    def speak(self):
        print('Hello, my name is', self.name)
        print('I am', self.heightInInches, 'inches tall')
        print('I am', self.age, 'years old')
        print('My eye color is', self.eyeColor)

    def eat(self):
        print('eating...')

    def walk(self):
        print('walking...')

    def work(self):
        print('working...')