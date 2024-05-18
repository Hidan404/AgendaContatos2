import java.util.HashMap;
import java.util.Map;

public class AgendaDeContatos {
   
    private Map<String,Integer>  contatos;

    public AgendaDeContatos() {
        this.contatos = new HashMap<>();
    }

    public void adicionarCOntato(String nome, Integer numero){
        contatos.put(nome, numero);
    }

    public void removerContato(String nome){
        if(!contatos.isEmpty()){
            contatos.remove(nome);
        }
    }

    public void exibirCOntatos(){
        System.out.println(contatos);
    }

    public Integer pesquisarPorNome(String nome){
        int contatosResultado = 0;

        if(!contatos.isEmpty()){
            contatosResultado = contatos.get(nome);
        }
        return contatosResultado;
        
        
    }
}
