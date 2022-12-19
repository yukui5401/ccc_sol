# '13 S2

w = int(input())
n = int(input())
arr = []
ttl = 0
test = False
    
for i in range(n):
    arr.append(int(input()))

if n < 4:
    for i in range(n):
        ttl += arr[i]
        if ttl > w:
            print(i)
            test = True
            break 
else:
    for i in range(n - 3):
        for j in range(4):
            ttl += arr[i + j]
            if ttl > w:
                print(i + j)
                test = True
                break
        if test:
            break
        else:
            ttl = 0
               
if test == False:
    print(n)