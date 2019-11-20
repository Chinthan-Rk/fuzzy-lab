"""
Develop python Tkinter program to perform arithmetic operations addition, subtraction. multiplication and
division of two numbers. The numbers should be read using two different text fields and there should be four
separate buttons for performing each operation. Result should be displayed in a separate message dialog box.
"""

from tkinter import *
from tkinter import messagebox


def addition():
    num1 = float(t1.get())
    num2 = float(t2.get())
    messagebox.showinfo("Result", f"Sum is {num1 + num2}")


def subtraction():
    num1 = float(t1.get())
    num2 = float(t2.get())
    messagebox.showinfo("Result", f"Difference is {num1 - num2}")


def division():
    num1 = float(t1.get())
    num2 = float(t2.get())
    messagebox.showinfo("Result", f"Quotient is {num1 / num2}")


def multiplication():
    num1 = float(t1.get())
    num2 = float(t2.get())
    messagebox.showinfo("Result", f"Product is {num1 * num2}")


root = Tk()
l1 = Label(root, text="Number 1")
l1.grid(row=0, column=0)

t1 = Entry(root, width=5)
t1.grid(row=0, column=1)

l2 = Label(root, text="Number 2")
l2.grid(row=1, column=0)

t2 = Entry(root, width=5)
t2.grid(row=1, column=1)

b1 = Button(root, text="Add", command=addition)
b2 = Button(root, text="Sub", command=subtraction)
b3 = Button(root, text="Mul", command=multiplication)
b4 = Button(root, text="Div", command=division)

b1.grid(row=2, column=0)
b2.grid(row=2, column=1)
b3.grid(row=3, column=0)
b4.grid(row=3, column=1)

root.mainloop()
