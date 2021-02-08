package br.sp.rodrigo.pages;

import br.sp.rodrigo.core.BasePage;

public class PriceOptionPage extends BasePage {

	public void selectPriceOption(String string) {
		if (string.equals("Silver")) {
			selecionaLabel("selectsilver");
		} else if (string.equals("Gold")) {
			selecionaLabel("selectgold");
		} else if (string.equals("Platinum")) {
			selecionaLabel("selectplatinum");
		} else {
			selecionaLabel("selectultimate");
		}
	}

	public void clickNext() throws InterruptedException {
		aguardar(5000);
		clicarBotao("nextsendquote");
	}

}
