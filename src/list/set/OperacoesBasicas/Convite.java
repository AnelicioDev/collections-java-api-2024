package list.set.OperacoesBasicas;

public class Convite {
    private String nome;
    private int codigoConvite;

    public Convite(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {return nome;}

    public int getCodigoConvite() {return codigoConvite;}

    @Override
    public String toString() {
        return "Convite{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}
