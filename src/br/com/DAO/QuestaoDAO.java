package br.com.DAO;

import br.com.JDBC.ConnectionFactory;
import br.com.JavaBean.Questao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;

public class QuestaoDAO {
    
    //CREATE
    public Questao salvar(Questao questao){
        
        EntityManager em = new ConnectionFactory().getEM();
        
        try{
            em.getTransaction().begin();
            em.persist(questao);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Questão Cadastrada com Sucesso!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR DADOS DA QUESTÃO!\n]"
                    + "VERIFIQUE OS DADOS INFORMADOS.\n"+e, "ERRO AO SALVAR DADOS.", 1);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        
        return questao;
    }
    
    public List<Questao> consultarTodos(){
        EntityManager em = new ConnectionFactory().getEM();
        List<Questao> questoes = null;
        
        try{
            em.getTransaction().begin();
            Query q = em.createNamedQuery("Questao.consultarTD");
            questoes = q.getResultList();
            em.getTransaction().commit();
        }catch(Exception e){
            System.out.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return questoes;
    }
}
