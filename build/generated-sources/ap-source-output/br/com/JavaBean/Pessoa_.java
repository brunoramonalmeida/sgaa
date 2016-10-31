package br.com.JavaBean;

import br.com.JavaBean.Questao;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-24T12:08:23")
@StaticMetamodel(Pessoa.class)
public class Pessoa_ { 

    public static volatile SingularAttribute<Pessoa, String> areaConhecimento;
    public static volatile SingularAttribute<Pessoa, Integer> matricula;
    public static volatile ListAttribute<Pessoa, Questao> questoes;
    public static volatile SingularAttribute<Pessoa, String> nome;

}