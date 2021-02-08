package br.sp.rodrigo.core;

import static br.sp.rodrigo.core.DriverFactory.getDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	

	public static void selecionaComboPorId(String id, String texto) {
		WebElement elemento = getDriver().findElement(By.id(id));
		Select combo = new Select(elemento);
		combo.selectByVisibleText(texto);
	}
	
	public void selecionaLabel(String texto) {
		getDriver().findElement(By.xpath("//*[@id='" + texto + "']/..")).click();
	}
	
	public void escrever(By by, String texto) {
		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(texto);
	}
	
	public void escrever(String id_campo, String texto) {
		escrever(By.id(id_campo), texto);
	}
	
	public void clicarElementoPaiPorXpath (String xpath) {
		getDriver().findElement(By.xpath(xpath)).click();
	}
	
	public void clicarRadio (By by) {
		getDriver().findElement(by).click();
	}
	
	public void clicarRadio (String id) {
		clicarRadio(By.id(id));
	}	
	
	public void clicarBotao(String id) {
		getDriver().findElement(By.id(id)).click();
	}
	
	public void aguardar (long tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String obtermensagemPorXpath() {
		return "oi";
		//return getDriver().findElement(By.xpath("//div[@class=\"sweet-alert showSweetAlert visible\"]/h2")).getText();
	//	getDriver().getWindowHandle().
	}
	

}
