# '13 J2

arr = ["I", "O", "S", "H", "Z", "X", "N"]

str = input()
test = True
for i in range(len(str)):
    if str[i] not in arr:
        test = False
        break

if test:
    print("YES")
else:
    print("NO")