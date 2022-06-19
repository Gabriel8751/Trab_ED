import java.util.ArrayList;
import java.util.Scanner;

public class Tree {
    private Node raiz;

    public Node criarNo(String nome, int quantidade, double preco){
        Node node = new Node();

        node.setNome(nome);
        node.setQuantidade(quantidade);
        node.setValorUnitario(preco);

        return node;
    }

    public Node criarRaiz(String nome, double preco){

        int quantidade = 1;
        raiz = criarNo(nome, quantidade, preco);

        return raiz;
    }

    public Node subArvore(String nome, int quantidade, double preco){

        Node subArvore = new Node();
        subArvore = criarNo(nome, quantidade, preco);

        return  subArvore;
    }

    public void adicionarSubArvores(Node raiz, Node subArvore){
        raiz.getFilhos().add(subArvore);
    }

}

