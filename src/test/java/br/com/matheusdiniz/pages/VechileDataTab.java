package br.com.matheusdiniz.pages;

import br.com.matheusdiniz.resources.SingletonRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VechileDataTab {

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

    private static String selNumberofSeatsMotorcycleId = "numberofseatsmotorcycle";


    public static WebElement btnNext(){
        return SingletonRunner.getInstance().findElement(By.id(btnNextId));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(btnNextId)));
    }

    public static WebElement iptEnginePerfomance(){
        return SingletonRunner.getInstance().findElement(By.id(iptEngPerfId));
    }

    public static WebElement iptListPrice(){
        return SingletonRunner.getInstance().findElement(By.id(iptListPriceId));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(iptListPriceId)));

    }

    public static WebElement iptLicensePlateNumber(){
        return SingletonRunner.getInstance().findElement(By.id(iptLicensePlateNumberId));
    }

    public static WebElement iptAnnualMileage(){
        return SingletonRunner.getInstance().findElement(By.id(iptAnnualMileageId));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(iptAnnualMileageId)));
    }

    public static WebElement selMake(){
        return SingletonRunner.getInstance().findElement(By.id(selMakeId));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(selMakeId)));
    }

    public static WebElement selModel(){
        return SingletonRunner.getInstance().findElement(By.id(selModelId));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(selModelId)));

    }

    public static WebElement iptCylinderCapacity(){
        return //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(iptCylinderCapacityId)));
        SingletonRunner.getInstance().findElement(By.id(iptCylinderCapacityId));
    }

    public static WebElement iptEnginePerformance(){
        return //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(iptEngPerfId)));
        SingletonRunner.getInstance().findElement(By.id(iptEngPerfId));
    }

    public static WebElement dateDateofManufacture(){
        return //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(dtpDateofManufactureId)));
        SingletonRunner.getInstance().findElement(By.id(dtpDateofManufactureId));
    }

    public static WebElement selNumberofSeats(){
        return //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(selNumberofSeatsId)));
        SingletonRunner.getInstance().findElement(By.id(selNumberofSeatsId));
    }

    public static WebElement selNumberofSeatsMotorcycle(){
        return //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(selNumberofSeatsMotorcycleId)));
        SingletonRunner.getInstance().findElement(By.id(selNumberofSeatsMotorcycleId));
    }

    public static WebElement selFuelType(){
        return //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(selFuelTypeId)));
        SingletonRunner.getInstance().findElement(By.id(selFuelTypeId));
    }

    public static WebElement iptPayload(){
        return //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(iptPayloadId)));
        SingletonRunner.getInstance().findElement(By.id(iptPayloadId));
    }

    public static WebElement iptTotalWeight(){
        return //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(iptTotalWeightId)));
        SingletonRunner.getInstance().findElement(By.id(iptTotalWeightId));
    }




}
