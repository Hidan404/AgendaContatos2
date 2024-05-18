public class AppContatos {
    public static void main(String[] args) {
        AgendaDeContatos contatos = new AgendaDeContatos();

        contatos.adicionarCOntato("Ronald", 1);
        contatos.adicionarCOntato("Sabrina", 2);
        contatos.adicionarCOntato("Hidan", 3);

        System.out.println(contatos.pesquisarPorNome("Ronald"));
        contatos.exibirCOntatos();
        contatos.removerContato("Hidan");
        contatos.exibirCOntatos();
    }
}
