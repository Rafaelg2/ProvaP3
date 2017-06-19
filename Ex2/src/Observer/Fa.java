package Observer;
public class Fa implements Publico{
	@Override
	public void update(FootStar f) {
		System.out.println("Notícia para os fãs: ");
		System.out.println(f.getState());
	}
}	
