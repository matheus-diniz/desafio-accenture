package br.com.matheusdiniz.pages;

import br.com.matheusdiniz.resources.SingletonRunner;
import io.cucumber.java.ro.Si;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class vechileDataTab {

    private static String btnNextId = "nextenterinsurantdata";
    private static String iptEngPerfId = "engineperformance";
    private static String iptListPriceId = "listprice";
    private static String iptLicensePlateNumberId = "licenseplatenumber";
    private static String iptAnnualMileageId = "annualmileage";

    public static WebElement btnNext(){
        return SingletonRunner.getInstance().findElement(By.id(btnNextId));
    }

    public static WebElement iptEnginePerfomance(){
        return SingletonRunner.getInstance().findElement(By.id(iptEngPerfId));
    }

    public static WebElement iptListPrice(){
        return SingletonRunner.getInstance().findElement(By.id(iptListPriceId));
    }

    public static WebElement iptLicensePlateNumber(){
        return SingletonRunner.getInstance().findElement(By.id(iptLicensePlateNumberId));
    }

    public static WebElement iptAnnualMileage(){
        return SingletonRunner.getInstance().findElement(By.id(iptAnnualMileageId));
    }




}
