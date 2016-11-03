package br.com.JavaBean;

import br.com.JavaBean.Curso;
import br.com.JavaBean.Disciplina;
import br.com.JavaBean.Pessoa;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-02T22:44:09")
@StaticMetamodel(Questao.class)
public class Questao_ { 

    public static volatile SingularAttribute<Questao, String> assunto;
    public static volatile SingularAttribute<Questao, String> grauDificuldade;
    public static volatile SingularAttribute<Questao, Pessoa> pessoa;
    public static volatile SingularAttribute<Questao, Integer> resposta;
    public static volatile SingularAttribute<Questao, Curso> curso;
    public static volatile SingularAttribute<Questao, String> enunciado;
    public static volatile SingularAttribute<Questao, Disciplina> disciplina;
    public static volatile SingularAttribute<Questao, Integer> cod;

}