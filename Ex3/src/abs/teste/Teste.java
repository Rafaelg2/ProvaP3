package abs.teste;

import abs.produto.Bola;
import abs.produto.Fabricante;

public class Teste {

	public static void main(String[] args) {
			Bola b = Fabricante.ADIDAS.criar();
			System.out.println(b.getNome());
			System.out.println(b.getCor());
			System.out.println(b.getMaterial());
		}


	}
