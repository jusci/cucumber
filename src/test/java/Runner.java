import org.junit.runner.RunWith;// Responsavel por instanciar uma classe de testes e executar todos os seu respectivos m�todos

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(plugin= "pretty", 
                 monochrome =true,// tira os caracteres especiais do console
                 snippets = SnippetType.CAMELCASE, // formata��o Camelcase 9 sem underline nos metodos do cucumber
                 dryRun = false
                 )

public class Runner {

}
