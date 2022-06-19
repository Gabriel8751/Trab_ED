import java.util.ArrayList;
import java.util.Scanner;

public class StartApp {
    static ArrayList<Node> nos = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        Node no = new Node();
        Tree tree = new Tree();
        int count = 0;
        Node Carro = tree.criarRaiz("Carro", 0.0);
        criarNoPrimario(tree, Carro);
        do {
            criasSubNos(tree, 1);
            count++;
        }while(count != 10);

        System.out.println(imprimirArvore());
        System.out.println("Para se criar esse Carro é gasto: " + valueFinal());

    }

    public static void criarNoPrimario(Tree tree, Node carro) {
            Node node = tree.subArvore(scanner.nextLine(), scanner.nextInt(), lerDouble());
            tree.adicionarSubArvores(carro, node);
            nos.add(node);
    }

    public static Node criasSubNos(Tree tree, int index) {
        for(int i = 0; i < index; i++) {
            Node node = tree.subArvore(scanner.nextLine(), scanner.nextInt(), lerDouble());
            tree.adicionarSubArvores(nos.get(i), node);
            nos.add(node);
            return node;
        }
        return null;
    }

    public static double lerDouble(){
        double leitura = scanner.nextDouble();
        scanner.nextLine();
        return leitura;
    }

    public static double valueFinal(){
        double valorFinal = 0;
        for(Node node: nos){
            valorFinal += node.getQuantidade() * node.getValorUnitario();
        }
        return valorFinal;
    }

    public static String imprimirArvore(){
        String arvore = "";
        for(Node node: nos){
            arvore += node.getNome() + " " + node.getQuantidade() + " " + node.getValorUnitario() +"\n";
        }
        return arvore;
    }

}
