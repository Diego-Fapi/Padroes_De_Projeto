package factoryMethod;

public class FabricaFord implements FabricaDeCarro{

	@Override
	public Carro criarCarro() {
		// TODO Auto-generated method stub
		return new Fiesta();
	}

}
