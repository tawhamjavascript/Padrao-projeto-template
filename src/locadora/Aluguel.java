package locadora;

public class Aluguel {
	   private Alugavel dvd;
	   private int diasAlugado;
	 
	   public Aluguel(DVD dvd, int diasAlugado) {
	      this.dvd = dvd;
	      this.diasAlugado = diasAlugado;
	   }
	 
	   public Alugavel getDVD() {
	      return dvd;
	   }
	 
	   public int getDiasAlugado() {
	      return diasAlugado;
	   }

	public double valorDeUmAluguel() {
		   return dvd.valorDeUmAluguel(diasAlugado);

	}

	public int calcularPontosDeAlugadorFrequente() {
		return dvd.calcularPontosDeAlugadorFrequente(diasAlugado);
	}
}
