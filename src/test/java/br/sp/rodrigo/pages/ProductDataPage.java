package br.sp.rodrigo.pages;

import br.sp.rodrigo.core.BasePage;

public class ProductDataPage extends BasePage {

	public void selectStartDate(String date) {
		escrever("startdate", date);		
	}

	public void selectSum(String sum) {
		selecionaComboPorId("insurancesum", sum);
	}

	public void selectMeritRating(String rating) {
		selecionaComboPorId("meritrating", rating);
	}

	public void selectDamageInsurance(String rating) {
		selecionaComboPorId("damageinsurance", rating);
	}

	public void selectOptionalProducts() {
		selecionaLabel("EuroProtection");
	}

	public void selectCourtesyCar(String courtesycar) {
		selecionaComboPorId("courtesycar", courtesycar);
	}

	public void clickNext() {
		clicarBotao("nextselectpriceoption");		
	}

}
