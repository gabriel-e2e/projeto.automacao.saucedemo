#Author: gabriel.sbrissa.nunes@gmail.com

@regressivo
Feature: Login
  Eu como usuario
  Quero realizar login
  Para comprar produtos

  
  Scenario: Login valido
    Given que desejo fazer login
    When enviar os dados validos
    Then usuario logado
    
    
  Scenario: Login invalido
    Given que acesse o site saucedemo
    When enviar os dados de login invalidos
    Then visualizo mensagem de erro
    
   

 