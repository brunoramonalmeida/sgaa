package br.com.DAO;

import br.com.JDBC.ConnectionFactory;
import br.com.JavaBean.Curso;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;

public class CursoDAO {
    
    //CREATE
    public Curso salvar(Curso curso){
        
        EntityManager em = new ConnectionFactory().getEM();
        
        try{
            em.getTransaction().begin();
            em.persist(curso);
            em.getTransaction().commit();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR DADOS DO CURSO!\n]"
                    + "VERIFIQUE OS DADOS INFORMADOS.\n"+e, "ERRO AO SALVAR DADOS.", 1);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        
        return curso;
    }
    
    //READ
    public Curso consultarPorId(int cod) {
        EntityManager em = new ConnectionFactory().getEM();
        Curso c = null;

        try {
            c = em.find(Curso.class, cod);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERRO AO BUSCAR CURSO!\n"+e,
                    "ERRO AO BUSCAR DADOS.", 1);
            em.getTransaction().rollback();
        }finally {
            em.close();
        }

        return c;
    }
    
    //UPDATE
    public Curso atualizar(Curso curso){
        
        EntityManager em = new ConnectionFactory().getEM();
        
        try{
            em.getTransaction().begin();
            
            if(!em.contains(curso))
            {
                if(em.find(Curso.class, curso.getCodCurso()) == null)
                {
                    throw new Exception("ERRO AO ATUALIZAR CURSO!\nREGISTRO JÁ EXCLUIDO");
                }
                
            }else{
                curso = em.merge(curso);
            }
            em.getTransaction().commit();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR O CURSO!\n"
                    + "REGISTRO JÁ EXCLUIDO.\n"+e, "ERRO AO SALVAR DADOS.", 1);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        
        return curso;
    }//Fim Update
    
    
    //DELETE
    public void remover(int cod) {
        EntityManager em = new ConnectionFactory().getEM();

        Curso curso = em.find(Curso.class, cod);
        try {
            em.getTransaction().begin();
            em.remove(curso);
            em.getTransaction().commit();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERRO AO REMOVER O CURSO!\n"+e,
                           "REMOÇÃO DE DADOS.", 1);
            em.getTransaction().rollback();
        }finally {
            em.close();
        }
    }//FIM DELETE
    
    public List<Curso> consultarTodos(){
        EntityManager em = new ConnectionFactory().getEM();
        List<Curso> listaCursos = null;
        
        try{
            em.getTransaction().begin();
            Query q = em.createQuery("from Curso u");
            listaCursos = q.getResultList();
            em.getTransaction().commit();
        }catch(Exception e){
            System.out.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return listaCursos;
    }
    
}
