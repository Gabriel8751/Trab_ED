import java.util.ArrayList;

public class Node {
    private String nome;
    private int quantidade;
    private double valorUnitario;
    private ArrayList<Node> filhos = new ArrayList();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public ArrayList<Node> getFilhos() {
        return filhos;
    }
}
