package br.com.JavaBean;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Questoes")
@NamedQueries(
        @NamedQuery(name = "Questao.consultarTD",
                query = "SELECT q FROM Questao q")
)
public class Questao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cod_questao;

    private String assunto;
    private String enunciado;
    private int resposta;

    @Column(name = "grau_dificul")
    private String grauDificuldade;

    @ManyToOne
    private Pessoa pessoa;
    
    @ManyToOne
    private Curso curso;
    
    @ManyToOne
    private Disciplina disciplina;
    
//    @ManyToMany
//    @JoinTable(name="Questoes_has_Alternativa",
//            joinColumns = @JoinColumn(name="Questoes_cod_questao"),
//            inverseJoinColumns = @JoinColumn(name="Alternativa_cod_alternativa"))
//    private List<Alternativa> alternativa;
//    
//    @ManyToMany
//    @JoinTable(name="Avaliacao_questoes",
//            joinColumns = @JoinColumn(name="Questoes_cod_questao"),
//            inverseJoinColumns = @JoinColumn(name="Avaliacao_cod_avalicao"))
//    private List<Avaliacao> avaliacao;

    public int getCod() {
        return cod_questao;
    }

    public void setCod(int cod) {
        this.cod_questao = cod;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public int getResposta() {
        return resposta;
    }

    public void setResposta(int resposta) {
        this.resposta = resposta;
    }

    public String getGrauDificuldade() {
        return grauDificuldade;
    }

    public void setGrauDificuldade(String grauDificuldade) {
        this.grauDificuldade = grauDificuldade;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
    public String verResposta(int resposta){
        String respostaConvertida = "";
        
        if(resposta == 0){
            respostaConvertida = "A";
        } else if (resposta == 1){
            respostaConvertida = "B";
        } else if (resposta == 2){
            respostaConvertida = "C";
        } else if (resposta == 3){
            respostaConvertida = "D";
        } else if (resposta == 4){
            respostaConvertida = "E";
        }
        
        return respostaConvertida;
    }
//
//    public List<Alternativa> getAlternativa() {
//        return alternativa;
//    }
//
//    public void setAlternativa(List<Alternativa> alternativa) {
//        this.alternativa = alternativa;
//    }
//
//    public List<Avaliacao> getAvaliacao() {
//        return avaliacao;
//    }
//
//    public void setAvaliacao(List<Avaliacao> avaliacao) {
//        this.avaliacao = avaliacao;
//    }

    @Override
    public String toString() {
        return "Questao:\n" + "Código: " + cod_questao + "\nAssunto: " + assunto + "\nEnunciado: " + enunciado + "\nResposta: " + resposta + "\nGrau de Dificuldade: " + grauDificuldade + "\nPessoa: " + pessoa.getNome().toString() + "\nCurso: " + curso.getNome().toString() + "\nDisciplina: " + disciplina.getNome().toString();
    }
    
      
    
}
