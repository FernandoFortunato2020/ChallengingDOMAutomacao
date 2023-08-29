package modulos.delete;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import paginas.Page;
import suporte.Web;

public class CliquesEmTodasAsOpcoesDeleteDaGridTest {
    private WebDriver navegador;

    @BeforeEach
    public void beforeEach(){
       navegador = Web.createChrome();
    }

    @DisplayName("Este teste automatizado realiza cliques em todas as opções Delete exibidas na grid")
    @Test
    public void testClicarNoDeleteDaGrid(){
        new Page(navegador)
                .ClickSimplesLinkText("delete")
                .ClickSimnplesXpathEditDelete("Delete");
    }

    @AfterEach
    public void afterEach(){
        this.navegador.quit();
    }
}
