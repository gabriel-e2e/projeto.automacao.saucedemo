package metodos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import drivers.DriversFactory;

public class Metodos extends DriversFactory {

	public void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("******N�o foi poss�vel escrever******");
			System.out.println("******Causa do erro******" + e.getCause());
		}
	}

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("******N�o foi poss�vel clicar******");
			System.out.println("******Causa do erro******" + e.getCause());
		}
	}

	public void addCarrinho(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("******N�o foi poss�vel addCarrinho******");
			System.out.println("******Causa do erro******" + e.getCause());
		}
	}

	public void removerCarrinho(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("******N�o foi poss�vel removerCarrinho******");
			System.out.println("******Causa do erro******" + e.getCause());
		}
	}

	public void acessarCarrinho(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("******N�o foi poss�vel acessarCarrinho******");
			System.out.println("******Causa do erro******" + e.getCause());
		}
	}

	public void validarProduto(By elemento) {

		try {
			String produto = driver.findElement(elemento).getText();
			assertTrue(produto.contains("Fleece"));
		} catch (Exception e) {
			System.err.println("******N�o foi poss�vel validarProduto******");
			System.out.println("******Causa do erro******" + e.getCause());
		}
	}

	public void validarUrl(String urlDesejada) {

		try {
			assertEquals(urlDesejada, driver.getCurrentUrl());
		} catch (Exception e) {
			System.err.println("******N�o foi poss�vel validarUrl******");
			System.out.println("******Causa do erro******" + e.getCause());
		}

	}

	public void evidencia(String nomeTeste) {
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./evidencias/" + nomeTeste + ".png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Erro ao tirar evid�ncia");
		}
	}
	
	public void validarTexto(By elemento, String MensagemEsperada) {
		
		try {
			String msgCapturada = driver.findElement(elemento).getText();
			assertEquals(MensagemEsperada, msgCapturada);
		} catch (Exception e) {
			System.err.println("Erro ao tentar validar a mensagem esperada" + MensagemEsperada);
			
		}
	}
}
