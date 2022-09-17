package br.com.matheusdiniz.pages;

import br.com.matheusdiniz.resources.SingletonRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class insurantDataTab {

    private static String insurantDataTabId = "enterinsurantdata";

    public static WebElement insuratDataTab(){
        return SingletonRunner.getInstance().findElement(By.id(insurantDataTabId));
    }




}
