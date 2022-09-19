package br.com.matheusdiniz.stepsdef;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.eo.Se;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.E;
import br.com.matheusdiniz.resources.SingletonRunner;
import io.cucumber.java.pt.Entao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import br.com.matheusdiniz.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class desafioAccenture {

    @Dado("que eu acesse o site {string}")
    public void que_eu_acesse_o_site(String string) {
        // Write code here that turns the phrase above into concrete actions
        SingletonRunner.getInstance().get(string);
        SingletonRunner.getInstance().manage().window().maximize();
    }

    @Quando("eu preencho os campos")
    public void eu_preencho_os_campos() {
        // Write code here that turns the phrase above into concrete actions
        //TODO: terminar de mapear/preenhcer todos os campos dessa tela

        Select selMake = new Select(vechileDataTab.selMake());
        selMake.selectByVisibleText("Ford");

        Select selModel = new Select(vechileDataTab.selModel());
        selModel.selectByIndex(selModel.getOptions().size()-1);

        vechileDataTab.iptCylinderCapacity().sendKeys("1500");

        vechileDataTab.iptEnginePerformance().sendKeys("150");

        //DATE -> vechileDataTab.dateDateofManufacture().click();
        vechileDataTab.dateDateofManufacture().sendKeys("05/01/1994");

        Select selNumberofSeats = new Select(vechileDataTab.selNumberofSeats());
        selNumberofSeats.selectByVisibleText("2");

        Select selNumberofSeats2 = new Select(vechileDataTab.selNumberofSeats());
        selNumberofSeats2.selectByVisibleText("2");

        Select selFuelType = new Select(vechileDataTab.selFuelType());
        selFuelType.selectByVisibleText("Gas");

        vechileDataTab.iptPayload().sendKeys("100");

        vechileDataTab.iptTotalWeight().sendKeys("630");

        vechileDataTab.iptListPrice().sendKeys("63500");

        vechileDataTab.iptAnnualMileage().sendKeys("500");

        //vechileDataTab.iptEnginePerfomance().sendKeys("500");

        //vechileDataTab.iptLicensePlateNumber().sendKeys("ABC1234");
    }

    @E("clico em next insurant data")
    public void clico_em_next_insurant_data() {
        // Write code here that turns the phrase above into concrete actions
        vechileDataTab.btnNext().click();
    }

    @Entao("Eu devo ver a aba Dados do Segurado")
    @Test
    public void eu_devo_ver_a_aba_dados_do_segurado() {
        // Write code here that turns the phrase above into concrete actions
        Assert.isTrue(insurantDataTab.insuratDataTab().isDisplayed(), "Não visivel");
        System.out.println("Test");
    }

    @Quando("aba Dados do Segurado é exibida")
    public void aba_dados_do_segurado_é_exibida() {
        // Write code here that turns the phrase above into concrete actions
        Assert.isTrue(insurantDataTab.insuratDataTab().isDisplayed(), "Aba Dados do Segurado não exibida");
        System.out.println("Aba Exibida");
    }

    @E("eu preencho os campos do segurado")
    public void eu_preencho_os_campos_do_segurado() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Entrei");
        insurantDataTab.iptFirstName().sendKeys("Matheus");
        System.out.println("First Name");
        insurantDataTab.iptLastName().sendKeys("Diniz");
        System.out.println("Last Name");
        //insurantDataTab.datePickerBirthDate().sendKeys("05/01/1994");
        //insurantDataTab.selectCountry().findElements(By.linkText("Brazil")).;
        insurantDataTab.iptZipCode().sendKeys("38.442-134");
        //insurantDataTab.selectOccupation().sendKeys("Employee");
        insurantDataTab.radioSpeedingHobbyOpt().click();
    }

    @E("clico em next product data")
    public void clico_em_next_product_data(){
        insurantDataTab.btnNextProductData().click();

    }

    @Entao("Eu devo ver a aba Dados do Produto")
    public void eu_devo_ver_a_aba_dados_do_produto() {
        // Write code here that turns the phrase above into concrete actions
        Assert.isTrue(productDataTab.productDataTab().isDisplayed(), "Não visivel");
    }

    @AfterAll()
    public static void quit(){
        SingletonRunner.getInstance().quit();
    }


}
