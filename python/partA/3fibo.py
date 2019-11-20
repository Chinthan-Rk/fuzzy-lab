# Write a Python program to generate first ‘n ’Fibonacci numbers
n = int(input("Enter the nth number : "))

if n < 0:
    print("0")
else:
    a, b = 0, 1
    for x in range(n):
        print(a, end=" ")
        a, b = b, a + b
