package br.com.matheusdiniz.pages;

import br.com.matheusdiniz.resources.SingletonRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductDataTab {

    private static String productDataTabId = "enterproductdata";
    private static String dtStartDateId = "startdate";
    private static String selInsuranceSumId = "insurancesum";
    private static String selMeritRatingId = "meritrating";
    private static String selDamageInsuranceId = "damageinsurance";
    private static String chkOptEuroProtectionId = "EuroProtection";
    private static String chkOptLegalDefenseInsuranceId = "LegalDefenseInsurance";
    private static String selCourtesyCarId = "courtesycar";

    private static String btnNextSelectPriceOptionId = "nextselectpriceoption";

    public static WebElement productDataTab(){
        return SingletonRunner.getInstance().findElement(By.id(productDataTabId));
    }

    public static WebElement dtStartDate(){
        return SingletonRunner.getInstance().findElement(By.id(dtStartDateId));
    }

    public static WebElement selInsuranceSum(){
        return SingletonRunner.getInstance().findElement(By.id(selInsuranceSumId));
    }

    public static WebElement selMeritRating(){
        return SingletonRunner.getInstance().findElement(By.id(selMeritRatingId));
    }

    public static WebElement chkOptEuroProtection(){
        return SingletonRunner.getInstance().findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]"));
        //SingletonRunner.getInstance().findElement(By.id(chkOptEuroProtectionId));
    }

    public static WebElement chkOptLegalDefenseInsurance(){
        return SingletonRunner.getInstance().findElement(By.id(chkOptLegalDefenseInsuranceId));
    }

    public static WebElement selCourtesyCar(){
        return SingletonRunner.getInstance().findElement(By.id(selCourtesyCarId));
    }

    public static WebElement selDamageInsurance(){
        return SingletonRunner.getInstance().findElement(By.id(selDamageInsuranceId));
    }

    public static WebElement btnNextSelectPriceOption(){
        return SingletonRunner.getInstance().findElement(By.xpath("//*[@id=\"nextselectpriceoption\"]"));
        //SingletonRunner.getInstance().findElement(By.id(btnNextSelectPriceOptionId));
    }
}
