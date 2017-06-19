package proxy;

public class Quadrado implements Quadrilatero{
int l1, r;
	
	Quadrado(int l1) {
		this.l1 = l1;
	}

	@Override
	public void area() {
		r = l1 * 2;
		System.out.println("Área do quadrado: " + r);
	}

	@Override
	public void perimetro() {
		r = l1 * 4;
		System.out.println("Perímetro do quadrado: " + r);
	}
	

}
