package iphone;

public class iPhone implements IReprodutorMusical, IAparelhoTelefonico, INavegadorNaInternet {

	@Override
	public void tocar() {
		System.out.println("Reproduzindo música...");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando música...");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando a música: " + musica);
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para: " + numero);
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada...");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz...");
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página: " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba...");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página...");
	}

	public static void main(String[] args) {
		iPhone meuIPhone = new iPhone();

		meuIPhone.tocar();
		meuIPhone.pausar();
		meuIPhone.selecionarMusica("Restitui - Trazendo a arca");

		meuIPhone.ligar("123456789");
		meuIPhone.atender();
		meuIPhone.iniciarCorreioVoz();

		meuIPhone.exibirPagina("www.iPhone.com");
		meuIPhone.adicionarNovaAba();
		meuIPhone.atualizarPagina();
	}
}
