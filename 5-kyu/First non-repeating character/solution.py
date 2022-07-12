def first_non_repeating_letter(string):
    s = string.lower()
    for i, ch in enumerate(s):
        if s.count(ch) == 1:
            return string[i]
    return ""
