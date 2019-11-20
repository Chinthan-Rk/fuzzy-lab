"""
The finance department of a company wants to calculate the monthly pay of one of its employee.
Monthly pay should be calculated as mentioned in the formula below and display all the employee details.
Monthly Pay= No. of hours worked in a week * Pay rate per hour * No .of weeks in a
Month. Write a Python Program to implement the problem.
"""


numHours = int(input("Enter the number of hours :"))
payRate = int(input("Enter pay rate : "))

monthlyPay = numHours*payRate*4

print(f"Monthly Pay : {monthlyPay}")
print(f"Number of hours : {numHours}")
print(f"Pay rate : {payRate}")

