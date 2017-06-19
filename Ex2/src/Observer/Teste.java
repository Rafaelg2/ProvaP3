package Observer;

public class Teste {

	public static void main(String[] args) {
		Neymar a1 = new Neymar();
		Cristiano a2 = new Cristiano();
		
		Fa f = new Fa();
		Imprensa i = new Imprensa();
		a1.cadastrar(f);
		a2.cadastrar(f);
		a2.cadastrar(i);
		
		a1.setState("Neymar quebra a perna e fica de fora das finais");
		a2.setState("Cristiano Ronaldo faz golaço");
	}
}
