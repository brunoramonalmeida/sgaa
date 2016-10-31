package br.com.JavaBean;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Pessoa")
@NamedQueries(
        @NamedQuery(name = "Pessoa.consultarTD",
                query = "SELECT p FROM Pessoa p")
)
public class Pessoa {

    @Id
    private int matricula;

    private String nome;
    @Column(name = "area_conhecimento")
    private String areaConhecimento;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pessoa")  
    @JoinColumn(name = "Pessoa_matricula")
    private List<Questao> questoes;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAreaConhecimento() {
        return areaConhecimento;
    }

    public void setAreaConhecimento(String areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
    }

    public List<Questao> getQuestoes() {
        return questoes;
    }

    public void setQuestoes(List<Questao> questoes) {
        this.questoes = questoes;
    }

}
