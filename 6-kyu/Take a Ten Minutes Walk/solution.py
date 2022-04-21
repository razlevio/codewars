def is_valid_walk(walk):
    if(len(walk) != 10): return False
    elif walk.count("n") == walk.count("s") and walk.count("w") == walk.count("e"):
        return True
    return False
