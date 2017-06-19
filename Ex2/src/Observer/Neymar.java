package Observer;
public class Neymar extends FootStar {
	private String n;

	@Override
	public String getState() {
		return n;
	}

	@Override
	public void setState(String x) {
		this.n = x;
		super.notificar();
	}

}
