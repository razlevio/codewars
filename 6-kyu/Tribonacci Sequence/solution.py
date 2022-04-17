def tribonacci(signature, n):
    # Extracting the numbers
    first = signature[0]
    second = signature[1]
    third = signature[2]
    result = [first,second,third]
    
    if n == 0:
        return []
    elif n == 1:
        return [signature[0]]
    elif n == 2:
        return [signature[0],signature[1]]
    else:
        while n > 3:
            term = first+second+third
            result.append(term)
            first = second
            second = third
            third = term
            n -= 1
    return result
