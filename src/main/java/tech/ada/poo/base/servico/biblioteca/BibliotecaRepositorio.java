package tech.ada.poo.base.servico.biblioteca;

public interface BibliotecaRepositorio {

    void cadastrar(ItemCatalogo item);

    boolean consultar(String titulo);
}
