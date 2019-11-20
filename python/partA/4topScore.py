"""
Given below is the list of marks scored by students. Find top three scorers for the course and also display the average
marks scored by all students. Implement the solution using Python Programming
"""

studentList = {
    86.5: 'John',
    91.2: 'Jack',
    84.5: 'Jill',
    72.1: 'Harry',
    80.5: 'Joe'
}

sortedList = sorted(studentList.keys(), reverse=True)

print("Top 3 scorers")
for i in sortedList[:3]:
    print(studentList[i])

print(f"The average marks : {sum(sortedList)/5}")
