package br.com.JavaBean;

import br.com.JavaBean.Questao;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-02T22:44:09")
@StaticMetamodel(Disciplina.class)
public class Disciplina_ { 

    public static volatile SingularAttribute<Disciplina, Integer> codDisciplina;
    public static volatile SingularAttribute<Disciplina, Integer> periodo;
    public static volatile SingularAttribute<Disciplina, Integer> qntHora;
    public static volatile ListAttribute<Disciplina, Questao> questoes;
    public static volatile SingularAttribute<Disciplina, String> nome;

}