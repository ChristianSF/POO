package Trabalho;

import java.util.ArrayList;

public class Motorista {
    private String nome;
    private String sobrenome;
    private String CPF;
    private String ddn;
    private String turno;
    private int num_celular;
    
    public Motorista(String nome_teste, String sobrenome, String CPF, String ddn, String turno, int num_celular){
        setNome(nome_teste);
        setSobrenome(sobrenome);
        setCPF(CPF);
        setDdn(ddn);
        setTurno(turno);
        setNum_celular(num_celular);
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getDdn() {
        return ddn;
    }

    public void setDdn(String ddn) {
        this.ddn = ddn;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getNum_celular() {
        return num_celular;
    }

    public void setNum_celular(int num_celular) {
        this.num_celular = num_celular;
    }
    
}
