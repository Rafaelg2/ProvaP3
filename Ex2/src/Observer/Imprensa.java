package Observer;

public class Imprensa implements Publico{
	@Override
	public void update(FootStar f) {
		System.out.println("Notícia para a imprensa: ");
		System.out.println(f.getState());
		
	}
}