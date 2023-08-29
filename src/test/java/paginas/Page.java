package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.Objects;

public class Page {
    private WebDriver navegador;
    public Page(WebDriver navegador){
        this.navegador = navegador;
    }
    public Page ClickSimplesLinkText(String campo){
        this.navegador.findElement(By.linkText(campo)).click();
        return this;
    }

    public Page ClickSimnplesXpathEditDelete(String campo){

        for (int i = 2; i <= 10; i++) {
            if (Objects.equals(campo, "Edit")){
                navegador.findElement(By.xpath("(//a[contains(text(),'edit')])[" + i + "]")).click();
            }else {
                navegador.findElement(By.xpath("(//a[contains(text(),'delete')])[" + i + "]")).click();
            }

        }
        return this;
    }

    public Page ClickSimplesXpath(String campo){
        this.navegador.findElement(By.xpath(campo)).click();
        return this;
    }
}
