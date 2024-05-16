package list.Pesquisar;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {this.livroList = new ArrayList<>();}

    public void adicionaLivro(String titulo, String autor, int ano){
        livroList.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> pesquisaPorUtor(String autor){
        List<Livro> livroPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livroPorAutor.add(l);
                }
            }
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisarPorIntevaloDeAno(int anoInicial, int anoFinal){
        List<Livro> listaPorAno = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    listaPorAno.add(l);
                }
            }
        }
        return listaPorAno;
    }

    public Livro pequisarLivtoPorTitulo(String titulo){
        Livro tituloLivro = null;
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    tituloLivro = l;
                    break;
                }
            }
        }
        return tituloLivro;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionaLivro("Titulo 1", "Autor 1", 2021);
        catalogoLivros.adicionaLivro("Titulo 1", "Autor 2", 2022);
        catalogoLivros.adicionaLivro("Titulo 2", "Autor 3", 1994);
        catalogoLivros.adicionaLivro("Titulo 3", "Autor 1", 2008);

        System.out.println(catalogoLivros.pesquisaPorUtor("Autor 1"));
        System.out.println(catalogoLivros.pequisarLivtoPorTitulo("Titulo 1"));
        System.out.println(catalogoLivros.pesquisarPorIntevaloDeAno(1994, 2008));
    }
}
