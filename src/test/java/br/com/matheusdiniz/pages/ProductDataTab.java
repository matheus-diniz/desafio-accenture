package br.com.matheusdiniz.pages;

import br.com.matheusdiniz.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductDataTab {

    private static String dtStartDateId = "startdate";
    private static String selInsuranceSumId = "insurancesum";
    private static String selMeritRatingId = "meritrating";
    private static String selDamageInsuranceId = "damageinsurance";
    private static String chkOptEuroProtectionId = "EuroProtection";
    private static String chkOptLegalDefenseInsuranceId = "LegalDefenseInsurance";
    private static String selCourtesyCarId = "courtesycar";

    private static String btnNextSelectPriceOptionId = "nextselectpriceoption";

    public static WebElement productDataTab(){
        String productDataTabId = "enterproductdata";
        return Singleton.getInstance().findElement(By.id(productDataTabId));
    }

    public static WebElement dtStartDate(){
        return Singleton.getInstance().findElement(By.id(dtStartDateId));
    }

    public static WebElement selInsuranceSum(){
        return Singleton.getInstance().findElement(By.id(selInsuranceSumId));
    }

    public static WebElement selMeritRating(){
        return Singleton.getInstance().findElement(By.id(selMeritRatingId));
    }

    public static WebElement chkOptEuroProtection(){
        return Singleton.getInstance().findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]"));
    }

    public static WebElement chkOptLegalDefenseInsurance(){
        return Singleton.getInstance().findElement(By.id(chkOptLegalDefenseInsuranceId));
    }

    public static WebElement selCourtesyCar(){
        return Singleton.getInstance().findElement(By.id(selCourtesyCarId));
    }

    public static WebElement selDamageInsurance(){
        return Singleton.getInstance().findElement(By.id(selDamageInsuranceId));
    }

    public static WebElement btnNextSelectPriceOption(){
        return Singleton.getInstance().findElement(By.xpath("//*[@id=\"nextselectpriceoption\"]"));
    }
}
