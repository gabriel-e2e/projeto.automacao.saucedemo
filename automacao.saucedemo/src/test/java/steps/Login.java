package steps;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import runner.Executa;

public class Login {
	
	
	HomePage page = new HomePage();
	@Before
	public void iniciarTesteLogin() {
		Executa.inicarTeste();
	}
	   
	
	
	@Given("que desejo fazer login")
	public void que_desejo_fazer_login() {
		page.preencherCampos("standard_user", "secret_sauce");
		
	}

	@When("enviar os dados validos")
	public void enviar_os_dados() {
		page.btnLogar();
	    
	}

	@Then("usuario logado")
	public void usuario_logado() {
		page.validarUrl();
		page.printLogin();
		Executa.fecharNavegador();
	   
	}
	
	@Given("que acesse o site saucedemo")
	public void que_acesse_o_site_saucedemo() {
		page.preencherCampos("standard_user", "secret_sauce1122211");
		
	}

	@When("enviar os dados de login invalidos")
	public void enviar_os_dados_de_login_invalidos() {
		page.btnLogar();
	    
	}

	@Then("visualizo mensagem de erro")
	public void visualizo_mensagem_de_erro() {
		page.validarMsgErro();
		page.printLoginInvalido();
		Executa.fecharNavegador();
	   
	}

}
