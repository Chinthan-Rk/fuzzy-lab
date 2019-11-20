"""
Write a program that will count the number of characters, words,and lines in a file. Words are separated by a white-space character.
Your program should prompt the user to enter a filename.
"""
numLines = 0
numWords = 0
numChars = 0

fileName = input("Enter file name :")

with open(fileName, 'r') as file:
    for line in file:
        words = line.split()
        numLines += 1
        numWords += len(words)
        numChars += len(line)

print(f"Number of lines : {numLines}")
print(f"Number of words : {numWords}")
print(f"Number of chars : {numChars}" )
