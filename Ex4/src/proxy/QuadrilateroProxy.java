package proxy;

public class QuadrilateroProxy implements Quadrilatero {
private Quadrilatero quad;
	
	public QuadrilateroProxy(int l1, int l2) {
		if (l1 == 0 || l2 == 0){
			quad = new FiguraInexistente();
		} else{
			if (l1 == l2){
				quad = new Quadrado(l1);
			} else{
				quad = new Retangulo(l1, l2);
			}
		}
	}

	@Override
	public void area() {
		quad.area();		
	}

	@Override
	public void perimetro() {
		quad.perimetro();
	}


}
