package br.com.matheusdiniz.stepsdef;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.AfterAll;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.E;
import br.com.matheusdiniz.Singleton;
import io.cucumber.java.pt.Entao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import br.com.matheusdiniz.pages.*;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.fail;


public class DesafioAccenture {

    @Dado("que eu acesse o site {string}")
    @Test
    public void que_eu_acesse_o_site(String url) {
        Singleton.getInstance().get(url);
        if (Singleton.getInstance().getTitle().contains("Maintenance")){
            fail("SITE EM MANUTENCAO");
        }
    }

    @Quando("eu preencho os campos")
    public void eu_preencho_os_campos() {
        Select selMake = new Select(VechileDataTab.selMake());
        selMake.selectByVisibleText("Ford");

        Select selModel = new Select(VechileDataTab.selModel());
        selModel.selectByIndex(selModel.getOptions().size()-1);

        VechileDataTab.iptCylinderCapacity().sendKeys("1500");

        VechileDataTab.iptEnginePerformance().sendKeys("150");

        VechileDataTab.dateDateofManufacture().sendKeys("08/05/2020");

        Select selNumberofSeats = new Select(VechileDataTab.selNumberofSeats());
        selNumberofSeats.selectByVisibleText("2");

        Select selNumberofSeatsMotorcycle = new Select(VechileDataTab.selNumberofSeatsMotorcycle());
        selNumberofSeatsMotorcycle.selectByVisibleText("2");

        Select selFuelType = new Select(VechileDataTab.selFuelType());
        selFuelType.selectByVisibleText("Gas");

        VechileDataTab.iptPayload().sendKeys("100");

        VechileDataTab.iptTotalWeight().sendKeys("630");

        VechileDataTab.iptListPrice().sendKeys("63500");

        VechileDataTab.iptAnnualMileage().sendKeys("500");
    }

    @E("clico em next insurant data")
    public void clico_em_next_insurant_data() {
        VechileDataTab.btnNext().click();
    }

    @Entao("Eu devo ver a aba Dados do Segurado")
    @Test
    public void eu_devo_ver_a_aba_dados_do_segurado() {
        Assert.isTrue(InsurantDataTab.insuratDataTab().isDisplayed(), "Não visivel");
    }

    @Quando("aba Dados do Segurado é exibida")
    public void aba_dados_do_segurado_é_exibida() {
        Assert.isTrue(InsurantDataTab.insuratDataTab().isDisplayed(), "Aba Dados do Segurado não exibida");

    }

    @E("eu preencho os campos do segurado")
    public void eu_preencho_os_campos_do_segurado() {
        InsurantDataTab.iptFirstName().sendKeys("Matheus");

        InsurantDataTab.iptLastName().sendKeys("Diniz");

        InsurantDataTab.datePickerBirthDate().sendKeys("05/01/1994");

        Select selCountry = new Select(InsurantDataTab.selectCountry());
        selCountry.selectByVisibleText("Brazil");

        InsurantDataTab.iptZipCode().sendKeys("38442134");

        Select selOccupation = new Select(InsurantDataTab.selectOccupation());
        selOccupation.selectByVisibleText("Employee");

        InsurantDataTab.radioSpeedingHobbyOpt().click();
    }

    @E("clico em next product data")
    public void clico_em_next_product_data(){
        InsurantDataTab.btnNextProductData().click();
    }

    @Entao("Eu devo ver a aba Dados do Produto")
    public void eu_devo_ver_a_aba_dados_do_produto() {
        Assert.isTrue(ProductDataTab.productDataTab().isDisplayed(), "Não visivel");
    }

    @Quando("aba Dados do Produto é exibida")
    public void aba_dados_do_produto_é_exibida() {
        Assert.isTrue(ProductDataTab.productDataTab().isDisplayed(), "Aba Dados do Produto não exibida");
    }
    @E("eu preecho os campos dados do Produto")
    public void eu_preecho_os_campos_dados_do_produto() {

        LocalDate now = LocalDate.now();
        //somar pelo menos 1 mes do atual
        now = now.plusMonths(3);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        String formatado = now.format(fmt);
        ProductDataTab.dtStartDate().sendKeys(formatado);

        Select selInsuranceSum = new Select(ProductDataTab.selInsuranceSum());
        selInsuranceSum.selectByIndex(selInsuranceSum.getOptions().size()/2);

        Select selMeritRating = new Select(ProductDataTab.selMeritRating());
        selMeritRating.selectByIndex(selMeritRating.getOptions().size()-1);

        Select selDamageInsurance = new Select(ProductDataTab.selDamageInsurance());
        selDamageInsurance.selectByIndex(1);

        ProductDataTab.chkOptEuroProtection().click();

        Select selCourtesyCar = new Select(ProductDataTab.selCourtesyCar());
        selCourtesyCar.selectByVisibleText("Yes");
    }
    @Quando("clico em next select price option")
    public void clico_em_next_select_price_option() {
        ProductDataTab.btnNextSelectPriceOption().click();
    }
    @Entao("Eu devo ver a aba Selecionar Opções de Preço")
    public void eu_devo_ver_a_aba_selecionar_opções_de_preço() {
        Assert.isTrue(PriceOptionTab.priceOptTab().isDisplayed(), "Opções de Preço Não Visíveis");
    }

    @Quando("aba Selecionar Precos for exibida")
    public void aba_selecionar_precos_for_exibida() {
        Assert.isTrue(PriceOptionTab.priceOptTab().isDisplayed(), "Opções de Preço Não Visíveis");
    }
    @E("eu selecionar uma opcao")
    public void eu_selecionar_uma_opcao() {
        PriceOptionTab.selectGoldOption().click();
    }
    @Quando("clicar no botao next send quote")
    public void clicar_no_botao_next_send_quote() {
        PriceOptionTab.btnNextSendQuote().click();
    }
    @Entao("eu devo ver a aba Enviar Proposta")
    public void eu_devo_ver_a_aba_enviar_proposta() {
        Assert.isTrue(SendQuoteTab.sendQuoteTab().isDisplayed(), "Aba de Envio de Proposta não visível");
    }

    @Quando("a aba Enviar Proposta for exibida")
    public void a_aba_enviar_proposta_for_exibida() {
        Assert.isTrue(SendQuoteTab.sendQuoteTab().isDisplayed(), "Aba de Envio de Proposta não visível");
    }
    @Quando("eu preencher os dados para envio")
    public void eu_preencher_os_dados_para_envio() {
        SendQuoteTab.iptEmail().sendKeys("matheusalvesdiniz+15@gmail.com");
        SendQuoteTab.iptUserName().sendKeys("matheus.diniz");
        SendQuoteTab.iptPassword().sendKeys("AsdfG@123");
        SendQuoteTab.iptConfirmPassword().sendKeys("AsdfG@123");

    }
    @Quando("clicar no botao enviar")
    public void clicar_no_botao_enviar() {
        SendQuoteTab.btnSend().click();
    }
    @Entao("a mensagem Sending e-mail success devera aparecer")
    public void a_mensagem_sending_e_mail_success_devera_aparecer() {
        if (!SendQuoteTab.sucessAlert().isDisplayed()) {
            fail("Mensagem de Sucesso nao exibida");
        }
        if (SendQuoteTab.sucessAlert().getText().contains("Sending e-mail success!")){
            Assertions.assertTrue(true);
        }
    }

    @AfterAll()
    public static void quit(){
        Singleton.getInstance().quit();
    }


}
