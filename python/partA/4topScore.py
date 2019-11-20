"""
Given below is the list of marks scored by students. Find top three scorers for the course and also display the average
marks scored by all students. Implement the solution using Python Programming
"""

students = {
    "John": 86.5,
    "Jack": 91.2,
    "jill": 84.5,
    "Harry": 72.1,
    "Joe": 80.5
}

topScore = sorted(students.items(), key=lambda kv: kv[1], reverse=True)
print(topScore[0:3])
average = sum(students.values())/5

print(average)
