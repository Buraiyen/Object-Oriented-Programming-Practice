class Animal:

    # Constructor
    def __init__(self, age, gender, weightInLbs):
        self.age = age
        self.gender = gender
        self.weightInLbs = weightInLbs

    def eat(self):
        print('eating...')

    def sleep(self):
        print('sleeping...')