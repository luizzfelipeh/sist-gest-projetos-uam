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



## ▶️ Como executar o projeto

1. **Pré-requisitos**
- Ter o Java JDK 8+ instalado
- Ter o NetBeans (ou outra IDE compatível) configurado

2. **Clonar o repositório**
   ```bash
   git clone https://github.com/SEU-USUARIO/sist-gest-projetos-uam.git

3. **Abrir no NetBeans**
- Vá em File > Open Project
- Selecione a pasta do projeto

4. **Executar as telas Swing**
- Dentro da pasta `src/view` estão as telas principais:

  - `TelaUsuario.java` → cadastro de usuários

  - `TelaEquipe.java` → cadastro de equipes

  - `TelaProjeto.java` → cadastro de projetos

- Basta rodar qualquer uma dessas classes para abrir a janela Swing correspondente.

  5. **Geração de arquivos CSV**
  - Sempre que um novo registro é criado, o sistema grava os dados em arquivos `.csv`.
  - Arquivos gerados:
     - `usuarios.csv` → armazena os usuários cadastrados
     - `equipes.csv` → armazena as equipes cadastradas
     - `projetos.csv` → armazena os projetos cadastrados
  - Esses arquivos podem ser abertos no Excel, LibreOffice ou até em um editor de texto comum.
