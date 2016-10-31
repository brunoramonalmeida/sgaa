
package br.com.JavaBean;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Curso")
public class Curso {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codCurso;
    private String nome;
    private int quantPeriodo;
    
    @OneToMany(mappedBy = "curso") 
    @JoinColumn(name = "Curso_codCurso")
    private List<Questao> questoes;

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantPeriodo() {
        return quantPeriodo;
    }

    public void setQuantPeriodo(int quantPeriodo) {
        this.quantPeriodo = quantPeriodo;
    }
    
    
    
}
