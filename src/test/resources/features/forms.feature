#language: pt

Funcionalidade: Realizar preenchimento de formulários
	Como um usuário
	Eu quero acessar o site "http://sampleapp.tricentis.com/101/app.php"
	Para que eu possa preencher os formulários com sucesso

Cenário: Realizar o preenchimento dos formulários com sucesso
	Dado que acesso o site "http://sampleapp.tricentis.com/101/app.php"
	Quando preencho o formulário Vehicle Data
	E o formulário Insurant Data
	E o formulário Product Data
	E o formulário Price Option
	E o formulário Quote 
	Então verifico a mensagem "Sending e-mail success!" na tela