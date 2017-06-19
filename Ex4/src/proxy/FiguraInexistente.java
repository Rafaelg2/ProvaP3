package proxy;

public class FiguraInexistente implements Quadrilatero{
	@Override
	public void area() {
		System.out.println("Não foi possível calcular a área");		
	}

	@Override
	public void perimetro() {
		System.out.println("Não foi possível calcular o perímetro");
	}
}


