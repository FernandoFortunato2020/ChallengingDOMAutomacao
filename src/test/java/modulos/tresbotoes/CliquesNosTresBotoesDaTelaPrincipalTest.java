package modulos.tresbotoes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import paginas.Page;
import suporte.Web;

public class CliquesNosTresBotoesDaTelaPrincipalTest {
    private WebDriver navegador;

    @BeforeEach
    public void beforeEach(){
        navegador = Web.createChrome();
    }

    @DisplayName("Este teste automatizado realiza cliques em todos os botões exibidos na tela")
    @Test
    public void testClicarNosTresBotoesDaTelaPrincipal(){

        new Page(navegador)
                .ClickSimplesXpath("//a[@class='button']")
                .ClickSimplesXpath("//a[@class='button success']")
                .ClickSimplesXpath("//a[@class='button alert']");
    }
    @AfterEach
    public void afterEach(){
        this.navegador.quit();
    }
}
