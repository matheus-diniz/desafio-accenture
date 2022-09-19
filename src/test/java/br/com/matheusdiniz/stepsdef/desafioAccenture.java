package br.com.matheusdiniz.stepsdef;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.E;
import br.com.matheusdiniz.resources.SingletonRunner;
import io.cucumber.java.pt.Entao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import br.com.matheusdiniz.pages.*;
import org.openqa.selenium.By;

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
        vechileDataTab.iptEnginePerfomance().sendKeys("500");
        vechileDataTab.iptListPrice().sendKeys("500");
        vechileDataTab.iptLicensePlateNumber().sendKeys("ABC1234");
        vechileDataTab.iptAnnualMileage().sendKeys("500");
    }

    @E("clico em next")
    public void clico_em_next() {
        // Write code here that turns the phrase above into concrete actions
        vechileDataTab.btnNext().click();
    }

    @Entao("Eu devo ver a aba Dados do Segurado")
    public void eu_devo_ver_a_aba_dados_do_segurado() {
        // Write code here that turns the phrase above into concrete actions
        //SingletonRunner.getInstance().findElement(By.id(insurantDataTab.isurantDataTabId));
        Assert.isTrue(insurantDataTab.insuratDataTab().isDisplayed(), "Não visivel");
    }

    @After()
    public static void quit(){
        SingletonRunner.getInstance().quit();
    }
}
