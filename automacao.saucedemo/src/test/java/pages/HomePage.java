package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

	public class HomePage {
	By user = By.id("user-name");
	By password = By.id("password");
	By btnLogin = By.id("login-button");
	By msgErroLogin = By.xpath("//div[@class='error-message-container error']");
	
	Metodos metodos = new Metodos();

	public void preencherCampos(String user, String password) {

		metodos.escrever(this.user, user);
		metodos.escrever(this.password, password);
		
	}
	
	public void btnLogar() {
		metodos.clicar(btnLogin);
		
			
	}

	public void validarUrl() {
		metodos.validarUrl("https://www.saucedemo.com/inventory.html");
	}
	
	public void printLogin() {
		metodos.evidencia("Login");
		
	}
	
	public void printLoginInvalido() {
		metodos.evidencia("Login Invalido");
		
	}
	
	public void validarMsgErro() {
		metodos.validarTexto(msgErroLogin, "Epic sadface: Username and password do not match any user in this service");
	}

}
