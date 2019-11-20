"""
Design a class named Rectangle to represent a rectangle. class contains: Two data fields named width and
height. A constructor that creates a rectangle with the specified width and heigh and a method getArea().
Write a program that creates ‘n’ number of Rectangle objects. Read values of width and height from the key board for each Rectangle.
Display the width and height of the rectangle having maximum and minimum area.
"""


class Rectangle():
    def __init__(self, width, height):
        self.width = width
        self.height = height

    def getArea(self):
        return self.width * self.height


rectList = []

rectNum = int(input("Enter the number of rectangles : "))
for i in range(rectNum):
    width = int(input(f"Enter width of Rectangle {i + 1}"))
    height = int(input(f"Enter height of Rectangle {i + 1}"))
    rectList.append(Rectangle(width, height))

rectList = sorted(rectList, key=lambda x: x.getArea())

print(f"Rectangle with minimum area = {rectList[0].getArea()}")
print(f"Height = {rectList[0].height}")
print(f"Width = {rectList[0].width}")

print(f"Rectangle with maximum area = {rectList[-1].getArea()}")
print(f"Height = {rectList[-1].height}")
print(f"Width = {rectList[-1].width}")



