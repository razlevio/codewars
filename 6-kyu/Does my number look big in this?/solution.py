def narcissistic( value ):
    sumPowers = 0
    powerOf = len(str(value))
    for x in str(value):
        sumPowers += (int(x) ** powerOf)
    if sumPowers == value:
        return True
    else:
        return False
