package abstractFactory;

public class FabricaFiat implements FabricaDeCarro{

	@Override
	public CarroSedan criarCarroSedan() {
		// TODO Auto-generated method stub
		return new Siena();
	}

	@Override
	public CarroPopular criarCarroPopular() {
		// TODO Auto-generated method stub
		return new Palio();
	}
	
}
