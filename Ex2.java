import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produto{
    String nomeProduto;
    String tipo;
    int codigo;
    int quantidade;
    double valorProduto;

    Produto(int codigo){
        this.codigo = codigo;
    }

    Produto(int codigo, String nomeProduto){
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
    }

    Produto(int codigo, String nomeProduto, int quantidade){
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
    }

    Produto(int codigo, String nomeProduto, int quantidade, String tipo, double valorProduto){
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valorProduto = valorProduto;
    }

    public void vender(int quantidadeVender) {
    if (quantidadeVender > quantidade) {
        System.out.println("Quantidade indisponível em estoque"); 
    } else {
        quantidade -= quantidadeVender;
        System.out.println("Venda realizada! Valor total: R$ " + (quantidadeVender * valorProduto));
    }
}

    public void comprar(int quantidadeCompra, double novoValor) {
    this.quantidade += quantidadeCompra;
    this.valorProduto = novoValor;
}

    public void comprar(int quantidadeCompra) {
    this.quantidade += quantidadeCompra;
}

    public String toString(){
        return
        "Nome do Produto: " + nomeProduto +
        ", Tipo: " + tipo +
        ", Código: " + codigo +
        ", Valor: " + valorProduto +
        ", Quantidade disponível: " + quantidade;
    }

    public void inserir(String nome, int qtd, String tipo, double valor) {
        this.nomeProduto = nome;
        this.quantidade = qtd;
        this.tipo = tipo;
        this.valorProduto = valor;
}

    public boolean igual(Produto outro) {
        if (outro == null || this.nomeProduto == null || outro.nomeProduto == null || 
            this.tipo == null || outro.tipo == null) {
            return false;
        }

        return this.nomeProduto.equals(outro.nomeProduto) && this.tipo.equals(outro.tipo);
    }
}

class principal{
    public static void main(String[] args){
    
        Scanner leitor = new Scanner(System.in);

        List<Produto> listaDeProdutos = new ArrayList<>();

        System.out.println("Construtor 1 (Código Apenas)");
        System.out.println("Digite o código: ");
        int codigo1 = leitor.nextInt();
        listaDeProdutos.add(new Produto(codigo1));

        System.out.println("Construtor 2 (Código e nome)");
        System.out.println("Digite o código e o nome: ");
        int codigo2 = leitor.nextInt();
        String nome2 = leitor.next();
        listaDeProdutos.add(new Produto(codigo2, nome2));

        System.out.println("Construtor 3 (Código, nome e quantidade)");
        System.out.println("Digite o código, o nome e a quantidade: ");
        int codigo3 = leitor.nextInt();
        String nome3 = leitor.next();
        int quantidade3 = leitor.nextInt();
        listaDeProdutos.add(new Produto(codigo3, nome3, quantidade3));

        System.out.println("Construtor 4 (Código, nome, quantidade, tipo e valor)");
        System.out.println("Digite o Código, o nome, a quantidade, o tipo e valor: ");
        int codigo4 = leitor.nextInt();
        String nome4 = leitor.next();
        int quantidade4 = leitor.nextInt();
        String tipo4 = leitor.next();
        double valor = leitor.nextDouble();
        listaDeProdutos.add(new Produto(codigo4, nome4, quantidade4, tipo4, valor));

        for (Produto i : listaDeProdutos){
            System.out.println(i);
        }

        System.out.println("--------------------------------------------------------------------");
        System.out.println("Utilizando a funcao inserir para o primeiro produto");
        System.out.println("Digite nome, quantidade, tipo e valor:");
        String nomeI = leitor.next();
        int qtdI = leitor.nextInt();
        String tipoI = leitor.next();
        double valorI = leitor.nextDouble();

        listaDeProdutos.get(0).inserir(nomeI, qtdI, tipoI, valorI);

        
        for (Produto i : listaDeProdutos){
            System.out.println(i);
        }
        
        System.out.println("--------------------------------------------------------------------");
        
for (int i = 0; i < listaDeProdutos.size(); i++) {
    Produto atual = listaDeProdutos.get(i);
    System.out.println("\n--- Operações para o Produto no índice [" + i + "]: " + atual.nomeProduto + " ---");

    System.out.println("Dados: " + atual.toString());

    System.out.print("Digite a quantidade para vender: ");
    int qVenda = leitor.nextInt();
    atual.vender(qVenda); 

    System.out.print("Digite qtd para compra e NOVO VALOR: ");
    int qCompraVal = leitor.nextInt();
    double nPreco = leitor.nextDouble();
    atual.comprar(qCompraVal, nPreco);

    System.out.print("Digite qtd para acrescentar (sem mudar valor): ");
    atual.comprar(leitor.nextInt()); 

    System.out.println("Com qual índice da lista deseja comparar o produto '" + atual.nomeProduto + "'?");
    System.out.print("Digite um índice de 0 a " + (listaDeProdutos.size() - 1) + ": ");
    int indiceComparacao = leitor.nextInt();

    if (indiceComparacao >= 0 && indiceComparacao < listaDeProdutos.size()) {
        Produto outro = listaDeProdutos.get(indiceComparacao);
        boolean resultado = atual.igual(outro);
        System.out.println("Resultado da comparação: " + resultado);
    } else {
        System.out.println("Índice inválido! Comparação pulada.");
}

    Produto outro = listaDeProdutos.get(indiceComparacao);

    boolean resultado = atual.igual(outro);
    System.out.println("Comparando [" + atual.nomeProduto + "] com [" + outro.nomeProduto + "]");
    System.out.println("Resultado: São iguais? " + resultado);
}
        
        leitor.close();
    }
}
