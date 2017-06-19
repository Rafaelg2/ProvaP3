package abs.produto;

public enum Fabricante {
	ADIDAS {
		@Override
		public Bola criar() {
			return new BolaAdidas("Bola da adidas", "vermelha", "couro");
		}
	}, NIKE {
		@Override
		public Bola criar() {
			return new BolaNike("Bola da nike", "branca", "plástico");
		}
	}, PUMA {
		@Override
		public Bola criar() {
			return new BolaPuma("Bola da puma", "amarela", "pano");
		}
	};
	
	public abstract Bola criar();
}

