package br.com.matheusdiniz.pages;

import br.com.matheusdiniz.resources.SingletonRunner;
import io.cucumber.java.ro.Si;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class vechileDataTab {

    private static String btnNextId = "nextenterinsurantdata";

    private static String selMakeId = "make";

    private static String selModelId = "model";

    private static String iptCylinderCapacityId = "cylindercapacity";
    private static String iptEngPerfId = "engineperformance";

    private static String dtpDateofManufactureId = "dateofmanufacture";

    private static String selNumberofSeatsId = "numberofseats";

    private static String selFuelTypeId = "fuel";

    private static String iptPayloadId = "payload";

    private static String iptTotalWeightId = "totalweight";

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

    public static WebElement selMake(){
        return SingletonRunner.getInstance().findElement(By.id(selMakeId));
    }

    public static WebElement selModel(){
        return SingletonRunner.getInstance().findElement(By.id(selModelId));
    }

    public static WebElement iptCylinderCapacity(){
        return SingletonRunner.getInstance().findElement(By.id(iptCylinderCapacityId));
    }

    public static WebElement iptEnginePerformance(){
        return SingletonRunner.getInstance().findElement(By.id(iptEngPerfId));
    }

    public static WebElement dateDateofManufacture(){
        return SingletonRunner.getInstance().findElement(By.id(dtpDateofManufactureId));
    }

    public static WebElement selNumberofSeats(){
        return SingletonRunner.getInstance().findElement(By.id(selNumberofSeatsId));
    }

    public static WebElement selFuelType(){
        return SingletonRunner.getInstance().findElement(By.id(selFuelTypeId));
    }

    public static WebElement iptPayload(){
        return SingletonRunner.getInstance().findElement(By.id(iptPayloadId));
    }

    public static WebElement iptTotalWeight(){
        return SingletonRunner.getInstance().findElement(By.id(iptTotalWeightId));
    }




}
