#Author: gabriel.sbrissa.nunes@gmail.com
@regressivo1
Feature: Produtos
  Eu como usuario
  Quero incluir e remover produtos do carrinho
  Para testar funcionalidade

  
  Scenario: Incluir produto no carrinho
    Given que esteja lojado
    When incluo produto no carrinho
    Then visualizo o produto no carrinho
    
  Scenario: Remover produto do carrinho  
  	Given que esteja logado
    When incluo produto no carrinho e removo
    Then visualizo o carrinho vazio
    
   Scenario: Ordenar produtos
   Given que esteja logado
   When clico no filtro de selecao
   Then visualizo pagina com filtro escolhido
   
   Scenario: Acessar carrinho
    Given que esteja logado
    And escolher um produto
    When acessar o carrinho
    Then valido o produto no carrinho
  	