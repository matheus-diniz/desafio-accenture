#language:pt

Funcionalidade: Fazer desafio Accenture
  Eu, como candidato
  Desejo realizar a prova-desafio QA na empresa Accenture

  Contexto:
    Dado que eu acesse o site "http://sampleapp.tricentis.com/101/app.php"

  Cenario: Preencher aba Dados do Veiculo
    Quando eu preencho os campos
    E clico em next insurant data
    Entao Eu devo ver a aba Dados do Segurado


    Cenario: Preencher aba Dados Dados do Segurado
      Quando aba Dados do Segurado é exibida
      E eu preencho os campos do segurado
      E clico em next product data
      Entao Eu devo ver a aba Dados do Produto










