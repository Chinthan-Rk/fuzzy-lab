"""
Write a program to count the number of capital letters
and display the position of each capital letter in a user entered string via keyboard.
"""
s = input("enter string ")
count = 0
for x in range(0, len(s)):
    if s[x].isupper():
        count = count + 1
        print(f"{s[x]} is at index {x}")

print("Count of capital letters : ", count)
