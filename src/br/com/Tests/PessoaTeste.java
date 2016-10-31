package br.com.Tests;

import br.com.DAO.CursoDAO;
import br.com.DAO.DisciplinaDAO;
import br.com.DAO.PessoaDAO;
import br.com.JavaBean.Alternativa;
import br.com.JavaBean.Curso;
import br.com.JavaBean.Disciplina;
import br.com.JavaBean.Pessoa;
import br.com.JavaBean.Questao;
import br.com.TelasPrincipais.TPrincipal;
import java.util.ArrayList;
import java.util.List;

public class PessoaTeste {
    
    public static void main(String[] args) {
        
        CursoDAO cdao = new CursoDAO();
        Curso cs = cdao.consultarPorId(1);
        
        DisciplinaDAO ddao = new DisciplinaDAO();
        Disciplina ds = ddao.consultaPorId(1);
        
        Questao qts = new Questao();
        qts.setAssunto("Usando JFrame");
        qts.setEnunciado("Quais os tipos de Layouts existentes?");
        qts.setResposta(3);
        qts.setGrauDificuldade("Baixo");
        qts.setCurso(cs);
        qts.setDisciplina(ds);
        
        List<Questao> questoes = new ArrayList();
        questoes.add(qts);
        
        Pessoa pe = new Pessoa();
        pe.setMatricula(14127292);
        pe.setNome("Manoel Matias");
        pe.setAreaConhecimento("Java SE - Programação para Desktop");
        
        pe.setQuestoes(questoes);
        
        qts.setPessoa(pe);
//        
        PessoaDAO dao = new PessoaDAO();
        //System.out.println(dao.consultarPorId(14127294));
        List<Pessoa> pessoa = dao.consultarTodos();
        for(Pessoa p : pessoa){
            System.out.println("Nome da Pessoa: "+p.getNome()+
                               "\nMatrícula: "+p.getMatricula());
        }
        
        pe = dao.salvar(pe);
        
        System.out.println("Pessoa: "+pe.getNome()+" matricula: "+pe.getMatricula()+" salva.\n"/*+
                           "Questão: "+qts.getCod()+" assunto: "+qts.getAssunto()+" salva."*/);
        
         
//        Curso cs = new Curso();
//        cs.setNome("Administração");
//        cs.setQuantPeriodo(8);
//        
//        CursoDAO dao = new CursoDAO();
//        dao.salvar(cs);
        
        System.out.println("Curso: "+cs.getNome()+" salvo.");

        
    }
}
