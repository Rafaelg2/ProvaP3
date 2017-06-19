package Teste;

import proxy.QuadrilateroProxy;

public class Teste {
	public static void main(String[] args) {
		QuadrilateroProxy x = new QuadrilateroProxy(5,5);
		x.area();
		x.perimetro();
	}
}
