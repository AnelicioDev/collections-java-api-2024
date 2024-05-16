package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenaPorIdade(){
        List<Pessoa> listPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(listPorIdade);
        return listPorIdade;
    }

    public List<Pessoa> comparaPorAltura(){
        List<Pessoa> listPorAltuta = new ArrayList<>(pessoaList);
        Collections.sort(listPorAltuta, new ComparaPorAltura());
        return listPorAltuta;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa op = new OrdenacaoPessoa();
        op.adicionarPessoa("Ana", 25, 1.56);
        op.adicionarPessoa("Carlos", 34, 1.78);
        op.adicionarPessoa("Maria", 29, 1.60);
        op.adicionarPessoa("Paulo", 18, 1.82);

        System.out.println(op.pessoaList);

        //System.out.println(op.ordenaPorIdade());
        //System.out.println(op.comparaPorAltura());
    }
}
