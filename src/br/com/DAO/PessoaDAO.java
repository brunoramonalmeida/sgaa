package br.com.DAO;

import br.com.JDBC.ConnectionFactory;
import br.com.JavaBean.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;

public class PessoaDAO {
    
    //CREATE
    public Pessoa salvar(Pessoa pessoa){
        
        EntityManager em = new ConnectionFactory().getEM();
        
        try{
            em.getTransaction().begin();
            em.persist(pessoa);
            em.getTransaction().commit();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR DADOS DA PESSOA!\n]"
                    + "VERIFIQUE OS DADOS INFORMADOS.\n"+e, "ERRO AO SALVAR DADOS.", 1);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        
        return pessoa;
    }
    
    //READ
    public Pessoa consultarPorId(int matricula) {
        EntityManager em = new ConnectionFactory().getEM();
        Pessoa p = null;

        try {
            p = em.find(Pessoa.class, matricula);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERRO AO BUSCAR A PESSOA!\n"+e,
                    "ERRO NA BUSCA", 1);
            em.getTransaction().rollback();
        }finally {
            em.close();
        }

        return p;
    }
    
    public List<Pessoa> consultarTodos(){
        EntityManager em = new ConnectionFactory().getEM();
        List<Pessoa> pessoa = null;
        
        try{
            em.getTransaction().begin();
            Query q = em.createNamedQuery("Pessoa.consultarTD");
            pessoa = q.getResultList();
            em.getTransaction().commit();
        }catch(Exception e){
            System.out.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return pessoa;
    }
    
    //UPDATE
    public Pessoa atualizar(Pessoa pessoa){
        
        EntityManager em = new ConnectionFactory().getEM();
        
        try{
            em.getTransaction().begin();
            
            if(!em.contains(pessoa))
            {
                if(em.find(Pessoa.class, pessoa.getMatricula()) == null)
                {
                    throw new Exception("ERRO AO ATUALIZAR O LOCAL!\nREGISTRO JÁ EXCLUIDO");
                }
                
            }else{
                pessoa = em.merge(pessoa);
            }
            em.getTransaction().commit();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR A PESSOA!\n]"
                    + "REGISTRO JÁ EXCLUIDO.\n"+e, "ERRO AO SALVAR DADOS.", 1);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        
        return pessoa;
    }//Fim Update
    
    
    //DELETE
    public void remover(int matricula) {
        EntityManager em = new ConnectionFactory().getEM();

        Pessoa pessoa = em.find(Pessoa.class, matricula);
        try {
            em.getTransaction().begin();
            em.remove(pessoa);
            em.getTransaction().commit();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERRO AO REMOVER A PESSOA!\n"+e,
                           "ERRO AO SALVAR DADOS.", 1);
            em.getTransaction().rollback();
        }finally {
            em.close();
        }
    }//FIM DELETE
    
}
