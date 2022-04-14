from textwrap import wrap
def int32_to_ip(int32):
    binary_rep = format(int32, '#034b')[2:]
    bytes = wrap(binary_rep, 8)
    if len(bytes) < 4:
        while len(bytes) < 4:
            bytes.append('00000000')
        bytes = list(reversed(bytes))
    res = []
    for byte in bytes:
        res.append(str(int(byte,2)))
    return '.'.join(res)
