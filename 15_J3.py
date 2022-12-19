# '15 J3

str = input()
finalWord = ""
vowels = ["a", "e", "i", "o", "u"]

for i in range (len(str)):
    k = ord(str[i]) - ord("a")
    finalWord += str[i]
    # check if letter is not a vowel
    if str[i] not in vowels:
        # note: order of parsing <vowels> is crucial
        l = "a"
        for j in vowels:
            if abs(ord(str[i]) - ord(j)) < k:
                k = abs(ord(str[i]) - ord(j))
                l = j
        finalWord += l
        if str[i] == "z":
            finalWord += str[i]
        else: # find the next closest consonant
            increment = 1
            while True: 
                if chr(ord(str[i]) + increment) not in vowels:
                    finalWord += chr(ord(str[i]) + increment)
                    break
                else:
                    increment += 1
print(finalWord)
'''
NOTE: ord() function converts character to its ASCII value.
NOTE: chr() function converts ASCII value to character.
We know that: ord("a") < ord("b") < ... < ord("z")
Keyword: <not in> checks if element exists in <vowels> list
'''