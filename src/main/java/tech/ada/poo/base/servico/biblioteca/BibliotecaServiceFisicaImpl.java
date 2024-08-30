package tech.ada.poo.base.servico.biblioteca;

public class BibliotecaServiceFisicaImpl
    extends BibliotecaServiceImpl
        implements BibliotecaServiceFisica {

    public BibliotecaServiceFisicaImpl(BibliotecaRepositorio repositorio) {
        super.setRepositorio(repositorio);
    }

    @Override
    public void reservar() {
        System.out.println("reservar");
    }

    @Override
    public boolean consultar(String titulo) {
        return super.consultar(titulo);
    }

    @Override
    public void emprestar() {
        System.out.println("emprestar");
    }

    @Override
    public void devolver() {
        System.out.println("devolver");
    }

    @Override
    public void cadastrar(ItemCatalogo item) {
        super.repositorio.cadastrar(item);
        System.out.println( "item " + item +  " cadastrado!" );

        @Override
        public void emprestar() {
            // A lógica aqui depende de como você quer emprestar os itens
            // Vamos assumir que você quer emprestar pelo título

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o título do item a ser emprestado:");
            String titulo = scanner.nextLine();

            // Consulte o item pelo título
            boolean itemDisponivel = repositorio.consultar(titulo);

            if (itemDisponivel) {
                for (ItemCatalogo item : ((BibliotecaRepositorioListImpl) repositorio).getItens()) {
                    if (item.getTitulo().equals(titulo) && !item.isEmprestado()) {
                        item.setEmprestado(true);
                        System.out.println("Item emprestado com sucesso!");
                        return;
                    }
                }
                System.out.println("Item já está emprestado.");
            } else {
                System.out.println("Item não encontrado no catálogo.");
            }
        }
    }
    }

}
