"""
Develop python program to perform the below mentioned operations.
a) display total marks scored by each student b) Display top scorer and the top score.
Scenario: There are 8 students and answers t o 10 multiple choice questions of each student is stored in
a file called marks.txt. Each answer is delimited by space. Each line provides a student’s answers to the
questions, as shown below. The answer key is stored in a file named keys.txt with following format.
"""

ans = open("key.txt", 'r')
stu = open("stud.txt", 'r')

totalMarks = []
answers = ans.readline().split()
for line in stu:
    hisAns = line.split()
    marks = 0
    for i in range(1, len(answers)):
        if hisAns[i] == answers[i]:
            marks += 1
    totalMarks.append(marks)

j=0
for i in totalMarks:
    print(f"Student {j} = {i}")
    j += 1
print(f"Student with max marks => Student {totalMarks.index(max(totalMarks))}")
