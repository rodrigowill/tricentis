package br.sp.rodrigo.pages;

import br.sp.rodrigo.core.BasePage;
import br.sp.rodrigo.core.DriverFactory;

public class HomePage extends BasePage{

	public void openSite() {
		DriverFactory.getDriver();
	}

}
