"""
Consider two strings, String1 and String2 and display the merged string as output. The merged string should be the capital letters from both the strings in the order they appear.
Sample Input:String1:ILikeC String2:MaryLikesPython
Merged string should be ILCMLPS
"""

string1 = input("Enter string 1 : ")
string2 = input("Enter string 2 : ")
newString = ""
for x in string1:
    if x.isupper():
        newString += x

for x in string2:
    if x.isupper():
        newString += x

print(newString)
