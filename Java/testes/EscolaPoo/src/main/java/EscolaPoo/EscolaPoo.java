package EscolaPoo;

import escola.Disciplina;

public class EscolaPoo {

    public static void main(String args[]) {
        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNome("Matemática");
        disciplina1.setCargaHoraria(-10);
        
        System.out.println(disciplina1.getNome());
    }
}
