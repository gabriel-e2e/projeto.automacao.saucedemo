package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProdutosPage;
import runner.Executa;

public class Produtos {

	ProdutosPage page = new ProdutosPage();

	public void iniciarTeste() {
		Executa.inicarTeste();
	}

	@Given("que esteja lojado")
	public void que_esteja_logado() {
		page.login("standard_user", "secret_sauce");

	}

	@When("incluo produto no carrinho")
	public void incluo_produto_no_carrinho() {
		page.adicionar();

	}

	@Then("visualizo o produto no carrinho")
	public void visualizo_o_produto_no_carrinho() {
		page.acessarCarrinho();
		page.validarCarrinho();
		page.printInlcuirProdutos();
		Executa.fecharNavegador();
	}

	@When("incluo produto no carrinho e removo")
	public void incluo_produto_no_carrinho_e_removo() {
		page.adicionar();
		page.remover();
	}

	@Given("que esteja logado")
	public void queEstejaLogado() {
		page.login("standard_user", "secret_sauce");

	}

	@Then("visualizo o carrinho vazio")
	public void visualizo_o_carrinho_vazio() {
		page.acessarCarrinho();
		page.printRemoverProduto();
		Executa.fecharNavegador();

	}

	@When("clico no filtro de selecao")
	public void clico_no_filtro_de_selecap() {
		page.ordenarProdutos(2);

	}

	@Then("visualizo pagina com filtro escolhido")
	public void visualizo_pagina_com_filtro_escolhido() {
		page.printOrdenarProdutos();
		Executa.fecharNavegador();

	}

	@Given("escolher um produto")
	public void escolherUmProduto() {
		page.adicionar();
		
	}

	@When("acessar o carrinho")
	public void acessarOCarrinho() {
		page.acessarCarrinho();
	}

	@Then("valido o produto no carrinho")
	public void validoOProdutoNoCarrinho() {
		page.validarCarrinho();
		page.printAcessarCarrinho();
		Executa.fecharNavegador();

	}

}
