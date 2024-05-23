package list.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvite {
    private Set<Convite> convidadoSet;

    public ConjuntoConvite() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo){
        convidadoSet.add(new Convite(nome, codigo));
    }

    public void removerConvidado(int codigo){
        Convite convidadoParaRemover = null;
        for (Convite c : convidadoSet){
            if (c.getCodigoConvite() == codigo){
                convidadoParaRemover = c;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public void mostrarConvidados(){
        System.out.println(convidadoSet);
    }
    public int numeroDeConvidados(){
        return convidadoSet.size();
    }

    public static void main(String[] args) {
        ConjuntoConvite cC = new ConjuntoConvite();

        cC.adicionarConvidado("Ana", 152);
        cC.adicionarConvidado("Guilherme", 152);
        cC.adicionarConvidado("Joana", 153);
        cC.adicionarConvidado("Bruno", 154);

        cC.removerConvidado(152);

        cC.mostrarConvidados();
    }
}
