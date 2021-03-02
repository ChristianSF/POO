package Interface;

public class Sequencia implements CharSequence {

    private String sequencia = "Christian";
    private char letra;
    
    @Override
    public char charAt(int index) {
        this.letra = sequencia.charAt(index);
        return this.letra;
    }

    @Override
    public int Tamanho() {
        return sequencia.length();
    }

    @Override
    public String subSequencia(int start, int end) {
        return (String) sequencia.subSequence(start, end);
    }
  
    @Override
    public String toString() {
        return sequencia.toString();
    }
    
    @Override
    public String getSequencia() {
        return sequencia;
    }
    
    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
}
