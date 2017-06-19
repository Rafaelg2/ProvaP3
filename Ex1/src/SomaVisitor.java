public class SomaVisitor implements OperVisitor {
	int n1, n2, r;
	
	@Override
	public void somar(DoisArgs n) {
		n1 = n.getN1();
		n2 = n.getN2();
		r = n1 + n2;
		System.out.println("Resultado da soma de 2 argumentos: " + r);
	}

	@Override
	public void somar(TresArgs n) {
		int n3;
		n1 = n.getN1();
		n2 = n.getN2();
		n3 = n.getN3();
		r = n1 + n2 + n3;
		System.out.println("Resultado da soma de 3 argumentos: " + r);
	}
}
