# Sistema de Cadastro de Alunos

Projeto simples em Java para praticar Programação Orientada a Objetos (POO), desenvolvido como parte dos meus estudos em Análise e Desenvolvimento de Sistemas.

O sistema permite cadastrar, listar, buscar e remover alunos através de um menu interativo no console.

Funcionalidades

- Cadastrar aluno: registra nome e idade, gerando uma matrícula automática e sequencial
- Listar todos os alunos: exibe todos os alunos cadastrados
- Buscar aluno por matrícula: localiza um aluno específico pela matrícula
- Remover aluno: remove um aluno da lista a partir da matrícula

## Conceitos de Java praticados

- Herança (`Aluno extends Pessoa`)
- Sobrescrita de métodos (`@Override`, `toString()`)
- Atributos `static` (contador automático de matrícula)
- Coleções (`List`, `ArrayList`)
- Estruturas de repetição e controle de fluxo (`for`, `do-while`, `switch`)
- Entrada de dados via `Scanner`

## Estrutura do projeto

```
├── Pessoa.java   # Classe base, com nome e idade
├── Aluno.java    # Herda de Pessoa, adiciona matrícula
└── Main.java     # Menu principal e lógica do programa
```

## Como executar

1. Clone o repositório:
```bash
git clone https://github.com/SEU_USUARIO/NOME_DO_REPO.git
```

2. Compile os arquivos:
```bash
javac Pessoa.java Aluno.java Main.java
```

3. Execute o programa:
```bash
java Main
```

## Menu do programa

```
[0] Sair
[1] Cadastrar aluno
[2] Listar todos os alunos
[3] Buscar aluno por matrícula
[4] Remover um aluno
```

## Autor

Projeto desenvolvido por mim como exercício prático de POO em Java, durante o  meu curso de ADS.
Data: 25/09/2026
