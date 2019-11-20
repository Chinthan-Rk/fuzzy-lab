"""
Write a function that returns the index of the smallest element in a list of integers.
If the number of such elements is greater than 1,return the smallest index. Use the following header:
def indexOfSmallestElement(lst):
Write a test program that prompts the user to enter a list of numbers,
invokes this function to return the index of the smallest element and displays the index.
"""


def indexOfSmallestElement(lst):
    return array.index(min(lst))


array = []
num = int(input("Enter number of integers : "))

for x in range(num):
    array.append(int(input(f"Enter element {x + 1}")))

index = indexOfSmallestElement(array)

print(index)
