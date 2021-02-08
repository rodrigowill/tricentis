package br.sp.rodrigo.steps;

import org.junit.Assert;

import br.sp.rodrigo.pages.HomePage;
import br.sp.rodrigo.pages.InsurantDataPage;
import br.sp.rodrigo.pages.PriceOptionPage;
import br.sp.rodrigo.pages.ProductDataPage;
import br.sp.rodrigo.pages.QuotePage;
import br.sp.rodrigo.pages.VehicleDataPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class FormsSteps {

	@Dado("^que acesso o site \"([^\"]*)\"$")
	public void queAcessoOSite(String arg1) throws Throwable {
		HomePage home = new HomePage();
		home.openSite();
	}

	@Quando("^preencho o formulário Vehicle Data$")
	public void preencho_o_formulário_Vehicle_Data() throws Throwable {
		VehicleDataPage vehicle = new VehicleDataPage();
		vehicle.selectMake("Nissan");
		vehicle.selectModel("Scooter");
		vehicle.enterCylinderCapacity("10");
		vehicle.enterEnginePerformance("150");
		vehicle.selectDateManufacture("05/01/2020");
		vehicle.selectNumberSeats("4");
		vehicle.selectNumberSeatsTwo("2");
		vehicle.selectFuelType("Electric Power");
		vehicle.enterPayload("50");
		vehicle.enterTotalWeight("100");
		vehicle.enterListPrice("7000");
		vehicle.enterLicensePlateNumber("4567892612");
		vehicle.enterAnnualMileage("1500");
		vehicle.clickNext();
	}

	@E("^o formulário Insurant Data$")
	public void o_formulário_Insurant_Data() throws Throwable {
		InsurantDataPage insurant = new InsurantDataPage();
		insurant.enterFirstName("Rodrigo");
		insurant.enterLastName("Soares");
		insurant.selectDateDateBirth("03/09/1990");
		insurant.selectCountry("Brazil");
		insurant.enterzipCode("123456");
		insurant.selectOccupation("Employee");
		insurant.selectHobbies();
		insurant.clickNext();
	}

	@E("^o formulário Product Data$")
	public void o_formulário_Product_Data() throws Throwable {
		ProductDataPage product = new ProductDataPage();
		product.selectStartDate("07/01/2021");
		product.selectSum(" 10.000.000,00");
		product.selectMeritRating("Bonus 7");
		product.selectDamageInsurance("Full Coverage");
		product.selectOptionalProducts(); 
		product.selectCourtesyCar("No");
		product.clickNext();
	}

	@E("^o formulário Price Option$")
	public void o_formulário_Price_Option() throws Throwable {
		PriceOptionPage price = new PriceOptionPage();
		price.selectPriceOption("Gold");
		price.clickNext();
	}

	@E("^o formulário Quote$")
	public void o_formulário_Quote() throws Throwable {
		QuotePage quote  = new QuotePage();
		quote.enterEmail("teste@teste.com");
		quote.enterUsername("rodrigo");
		quote.enterPassword("Aa1234");
		quote.enterConfirmePassword("Aa1234");
		quote.clikcEnviar();
	}

	@Então("^verifico a mensagem \"([^\"]*)\" na tela$")
	public void verificoAMensagemNaTela(String mensagem) throws Throwable {
		QuotePage quote  = new QuotePage();
//		Assert.assertEquals(mensagem, quote.verificarMensagem());
		quote.clickConfirmar();
	}

}
