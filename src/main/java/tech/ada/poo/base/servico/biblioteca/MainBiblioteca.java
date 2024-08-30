package tech.ada.poo.base.servico.biblioteca;

public class MainBiblioteca {

    public static void main(String[] args) {

        ItemCatalogo livroabc = new Livro("livro abc");

        BibliotecaRepositorio repositorio = new BibliotecaRepositorioListImpl();

        BibliotecaServiceFisica bibServiceFisica = new BibliotecaServiceFisicaImpl(repositorio);
        bibServiceFisica.cadastrar( livroabc );

        boolean r1 = bibServiceFisica.consultar( "livro abs" );
        boolean r2 = bibServiceFisica.consultar( "livro abc" );
        System.out.println(r1 + " "+ r2);

        BibliotecaServiceVirtual bibServiceVirtual = new BibliotecaServiceVirtualImpl();
        bibServiceVirtual.reservar();

        ItemCatalogo livroabc = new Livro("livro abc");
        BibliotecaRepositorio repositorio = new BibliotecaRepositorioListImpl();
        BibliotecaServiceFisica bibServiceFisica = new BibliotecaServiceFisicaImpl(repositorio);

        bibServiceFisica.cadastrar(livroabc);
        bibServiceFisica.emprestar(); // Tenta emprestar o item
        boolean r1 = bibServiceFisica.consultar("livro abc"); // Deve retornar true mesmo após emprestar
        System.out.println("Disponível: " + r1);

    }

}
