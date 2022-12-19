# '11 S1

import sys 

n = int(input())
tCount = 0
sCount = 0

for i in range(n):
    # read entire line, remove all whitespace, convert to lowercase
    str = sys.stdin.readline().strip().lower()
    for j in range(len(str)):
        if str[j] == "t":
            tCount += 1
        elif str[j] == "s":
            sCount += 1

if tCount > sCount:
    print("English")
else:
    print("French")