# '04 J3

m = int(input())
n = int(input())
adjArray = []
nounArray = []

# store each adjective in adjArray
for i in range(m):
    adjArray.append(input() + " as ")
    
# store each noun in nounArray
for i in range(n):
    nounArray.append(input())
    
# for each adjective, match it to each noun
for e in adjArray:
    for k in nounArray:
        print(e + k)

