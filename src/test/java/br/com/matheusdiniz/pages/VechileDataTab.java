package br.com.matheusdiniz.pages;

import br.com.matheusdiniz.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VechileDataTab {

    private static final String iptEngPerfId = "engineperformance";

    private static String selNumberofSeatsMotorcycleId = "numberofseatsmotorcycle";


    public static WebElement btnNext(){
        String btnNextId = "nextenterinsurantdata";
        return Singleton.getInstance().findElement(By.id(btnNextId));
    }

    public static WebElement iptEnginePerfomance(){
        return Singleton.getInstance().findElement(By.id(iptEngPerfId));
    }

    public static WebElement iptListPrice(){
        String iptListPriceId = "listprice";
        return Singleton.getInstance().findElement(By.id(iptListPriceId));
    }

    public static WebElement iptLicensePlateNumber(){
        String iptLicensePlateNumberId = "licenseplatenumber";
        return Singleton.getInstance().findElement(By.id(iptLicensePlateNumberId));
    }

    public static WebElement iptAnnualMileage(){
        String iptAnnualMileageId = "annualmileage";
        return Singleton.getInstance().findElement(By.id(iptAnnualMileageId));
    }

    public static WebElement selMake(){
        String selMakeId = "make";
        return Singleton.getInstance().findElement(By.id(selMakeId));
    }

    public static WebElement selModel(){
        String selModelId = "model";
        return Singleton.getInstance().findElement(By.id(selModelId));
    }

    public static WebElement iptCylinderCapacity(){
        String iptCylinderCapacityId = "cylindercapacity";
        return Singleton.getInstance().findElement(By.id(iptCylinderCapacityId));
    }

    public static WebElement iptEnginePerformance(){
        return Singleton.getInstance().findElement(By.id(iptEngPerfId));
    }

    public static WebElement dateDateofManufacture(){
        String dtpDateofManufactureId = "dateofmanufacture";
        return Singleton.getInstance().findElement(By.id(dtpDateofManufactureId));
    }

    public static WebElement selNumberofSeats(){
        String selNumberofSeatsId = "numberofseats";
        return Singleton.getInstance().findElement(By.id(selNumberofSeatsId));
    }

    public static WebElement selNumberofSeatsMotorcycle(){
        return Singleton.getInstance().findElement(By.id(selNumberofSeatsMotorcycleId));
    }

    public static WebElement selFuelType(){
        String selFuelTypeId = "fuel";
        return Singleton.getInstance().findElement(By.id(selFuelTypeId));
    }

    public static WebElement iptPayload(){
        String iptPayloadId = "payload";
        return Singleton.getInstance().findElement(By.id(iptPayloadId));
    }

    public static WebElement iptTotalWeight(){
        String iptTotalWeightId = "totalweight";
        return Singleton.getInstance().findElement(By.id(iptTotalWeightId));
    }
}
