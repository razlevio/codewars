def highest_rank(arr):
    d = dict()
    res = [0,0]
    for num in arr:
        if num not in d.keys():
            d[num] = arr.count(num)
    for item in d.items():
        if item[1] > res[1]:
            res = item
        elif item[1] == res[1] and item[0] > res[0]:
            res = item
    return res[0]
