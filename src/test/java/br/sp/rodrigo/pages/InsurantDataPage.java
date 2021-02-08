package br.sp.rodrigo.pages;

import br.sp.rodrigo.core.BasePage;

public class InsurantDataPage extends BasePage {

	public void enterFirstName(String name) {
		escrever("firstname", name);
	}

	public void enterLastName(String lastName) {
		escrever("lastname", lastName);		
	}

	public void selectDateDateBirth(String date) {
		escrever("birthdate", date);
	}

	public void selectCountry(String country) {
		selecionaComboPorId("country", country);		
	}

	public void enterzipCode(String zipcode) {
		escrever("zipcode", zipcode);
	}

	public void selectOccupation(String occupation) {
		selecionaComboPorId("occupation", occupation);
	}

	public void selectHobbies() {
		selecionaLabel("speeding");
	}

	public void clickNext() {
		clicarBotao("nextenterproductdata");
	}

}
