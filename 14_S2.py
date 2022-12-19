# '14 S2

n = int(input())
arr1 = list(map(str, input().split()))
arr2 = list(map(str, input().split()))
test = False    

for i in range(n):
    for j in range(n):
        if arr1[i] == arr2[j]:
            if arr1[j] != arr2[i] or i == j:
                test = True
                break
    if test == True:
        break
if test == True:
    print("bad")
else:
    print("good")