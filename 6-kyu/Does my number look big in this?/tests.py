test.describe("Narcissistic function")
test.it("Should find these small numbers narcissistic...")
test.assert_equals(narcissistic(1), True, '1 is narcissistic')
test.assert_equals(narcissistic(5), True, '5 is narcissistic')
test.assert_equals(narcissistic(7), True, '7 is narcissistic')

test.it("Should find these larger numbers narcissistic...")
test.assert_equals(narcissistic(153), True, '153 is narcissistic')
test.assert_equals(narcissistic(370), True, '370 is narcissistic')
test.assert_equals(narcissistic(371), True, '371 is narcissistic')
test.assert_equals(narcissistic(1634), True, '1634 is narcissistic')

test.it("Should not find these numbers narcissistic...")
from random import randint
for a in range(0,10):
    num = randint(5,9) * 60000 + randint(1,99)
    test.assert_equals(narcissistic(num), False, '%d is not narcissistic' % num)
    
bignums = [8208, 9474, 54748, 92727, 93084, 548834, 1741725, 4210818, 9800817, 9926315, 24678050, 24678051]

test.it('Should find some of these narcissistic...')
for b in bignums:
    if randint(0,10) > 5:
        test.assert_equals(narcissistic(b), True, '%d is narcissistic' % b)
    else:
        num = randint(5,9) * 900000 + randint(1,99)
        test.assert_equals(narcissistic(num), False, '%d is not narcissistic' % num)
