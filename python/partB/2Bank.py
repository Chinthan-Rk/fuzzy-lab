"""
Design a class named Account that contains: A private int data field named accountno for the account.
A private float data field named balance for the account. A constructor that creates an account with the
specified accountno and Initial balance (default 100). A method named withdraws that withdraws a specified
amount from the account. A minimum balance of 100 should be maintained for each account. A method
named deposit that deposits a specified amount to the specific account.

Write a program that maintains ‘n’ number of Account objects with unique account no and supports
following operations. a) Create account b) deposit c) withdraw d) Display account no with highest balance
"""


class Account():
    def __init__(self, accNum):
        self.__accountno = accNum
        self.__balance = 100

    def withdraws(self,amount):
        if self.__balance - amount <100:
            print("Insufficient balance")
        else:
            self.__balance -= amount

    def deposit(self,amount):
        self.__balance += amount

    def getBalance(self):
        return self.__balance


accountList = []
accountNumber = []
balance = []

flag = True

while flag:
    print("1.Create account")
    print("2.Deposit")
    print("3.Withdraw")
    print("4.Display account with highest balance")

    choice = int(input("Enter you choice : "))

    if choice == 1:
        acNum = int(input("Enter the account number : "))
        accountList.append(Account(acNum))
        accountNumber.append(acNum)

    elif choice == 2:
        acNum = int(input("Enter the account number : "))
        amt = float(input("Enter the amount : "))
        acIndex = accountNumber.index(acNum)
        accountList[acIndex].deposit(amt)

    elif choice == 3:
        acNum = int(input("Enter the account number : "))
        amt = float(input("Enter the amount : "))
        acIndex = accountNumber.index(acNum)
        accountList[acIndex].withdraws(amt)

    elif choice == 4:
        for i in range(len(accountList)):
            balance.append(accountList[i].getBalance())
        acIndex = balance.index(max(balance))
        print(f"The account with max balance : {accountNumber[acIndex]}")

    elif choice == 5:
        flag = False
    else:
        print("Choose a valid option")
