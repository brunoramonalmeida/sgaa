package br.com.JavaBean;

import br.com.JavaBean.Questao;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-02T22:44:09")
@StaticMetamodel(Avaliacao.class)
public class Avaliacao_ { 

    public static volatile SingularAttribute<Avaliacao, String> nomeAvaliacao;
    public static volatile SingularAttribute<Avaliacao, Float> peso;
    public static volatile SingularAttribute<Avaliacao, Float> valor;
    public static volatile SingularAttribute<Avaliacao, Date> dataAplicacao;
    public static volatile SingularAttribute<Avaliacao, Integer> codAvalicao;
    public static volatile ListAttribute<Avaliacao, Questao> questao;
    public static volatile SingularAttribute<Avaliacao, String> descricao;
    public static volatile SingularAttribute<Avaliacao, Date> dataGeracao;

}