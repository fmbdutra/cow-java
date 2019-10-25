"""
Fabiano Dutra
Jun 2019

Attributes
----------
    vacas : list 
        Lista com código e pesos das vacas. O codigo delas sao definidos pelo indice da lista.
    maior_peso : float
        Seta o maior peso para esse atributo
    menor_peso : float  
        Seta o menor peso para esse atributo
    id_vaca_leve : int
        Seta o indice do que foi definido com menor peso para esse atributo
    id_vaca_pesada : int
        Seta o indice do que foi definido com menor peso para esse atributo

----------

"""
vacas = [740.0, 897.99, 568.54, 744.2, 677.05]
maior_peso = 0
menor_peso = 0
id_vaca_leve = 0
id_vaca_pesada = 0

print("Temos: ", len(vacas), " vacas")

for i in range(len(vacas)): 
    print("Vaca ", i+1 ,": ", vacas[i], "kg")

for x in range(len(vacas)):
    if menor_peso == 0 or maior_peso == 0:
        menor_peso = vacas[x]
        maior_peso = vacas[x]

    if maior_peso <= vacas[x]:
        maior_peso = vacas[x]
        id_vaca_pesada = x+1

    if menor_peso >= vacas[x]:
        menor_peso = vacas[x]
        id_vaca_leve = x+1             
        
print("Maior Peso: ", maior_peso, " - Vaca ", id_vaca_pesada)
print("Menor Peso: ", menor_peso, " - Vaca ", id_vaca_leve)
