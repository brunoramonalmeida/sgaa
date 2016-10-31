package br.com.JavaBean;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Alternativa")
public class Alternativa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cod_alternativa")
    private int codAlternativa;
    
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    
    @ManyToMany(mappedBy = "alternativa")
    private List<Questao> questao;
    
    public int getCodAlternativa() {
        return codAlternativa;
    }

    public void setCodAlternativa(int codAlternativa) {
        this.codAlternativa = codAlternativa;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public List<Questao> getQuestao() {
        return questao;
    }

    public void setQuestao(List<Questao> questao) {
        this.questao = questao;
    }
    
    
    
}
