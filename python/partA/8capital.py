"""
Consider two strings, String1 and String2 and display the merged string as output. The merged string should be the capital letters from both the strings in the order they appear.
Sample Input:String1:ILikeC String2:MaryLikesPython
Merged string should be ILCMLPS
"""
str1, str2, str3 = input("Enter string 1"), input("Enter string 2"), ""
for i in str1 + str2:
    if i.isupper():
        print(f"{i}", end="")
