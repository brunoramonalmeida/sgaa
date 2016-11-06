
package br.com.Tests;

import br.com.DAO.QuestaoDAO;
import br.com.JavaBean.Questao;
import java.util.List;

public class TesteQuestao {
    public static void main(String []Args){
        QuestaoDAO dao = new QuestaoDAO();
        List<Questao> questoes = dao.consultarTodos();
        
        for(int i = 0; i < questoes.size(); i++){
            System.out.println(questoes.get(i).toString());
        }
        
    }
}
