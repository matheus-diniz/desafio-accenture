package br.com.matheusdiniz.pages;

import br.com.matheusdiniz.resources.SingletonRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class productDataTab {

    private static String productDataTabId = "enterproductdata";

    public static WebElement productDataTab(){
        return SingletonRunner.getInstance().findElement(By.id(productDataTabId));
    }
}
