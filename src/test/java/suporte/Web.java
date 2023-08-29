package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Web {
     public static WebDriver createChrome(){

        System.setProperty("webdriver.chrome.driver","C:\\Navegadores\\ChromeDriver116\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.manage().window().maximize();
        navegador.get("https://the-internet.herokuapp.com/challenging_dom");
        return navegador;
    }

}
