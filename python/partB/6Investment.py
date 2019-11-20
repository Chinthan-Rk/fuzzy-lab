from tkinter import *


def calc():
    investedAmount = float(input1.get())
    years = float(input2.get())
    annIR = float(input3.get()) / 1200

    futureVal = investedAmount * (1 + annIR) * years * 12

    output.config(text=f'{futureVal}')


window = Tk()
window.title("Future Value")

label1 = Label(window, text="Investment Amount")
label1.grid(row=0, column=0)

input1 = Entry(window, width=10)
input1.grid(row=0, column=1)

label2 = Label(window, text="Years")
label2.grid(row=1, column=0)

input2 = Entry(window, width=10)
input2.grid(row=1, column=1)

label3 = Label(window, text="Annual Interest Rate ")
label3.grid(row=2, column=0)

input3 = Entry(window, width=10)
input3.grid(row=2, column=1)

label4 = Label(window, text="Future Value")
label4.grid(row=3, column=0)

output = Label(window)
output.grid(row=3, column=1)

butt = Button(window, text="Calculate", command=calc)
butt.grid(row=4, column=1)

window.mainloop()
