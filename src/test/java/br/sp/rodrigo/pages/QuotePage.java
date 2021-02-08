package br.sp.rodrigo.pages;

import br.sp.rodrigo.core.BasePage;

public class QuotePage extends BasePage {

	public void enterEmail(String email) {
		escrever("email", email);	
	}

	public void enterUsername(String username) {
		escrever("username", username);	
	}

	public void enterPassword(String password) {
		escrever("password", password);	
	}

	public void enterConfirmePassword(String confimrPassword) {
		escrever("confirmpassword", confimrPassword);	
	}
	
	public void clikcEnviar() {
		aguardar(5000);
		clicarBotao("sendemail");
	}

	public String verificarMensagem() {
		aguardar(6000);
		return obtermensagemPorXpath();
	}

	public void clickConfirmar() {
		clicarBotao("confirm");
		
	}

}
