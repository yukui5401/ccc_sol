# '15 S3

g = int(input())
p = int(input())
gates = [True for i in range(g)]
planes = []
full = False

for i in range(p):
    planes.append(int(input()))
    
for i in range(p):
    k = planes[i]
    if gates[k - 1]:
        gates[k - 1] = False
    elif k == 1:
        full = True
        ans = i
        break
    else:
        for j in range(k - 1):
            if gates[k - 2 - j]:
                gates[k - 2 - j] = False
                break
            elif k - 2 - j == 0:
                full = True
                ans = i
                break
        if full:
            break

if full:
    print(ans)
else:
    print(p)
    
# TLE on DMOJ