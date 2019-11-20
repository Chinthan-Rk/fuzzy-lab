countryName = []
capital = []
population = []

while True:
    
    print("1.Add country\n2.Display details\n3.Highly populated country")
    option = int(input("Enter your choice : "))

    if option == 1:
        cName = input("Enter country name : ")
        countryName.append(cName)
        cap = input("Enter capital : ")
        capital.append(cap)
        pop = int(input("Enter the population count : "))
        population.append(pop)

    elif option == 2:
        cName = input("Enter country name : ")
        detIndex = countryName.index(cName)
        print(f"Capital : {capital[detIndex]}")
        print(f"Population : {population[detIndex]}")

    elif option == 3:
        detIndex = population.index(max(population))
        print(f"Country : {countryName[detIndex]}")

    else:
        break
