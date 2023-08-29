package modulos.edit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import paginas.Page;
import suporte.Web;

public class CliquesEmTodasAsOpcoesEditDaGridTest {
    private WebDriver navegador;

    @BeforeEach
    public void beforeEach(){
        navegador = Web.createChrome();
    }

    @DisplayName("Este teste automatizado realiza cliques em todas as opções Editar exibidas na grid")
    @Test
    public void testClicarNoEditDaGrid(){
        new Page(navegador)
                .ClickSimplesLinkText("edit")
                .ClickSimnplesXpathEditDelete("Edit");
    }

    @AfterEach
    public void afterEach(){
        this.navegador.quit();
    }
}
