package tech.ada.poo.base.servico.biblioteca;

public abstract class ItemCatalogo {

    private String titulo;

    @Override
    public String toString() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && !(obj instanceof ItemCatalogo)) return false;
        ItemCatalogo item = (ItemCatalogo) obj;

        if ( this.titulo.equals(item.getTitulo()) ) // refatorar para ignore case
            return true;

        return false;
    }
}
public abstract class ItemCatalogo {
    private String titulo;
    private boolean isEmprestado;

    public ItemCatalogo(String titulo) {
        this.titulo = titulo;
        this.isEmprestado = false; // Inicialmente, o item está disponível
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isEmprestado() {
        return isEmprestado;
    }

    public void setEmprestado(boolean emprestado) {
        isEmprestado = emprestado;
    }
}
