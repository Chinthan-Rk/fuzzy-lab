# Binary Search
def BinarySearch(array, low, high, key):  # We basically ignore half of the elements just after one comparison.
    if high >= low:
        mid = (low + high) // 2

        if array[mid] == key:
            return mid

        elif array[mid] > key:
            return BinarySearch(array, low, mid - 1, key)
        else:
            return BinarySearch(array, mid + 1, high, key)
    else:
        return -1


num = int(input("Enter the number of elements : "))
array = []

for i in range(num):
    array.append(int(input(f"Enter {i + 1} element :")))

key = int(input("Enter key value "))

result = BinarySearch(array, 0, len(array) - 1, key)

if result != -1:
    print(f"Key found at index {result}")
else:
    print("Key not found")
