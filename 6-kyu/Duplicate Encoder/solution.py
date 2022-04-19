def duplicate_encode(word):
    word = word.lower()
    d = dict()
    res = ""
    for ch in word:
        if not ch in d.keys():
            d[ch] = 1
        elif ch in d.keys():
            d[ch] += 1

    for ch in word:
      if(d[ch] > 1):
        res += ")"
      else:
        res += "("
        
    return res
