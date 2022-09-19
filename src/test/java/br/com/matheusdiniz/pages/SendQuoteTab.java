package br.com.matheusdiniz.pages;

import br.com.matheusdiniz.resources.SingletonRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SendQuoteTab {

    private static String sendQuoteTabId = "sendquote";
    private static String alertSucessClass = "sweet-alert showSweetAlert visible";

    private static String iptEmailId = "email";

    private static String iptUserNameId = "username";

    private static String iptPasswordId = "password";

    private static String iptConfirmPasswordId = "confirmpassword";

    private static String btnSendId = "sendemail";

    public static WebElement sendQuoteTab(){
        return SingletonRunner.getInstance().findElement(By.id(sendQuoteTabId));
    }

    public static WebElement sucessAlert(){
        return SingletonRunner.getInstance().findElement(By.xpath("/html/body/div[4]"));
    }

    public static WebElement iptEmail(){
        return SingletonRunner.getInstance().findElement(By.id(iptEmailId));
    }

    public static WebElement iptUserName(){
        return SingletonRunner.getInstance().findElement(By.id(iptUserNameId));
    }

    public static WebElement iptPassword(){
        return SingletonRunner.getInstance().findElement(By.id(iptPasswordId));
    }

    public static WebElement iptConfirmPassword(){
        return SingletonRunner.getInstance().findElement(By.id(iptConfirmPasswordId));
    }

    public static WebElement btnSend(){
        return SingletonRunner.getInstance().findElement(By.id(btnSendId));
    }


}
