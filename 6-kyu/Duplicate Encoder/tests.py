import codewars_test as test
from solution import duplicate_encode

@test.describe("Duplicate Encoder")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        test.assert_equals(duplicate_encode("din"),"(((")
        test.assert_equals(duplicate_encode("recede"),"()()()")
        test.assert_equals(duplicate_encode("Success"),")())())","should ignore case")
        test.assert_equals(duplicate_encode("CodeWarrior"),"()(((())())")
        test.assert_equals(duplicate_encode("Supralapsarian"),")()))()))))()(","should ignore case")
        test.assert_equals(duplicate_encode("iiiiii"),"))))))","duplicate-only-string")

    @test.it( "Tests with '(' and ')'")
    def _():
        test.assert_equals(duplicate_encode("(( @"),"))((")
        test.assert_equals(duplicate_encode(" ( ( )"),")))))(")

    @test.it( "And now... some random tests !")
    def _():
        
        from random import randint
        
        duplicate_sol = lambda word: "".join(["(" if word.lower().count(x.lower())==1 else ")" for x in word])
        
        for _ in range(40):
            testlen=randint(6,40)
            testword=""
            for i in range(testlen):
                letter = "abcdefghijklmnopqrstuvwxyz() @!"[randint(0,30)]
                testword += letter if randint(0,1) == 0 else letter.upper()
            test.assert_equals(duplicate_encode(testword),duplicate_sol(testword), 'Testing for word "%s"' % testword)
