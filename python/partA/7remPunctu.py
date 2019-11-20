"""
Write a program to remove all punctuations like “’!()-[]{};:’’’,\,<>,/,?,@,#,$,%^&*_~”
from the string provided by the user.
"""

import string

stringg = input("Enter the string : ")
str = ""
for x in stringg:
    if x not in string.punctuation:
        str += x

print(str)
