# Sistema de Gestão de Projetos (Swing)

Este projeto foi desenvolvido em **Java Swing** utilizando o **NetBeans** como parte das atividades da faculdade de **Análise e Desenvolvimento de Sistemas (ADS)**, na disciplina de **Programação de Soluções Computacionais**.

## 🎯 Objetivo
O sistema tem como objetivo simular a gestão de projetos, permitindo o **cadastro e gerenciamento de usuários, equipes e tarefas**, com interface gráfica desenvolvida em Swing.

## 🚀 Funcionalidades
- Cadastro de usuários
- Cadastro de equipes
- Gerenciamento de tarefas
- Interface gráfica com Java Swing

## 🛠️ Tecnologias utilizadas
- Java 17
- Swing
- NetBeans IDE

## 🖼️ Diagrama MVC do projeto 

        +-----------+
        |   View    |  <-- Interface gráfica (telas Swing)
        +-----------+
              |
              v
        +-----------+
        | Controller|  <-- Lógica de controle e regras do sistema
        +-----------+
              |
              v
        +-----------+
        |   Model   |  <-- Dados e regras de negócio
        +-----------+

- **View:** exibe informações e recebe entradas do usuário

- **Controller:** processa entradas da View e atualiza o Model

- **Model:** mantém os dados e regras de negócio

## 📂 Estrutura do projeto

- SistemaGestaoProjetos/

   - `src/`

   - `src/controller/` → Classes responsáveis pelo controle e lógica do sistema

   - `src/model/` → Classes de modelo, contendo dados e regras de negócio

   - `src/sistemagestaoprojetos/` → pacote principal (contém o Main)

   - `src/view/` → Classes de interface gráfica (telas Swing)

- **README.md** – Este arquivo

- **LICENSE** – Licença do projeto (**MIT License**)

- **.gitignore** – Arquivos e pastas que não devem ser versionados



## ▶️ Como executar
1. Clone este repositório:
   ```bash
   git clone https://github.com/SEU-USUARIO/SistemaGestaoProjetos.git
