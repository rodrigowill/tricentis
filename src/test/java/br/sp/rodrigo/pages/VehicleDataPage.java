package br.sp.rodrigo.pages;

import br.sp.rodrigo.core.BasePage;

public class VehicleDataPage extends BasePage {

	public void selectMake(String make) {
		selecionaComboPorId("make", make);
	}

	public void selectModel(String model) {
		selecionaComboPorId("model", model);
	}

	public void enterCylinderCapacity(String cylinder) {
		escrever("cylindercapacity", cylinder);
	}

	public void enterEnginePerformance(String engine) {
		escrever("engineperformance", engine);
	}

	public void selectDateManufacture(String date) {
		escrever("dateofmanufacture", date);
	}

	public void selectNumberSeats(String seats) {
		selecionaComboPorId("numberofseats", seats);
	}

	public void selectNumberSeatsTwo(String seats) {
		selecionaComboPorId("numberofseatsmotorcycle", seats);
	}

	public void selectFuelType(String fuel) {
		selecionaComboPorId("fuel", fuel);
	}

	public void enterPayload(String payload) {
		escrever("payload", payload);
	}

	public void enterTotalWeight(String totalWeight) {
		escrever("totalweight", totalWeight);
	}

	public void enterListPrice(String price) {
		escrever("listprice", price);
	}

	public void enterLicensePlateNumber(String license) {
		escrever("licenseplatenumber", license);		
	}

	public void enterAnnualMileage(String mileage) {
		escrever("annualmileage", mileage);		
	}
	
	public void clickNext() {
		clicarBotao("nextenterinsurantdata");		
	}

}
