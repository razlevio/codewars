def domain_name(url):
    if url == "": return ""
    splitted = url.split(".")
    for x in splitted:
        if "www" not in x and x[0] == "h": 
            domain = x.split("//")
            return domain[1]
        elif "www" in x and x[0] == "h":
            return splitted[1]
        elif "www" in x and x[0] != "h":
            return splitted[1]
        else:
            return splitted[0]
