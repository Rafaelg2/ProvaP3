
public class CalcStructure {

	public static void main(String[] args) {
		OperVisitor op = new SomaVisitor();
		NumeroElement s1 = new DoisArgs(6, 8);
		NumeroElement s2 = new TresArgs(4, 6, 2);
		s1.accept(op);
		s2.accept(op);
	}
}
