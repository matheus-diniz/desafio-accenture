package br.com.matheusdiniz.pages;

import br.com.matheusdiniz.resources.SingletonRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InsurantDataTab {

    private static String insurantDataTabId = "enterinsurantdata";
    private static String iptFirstNameId = "firstname";
    private static String iptLastNameId = "lastname";
    private static String dtpBirthDateId = "birthdate";
    private static String rdGenderMaleId = "gendermale";
    private static String rdGenderFemaleId = "genderfemale";
    private static String iptStreetAddresId = "streetaddress";
    private static String slCountryId = "country";
    private static String iptZipCode = "zipcode";
    private static String ipCityId = "city";
    private static String slOccupationId = "occupation";
    private static String rdSpeedingHobbyId = "speeding";
    private static String rdBungeeJumpingHobbyId = "bungeejumping";
    private static String rdCliffDivingHobbyId = "cliffdiving";
    private static String rdSkyDivingHobbyId = "skydiving";
    private static String rdOtherHobbyId = "other";
    private static String ipWebSiteId = "website";
    private static String ipFileBtnOpenId = "open";
    private static String btnNextId = "nextenterproductdata";

    private static String grpHobbiesClass = "group";

    private static WebDriverWait wait = new WebDriverWait(SingletonRunner.getInstance(), Duration.ofSeconds(8));

    public static WebElement insuratDataTab(){
        return SingletonRunner.getInstance().findElement(By.id(insurantDataTabId));
    }

    public static WebElement iptFirstName(){
        //return SingletonRunner.getInstance().findElement(By.id(iptFirstNameId));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(iptFirstNameId)));
    }

    public static WebElement iptLastName(){
        return SingletonRunner.getInstance().findElement(By.id(iptLastNameId));
    }

    public static WebElement datePickerBirthDate(){
        return SingletonRunner.getInstance().findElement(By.id(dtpBirthDateId));
    }

    public static WebElement selectGenderMale(){
        return SingletonRunner.getInstance().findElement(By.id(rdGenderMaleId));
    }

    public static WebElement selectGenderFemale(){
        return SingletonRunner.getInstance().findElement(By.id(rdGenderFemaleId));
    }

    public static WebElement iptStreetAddress(){
        return SingletonRunner.getInstance().findElement(By.id(iptStreetAddresId));
    }

    public static WebElement selectCountry(){
        return SingletonRunner.getInstance().findElement(By.id(slCountryId));
    }

    public static WebElement iptZipCode(){
        return SingletonRunner.getInstance().findElement(By.id(iptZipCode));
    }

    public static WebElement iptCity(){
        return SingletonRunner.getInstance().findElement(By.id(ipCityId));
    }

    public static WebElement selectOccupation(){
        return SingletonRunner.getInstance().findElement(By.id(slOccupationId));
    }

    public static WebElement radioSpeedingHobbyOpt(){
        return //SingletonRunner.getInstance().findElement(By.id(rdSpeedingHobbyId));
        SingletonRunner.getInstance().findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]"));
    }

    public static WebElement radioBungeeJumpingHobbyOpt(){
        return SingletonRunner.getInstance().findElement(By.id(rdBungeeJumpingHobbyId));
    }

    public static WebElement radioCliffDivingHobbyOpt(){
        return SingletonRunner.getInstance().findElement(By.id(rdCliffDivingHobbyId));
    }

    public static WebElement radioSkyDivingHobbyOpt(){
        return SingletonRunner.getInstance().findElement(By.id(rdSkyDivingHobbyId));
    }

    public static WebElement radioOtherHobbyOpt(){
        return SingletonRunner.getInstance().findElement(By.id(rdOtherHobbyId));
    }

    public static WebElement iptWebSite(){
        return SingletonRunner.getInstance().findElement(By.id(ipWebSiteId));
    }

    public static WebElement filePicutreOpen(){
        return SingletonRunner.getInstance().findElement(By.id(ipFileBtnOpenId));
    }

    public static WebElement btnNextProductData(){
        return SingletonRunner.getInstance().findElement(By.id(btnNextId));
    }

    public static WebElement groupHobbies(){
        return SingletonRunner.getInstance().findElement(By.className(grpHobbiesClass));
    }









}
