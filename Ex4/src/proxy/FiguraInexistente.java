package proxy;

public class FiguraInexistente implements Quadrilatero{
	@Override
	public void area() {
		System.out.println("N�o foi poss�vel calcular a �rea");		
	}

	@Override
	public void perimetro() {
		System.out.println("N�o foi poss�vel calcular o per�metro");
	}
}


