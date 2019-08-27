
public class Main {
	public static void main(String[] args) {
		ContaBanco contamauricio = new ContaBanco();
		contamauricio.setNome("Mauricio K.");
		contamauricio.Transfere(200, contamauricio);
		System.out.println(contamauricio);

		ContaBanco outraconta = new ContaBanco();
		outraconta.setNome("Nome Titular");
		outraconta.saca(20);
		

	}
}