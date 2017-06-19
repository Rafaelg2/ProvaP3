package Observer;
import java.util.ArrayList;

public abstract class FootStar {
	private ArrayList<Publico> obs;

	public FootStar(){
		obs = new ArrayList<Publico>();
	}
	
	public void cadastrar(Publico p){
		obs.add(p);
	}
	
	public void sair(Publico p){
		obs.remove(p);
	}
	
	protected void notificar(){
		for(Publico p : obs){
			p.update(this);
		}
	}
	
	public abstract String getState();
	
	public abstract void setState(String x);
}

