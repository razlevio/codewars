def generate_hashtag(s):
    res = "#"
    if s == "" or s == None:
        return False
    if (len(s.strip().replace(" ", ""))+1) > 140:
        return False
    else:
        words = s.strip().split(" ")
        for word in words:
            res += word.capitalize()
        return res;
