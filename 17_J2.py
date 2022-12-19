# '17 J2

n = int(input())
k = int(input())
sum = 0
for i in range(k + 1):
    sum += n * 10 ** i
print(sum)

# sum = (n * 1) + (n * 10) + (n * 100) + ... + (n * 10 ^ k)