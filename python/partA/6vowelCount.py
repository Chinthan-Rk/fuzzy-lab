# Write a program to count the number of each vowel in a given string.
string = input("Enter the string : ")
vowel = {
    "a": 0,
    "e": 0,
    "i": 0,
    "o": 0,
    "u": 0
}

for x in string:
    if x in "aeiouAEIOU":
        x = x.lower()
        vowel[x] = vowel[x] + 1

for key, value in vowel.items():
    print(f"{key} = {value}")
