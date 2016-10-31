package br.com.JavaBean;

import br.com.JavaBean.Questao;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-24T12:08:23")
@StaticMetamodel(Curso.class)
public class Curso_ { 

    public static volatile SingularAttribute<Curso, Integer> codCurso;
    public static volatile ListAttribute<Curso, Questao> questoes;
    public static volatile SingularAttribute<Curso, String> nome;
    public static volatile SingularAttribute<Curso, Integer> quantPeriodo;

}