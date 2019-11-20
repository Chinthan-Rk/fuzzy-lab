"""
Suppose that a text file contains marks for 6 courses for a student in a line. Each course marks is separated
by space as delimiter. File contains marks for ‘n’ number of students in separate lines. Write a program that
reads the marks from the file for each student and displays the total and average. Your program should
prompt the user to enter a filename.
"""

fileName = input("Enter the file name :")
numStudent = 0
with open(fileName, 'r') as file:
    for line in file:
        marks = line.split()
        numStudent += 1
        marks = list(map(int, marks))

        totalMarks = sum(marks)
        average = totalMarks/6
        print(f"Student {numStudent} => Total : {totalMarks} , Average : {average}")

print(f"Total Students : {numStudent}")

