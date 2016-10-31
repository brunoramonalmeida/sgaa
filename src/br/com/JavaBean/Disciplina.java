package br.com.JavaBean;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Disciplina")
public class Disciplina {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codDisciplina;
    private String nome;
    private int periodo;
    private int qntHora;
    
    @OneToMany(mappedBy = "disciplina") 
    @JoinColumn(name="Disciplina_codDisciplina")      
    private List<Questao> questoes;

    public int getCodDiscipina() {
        return codDisciplina;
    }

    public void setCodDiscipina(int codDiscipina) {
        this.codDisciplina = codDiscipina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getQntHora() {
        return qntHora;
    }

    public void setQntHora(int qntHora) {
        this.qntHora = qntHora;
    }

    public List<Questao> getQuestoes() {
        return questoes;
    }

    public void setQuestoes(List<Questao> questoes) {
        this.questoes = questoes;
    }
    
}
