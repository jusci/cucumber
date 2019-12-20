package br.ce.wcaquino.runners;
import org.junit.runner.RunWith;// Responsavel por instanciar uma classe de testes e executar todos os seu respectivos métodos
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;

@RunWith (Cucumber.class)
@CucumberOptions(
		         features="src/test/resources/features/inserir_conta.feature",
		        //features="src/test/resources/features/alugar_filme.feature",
		        //features="src/test/resources/features/aprender_cucumber.feature",
		         glue="br.ce.wcaquino.steps",
		         tags= {},
		         //tags= {"@tipo1, @tipo2"},// exemplo de um tipo de tag ex: execute todos os teste que possui tipo1 e tipo2
		         plugin= {"pretty","html:target/report-html","json:target/report.json"}, // O relatório pretty é em forma de texto no console. O relatorio ficará armazenado na pasta target
                 monochrome =true,// tira os caracteres especiais do console
                 snippets = SnippetType.CAMELCASE, // formatação Camelcase ( sem underline nos metodos do cucumber)
                 dryRun = false,
                 strict = false
                 )

public class Runner {
	
	
	
	@BeforeClass
	
	public static void reset() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://srbarriga.herokuapp.com");
		driver.findElement(By.id("email")).sendKeys("ju.reis@reis.com.br");
		driver.findElement(By.name("senha")).sendKeys("12345678");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.linkText("reset")).click();
		driver.quit();				
	}
	

}
