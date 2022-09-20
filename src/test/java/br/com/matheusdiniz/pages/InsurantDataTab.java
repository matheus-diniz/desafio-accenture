package br.com.matheusdiniz.pages;

import br.com.matheusdiniz.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InsurantDataTab {

    private static final String rdSpeedingHobbyId = "speeding";

    private static String grpHobbiesClass = "group";

    private static final WebDriverWait wait = new WebDriverWait(Singleton.getInstance(), Duration.ofSeconds(8));

    public static WebElement insuratDataTab(){
        String insurantDataTabId = "enterinsurantdata";
        return Singleton.getInstance().findElement(By.id(insurantDataTabId));
    }

    public static WebElement iptFirstName(){
        String iptFirstNameId = "firstname";
        return Singleton.getInstance().findElement(By.id(iptFirstNameId));
    }

    public static WebElement iptLastName(){
        String iptLastNameId = "lastname";
        return Singleton.getInstance().findElement(By.id(iptLastNameId));
    }

    public static WebElement datePickerBirthDate(){
        String dtpBirthDateId = "birthdate";
        return Singleton.getInstance().findElement(By.id(dtpBirthDateId));
    }

    public static WebElement selectGenderMale(){
        String rdGenderMaleId = "gendermale";
        return Singleton.getInstance().findElement(By.id(rdGenderMaleId));
    }

    public static WebElement selectGenderFemale(){
        String rdGenderFemaleId = "genderfemale";
        return Singleton.getInstance().findElement(By.id(rdGenderFemaleId));
    }

    public static WebElement iptStreetAddress(){
        String iptStreetAddresId = "streetaddress";
        return Singleton.getInstance().findElement(By.id(iptStreetAddresId));
    }

    public static WebElement selectCountry(){
        String slCountryId = "country";
        return Singleton.getInstance().findElement(By.id(slCountryId));
    }

    public static WebElement iptZipCode(){
        String iptZipCode = "zipcode";
        return Singleton.getInstance().findElement(By.id(iptZipCode));
    }

    public static WebElement iptCity(){
        String ipCityId = "city";
        return Singleton.getInstance().findElement(By.id(ipCityId));
    }

    public static WebElement selectOccupation(){
        String slOccupationId = "occupation";
        return Singleton.getInstance().findElement(By.id(slOccupationId));
    }

    public static WebElement radioSpeedingHobbyOpt(){
        return Singleton.getInstance().findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]"));
    }

    public static WebElement radioBungeeJumpingHobbyOpt(){
        String rdBungeeJumpingHobbyId = "bungeejumping";
        return Singleton.getInstance().findElement(By.id(rdBungeeJumpingHobbyId));
    }

    public static WebElement radioCliffDivingHobbyOpt(){
        String rdCliffDivingHobbyId = "cliffdiving";
        return Singleton.getInstance().findElement(By.id(rdCliffDivingHobbyId));
    }

    public static WebElement radioSkyDivingHobbyOpt(){
        String rdSkyDivingHobbyId = "skydiving";
        return Singleton.getInstance().findElement(By.id(rdSkyDivingHobbyId));
    }

    public static WebElement radioOtherHobbyOpt(){
        String rdOtherHobbyId = "other";
        return Singleton.getInstance().findElement(By.id(rdOtherHobbyId));
    }

    public static WebElement iptWebSite(){
        String ipWebSiteId = "website";
        return Singleton.getInstance().findElement(By.id(ipWebSiteId));
    }

    public static WebElement filePicutreOpen(){
        String ipFileBtnOpenId = "open";
        return Singleton.getInstance().findElement(By.id(ipFileBtnOpenId));
    }

    public static WebElement btnNextProductData(){
        String btnNextId = "nextenterproductdata";
        return Singleton.getInstance().findElement(By.id(btnNextId));
    }

    public static WebElement groupHobbies(){
        return Singleton.getInstance().findElement(By.className(grpHobbiesClass));
    }
}
