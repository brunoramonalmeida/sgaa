package br.com.JavaBean;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Avaliacao")
public class Avaliacao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cod_avaliacao")
    private int codAvalicao;
    
    @Column(name="nome_avaliacao")
    private String nomeAvaliacao;
    
    private String descricao;
    private float valor;
    private float peso;
    
    @Column(name="data_geracao")
    @Temporal(TemporalType.DATE)
    private Date dataGeracao;
    
    @Column(name="data_aplicacao")
    @Temporal(TemporalType.DATE)
    private Date dataAplicacao;
    
    @ManyToMany(mappedBy = "avaliacao")
    private List<Questao> questao;

    public int getCodAvalicao() {
        return codAvalicao;
    }
 
   public void setCodAvalicao(int codAvalicao) {
        this.codAvalicao = codAvalicao;
    }

    public String getNomeAvaliacao() {
        return nomeAvaliacao;
    }

    public void setNomeAvaliacao(String nomeAvaliacao) {
        this.nomeAvaliacao = nomeAvaliacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Date getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(Date dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public Date getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(Date dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }
    
    
    
}
