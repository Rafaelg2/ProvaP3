package proxy;

public class Retangulo implements Quadrilatero{
int l1, l2, r;
	
	Retangulo(int l1, int l2) {
		this.l1 = l1;
		this.l2 = l2;
	}

	@Override
	public void area() {
		r = l1 * l2;
		System.out.println("Área do retângulo: " + r);
	}

	@Override
	public void perimetro() {
		r = (l1 * 2) + (l2 * 2);
		System.out.println("Perímetro do retângulo: " + r);
	}
}

