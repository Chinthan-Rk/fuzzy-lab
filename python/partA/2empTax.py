"""
The finance department wants to calculate the monthly net pay of one of its employee
by finding the income tax to be paid and the net salary after the income tax deduction.
The employee should pay the income tax based on the following table:
Display basic salary, allowances, gross pay, income tax and net pay

Gross Salary        Tax Percentage
Below 5,000         Nil
5,001 to 10,000     10%
10,001 to 20,000    20%
More than 20,000    30%

"""

eID = int(input("Enter your id : "))
bSal = int(input("Enter your basic salary : "))
allowance = int(input("Enter you allowance : "))

gSal = bSal + allowance

if gSal <= 5000:
    incomeTax = 0
elif 5000 < gSal <= 10000:
    incomeTax = 0.1
elif 10000 < gSal <= 20000:
    incomeTax = 0.2
else:
    incomeTax = 0.3

netPay = gSal - (gSal * incomeTax)

print(f'Employee id : {eID}')
print(f'Basic Salary : {bSal}')
print(f'Allowances : {allowance}')
print(f'Gross pay : {gSal}')
print(f'Net pay : {netPay}')
