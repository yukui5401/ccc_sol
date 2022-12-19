# '07 S1

n = int(input())

# Compare to date: 2007 2 27
for i in range(n):
    y, m, d = map(int, input().split())
    if 2007 - y > 18:
        print("Yes")
    elif 2007 - y == 18:
        if m < 2:
            print("Yes")
        elif m == 2 and d <= 27:
            print("Yes")
        else:
            print("No")
    else:
        print("No")
