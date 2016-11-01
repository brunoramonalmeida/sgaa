
package br.com.DAO;

import br.com.JDBC.ConnectionFactory;
import br.com.JavaBean.Disciplina;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

public class DisciplinaDAO {
    
    public Disciplina salvar(Disciplina disciplina){
        EntityManager em = new ConnectionFactory().getEM();
        
        try{
            em.getTransaction().begin();
            em.persist(disciplina);
            em.getTransaction().commit();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR DADOS DA DISCIPLINA!\n]"
                    + "VERIFIQUE OS DADOS INFORMADOS.\n"+e, "ERRO AO SALVAR DADOS.", 1);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        
        return disciplina;
    }
    
    public Disciplina consultaPorId(int cod){
        
        EntityManager em = new ConnectionFactory().getEM();
        Disciplina d = null;
        try{
            em.getTransaction().begin();
            d = em.find(Disciplina.class, cod);
            em.getTransaction().commit();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERRO AO BUSCAR DADOS DA DISCIPLINA!\n]"
                    + "VERIFIQUE OS DADOS INFORMADOS.\n"+e, "ERRO AO BUSCAR DADOS.", 1);
            em.getTransaction().rollback();
        }
        
        return d;
    }
    
}
