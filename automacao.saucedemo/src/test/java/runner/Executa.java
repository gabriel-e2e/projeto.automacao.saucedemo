package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import drivers.DriversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "steps",
		tags = "@regressivo or @regressivo1",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/cucumber-report.html"},
		snippets = SnippetType.CAMELCASE
		)





public class Executa extends DriversFactory{
	
	public static void inicarTeste() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		
	
	}
	
	public static void fecharNavegador() {
		driver.close();
		
	}

}
