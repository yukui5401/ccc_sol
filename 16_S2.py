# '16 S2

q = int(input())
n = int(input())

arr1 = list(map(int, input().split()))
arr2 = list(map(int, input().split()))
ttl = 0

arr1.sort()
arr2.sort()

if q == 1:
    for i in range(n):
        a = arr1[i]
        b = arr2[i]
        if a > b:
            ttl += a
        else:
            ttl += b
else:
    for i in range(n):
        a = arr1[i]
        b = arr2[n - i - 1]
        if a > b:
            ttl += a
        else:
            ttl += b
print(ttl)
            