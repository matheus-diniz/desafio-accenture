#language:pt

Funcionalidade: Fazer desafio Accenture
  Eu, como candidato
  Desejo realizar a prova-desafio QA na empresa Accenture

#  Contexto:
#    Dado que eu acesse o site "http://sampleapp.tricentis.com/101/app.php"

  Cenario: Preencher aba Dados do Veiculo
    Dado que eu acesse o site "http://sampleapp.tricentis.com/101/app.php"
    Quando eu preencho os campos
    E clico em next insurant data
    Entao Eu devo ver a aba Dados do Segurado

  Cenario: Preencher aba Dados Dados do Segurado
    Quando aba Dados do Segurado é exibida
    E eu preencho os campos do segurado
    E clico em next product data
    Entao Eu devo ver a aba Dados do Produto

  Cenario: Preecher aba Dados do Produto
    Quando aba Dados do Produto é exibida
    E eu preecho os campos dados do Produto
    E clico em next select price option
    Entao Eu devo ver a aba Selecionar Opções de Preço

  Cenario: Selecionar opcoes de preco
    Quando aba Selecionar Precos for exibida
    E eu selecionar uma opcao
    E clicar no botao next send quote
    Entao eu devo ver a aba Enviar Proposta

    Cenario: Enviar a proposta
      Quando a aba Enviar Proposta for exibida
      E eu preencher os dados para envio
      E clicar no botao enviar
      Entao a mensagem Sending e-mail success devera aparecer










