# '19 J1

a = 3 * int(input()) 
a += 2 * int(input()) + int(input())
b = 3 * int(input())
b += 2 * int(input()) + int(input())

if a > b:
    print("A")
elif b > a:
    print("B")
else:
    print("T")
    
# record sum of Apple's points in "a", sum of Banana's points in "b"