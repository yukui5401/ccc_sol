# '08 J2

str = "A B C D E"

while True:
    b = int(input())
    n = int(input())
    
    if b == 1:
        for i in range(n):
            str = str[2:] + " " + str[0]
    elif b == 2:
        for i in range(n):
            str = str[8] + " " + str[0:7]
    elif b == 3:
        for i in range(n):
            str = str[2] + " " + str[0] + str[3:]
    else:
        print(str)
        break
        
# rearrange characters in <str> according to button functionality