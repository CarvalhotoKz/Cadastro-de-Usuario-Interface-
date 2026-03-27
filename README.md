# Documentação do App 

## activity_main.xml
Interface incial, com botão de interação para Cadastrar, direciando para a página create_user.xml.

## create_user.xml
Interface de Cadastro de Usuário, com input de Nome e Email, seguindo de um botão de Salvar.

## Create_User.java
Importa os elmentos das classes /activity_main.xml - create_user.xml/ e os inicializa com intregração a interface do app.

## MainActivity.java
A classe MainActivity é a tela principal do aplicativo. Ela é responsável por exibir a lista de usuários cadastrados e permitir a navegação para a tela de cadastro de novos usuários.

#### Responsabilidades principais
* Exibir uma lista de nomes cadastrados usando RecyclerView
* Gerenciar os dados em memória durante a execução do app
* Permitir navegação para a tela de cadastro (CreateUser)
* Atualizar automaticamente a lista ao retornar de outra tela

#### Estrutura da Classe
Componentes principais

* RecyclerView → exibe a lista de usuários
* UserAdapter → conecta os dados à interface visual
* Button (btnCadastrar) → botão para ir à tela de cadastro


## UserAdapter.java
A classe UserAdapter é responsável por ligar os dados (lista de usuários) à interface gráfica exibida pelo RecyclerView.

Ela funciona como uma ponte entre: Dados (lista de nomes) / Visual (itens da lista na tela)

#### Responsabilidade Principal
* Criar os itens visuais da lista
* Preencher cada item com os dados corretos
* Informar ao Android quantos itens existem

#### Estrutura da Classe
Componenetes principais

* Entende RecyclerView.Adapter
* Usa um ViewHolder personalizado para melhor performance


## CreateUser.java

A classe CreateUser representa a tela de cadastro de usuário do aplicativo.

Ela é responsável por:

* Capturar os dados inseridos pelo usuário
* Validar informações básicas
* Adicionar o novo usuário à lista principal
* Retornar para a tela inicial (MainActivity)

#### Responsabilidades principais
* Receber nome e e-mail via formulário
* Validar o campo de nome
* Inserir o novo usuário na lista compartilhada
* Encerrar a tela após o cadastro

#### Estrutura da Classe
public class CreateUser extends AppCompatActivity

* Herda de AppCompatActivity
* Representa uma tela (Activity) do app Android