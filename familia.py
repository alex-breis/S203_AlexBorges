class pai(object):
    nome = "Carlos"
    sobrenome = "Oliveira"
    residencia = "Ilha Bela"
    olhos = "Azuis"

    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade

class filha(pai):
    nome = "Luciana"
    olhos = "Castanhos"

class neta(filha):
    nome = "Maria"

print("Pai: " + pai.nome + "\n" + pai.sobrenome + "\n" + pai.residencia + "\n" + pai.olhos)
print("Filha: " + filha.nome + "\n" + filha.sobrenome + "\n" + filha.residencia + "\n" + filha.olhos)
print("Neta: " + neta.nome + "\n" + neta.sobrenome + "\n" + neta.residencia + "\n" + neta.olhos)