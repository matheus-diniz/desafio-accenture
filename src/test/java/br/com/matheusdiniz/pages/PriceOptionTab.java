package br.com.matheusdiniz.pages;

import br.com.matheusdiniz.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PriceOptionTab {

    private static String priceOptTabId = "selectpriceoption";
    private static String selGolOptionXpath = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]";
    private static String btnNextSendQuoteId = "nextsendquote";

    public static WebElement priceOptTab(){
        return Singleton.getInstance().findElement(By.id(priceOptTabId));
    }

    public static WebElement selectGoldOption(){
        return Singleton.getInstance().findElement(By.xpath(selGolOptionXpath));
    }

    public static WebElement btnNextSendQuote(){
        return Singleton.getInstance().findElement(By.id(btnNextSendQuoteId));
    }



}
