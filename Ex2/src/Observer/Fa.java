package Observer;
public class Fa implements Publico{
	@Override
	public void update(FootStar f) {
		System.out.println("Not�cia para os f�s: ");
		System.out.println(f.getState());
	}
}	
