package Ex3;

public class Ex3 {
	
	private String sobreNome;
	private String nome;
	private double salarioHora;
	private int anosNaEmpresa; 
	
	public Ex3(String sobreN, String nome, double salarioHora, int anos) {
		this.sobreNome = sobreN;
		this.nome = nome;
		this.salarioHora = salarioHora;
		this.anosNaEmpresa = anos;
		
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}

	public int getAnosNaEmpresa() {
		return anosNaEmpresa;
	}

	public void setAnosNaEmpresa(int anosNaEmpresa) {
		this.anosNaEmpresa = anosNaEmpresa;
	}
	
	
	
}
