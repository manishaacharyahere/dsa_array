from typing import *

def countSubStrings(s: str, k: int) -> int:
    # Write your code here
    n = len(s)
    cnt = 0
    for i in range(n):
        d = {}  
        unq = 0
        for j in range(i, n):
            if s[j] not in d :
                unq += 1
                d[s[j]] = 1
            else:
                d[s[j]] += 1
            if unq == k:
                cnt += 1
            elif unq > k:
                break
    return cnt
    pass 

