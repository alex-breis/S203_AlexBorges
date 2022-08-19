class Pessoa(object):
    nome = None
    sexo = None
    idade = None

    def __init__(self, nome, sexo, idade):
        self.nome = nome
        self.sexo = sexo
        self.idade = idade

class Cidadao(Pessoa):
    cpf = None

    def __init__(self, nome, sexo, idade, cpf):
        super().__init__(nome, sexo, idade)
        self.cpf = cpf

valor_nome = input("Qual é o nome? ")
valor_sexo = input("Qual é o sexo? ")
valor_idade = input("Qual é a idade? ")
valor_cpf = input("Qual é o cpf? ")

cidadao_1 = Cidadao(valor_nome, valor_sexo, valor_idade, valor_cpf)

print(cidadao_1.nome)
print(cidadao_1.sexo)
print(cidadao_1.idade)
print(cidadao_1.cpf)
