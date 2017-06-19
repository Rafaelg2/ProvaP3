
public class DoisArgs implements NumeroElement {
	private int n1, n2;

	public DoisArgs(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public void accept(OperVisitor op) {
		op.somar(this);
	}

	public int getN1() {
		return n1;
	}

	public int getN2() {
		return n2;
	}
}
